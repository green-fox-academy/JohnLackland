package com.greenfoxacademy.weekendtrial.services;

import com.greenfoxacademy.weekendtrial.models.Link;
import com.greenfoxacademy.weekendtrial.repositoryes.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class URLService {

    @Autowired
    URLRepository urlRepository;

    private boolean notContains;
    private Link errorURL;

    public URLService() {
        notContains = true;
        errorURL = new Link();
    }

    public boolean getNotContains() {
        return notContains;
    }

    public void setNotContains(boolean notContains) {
        this.notContains = notContains;
    }

    public Link getErrorURL() {
        return errorURL;
    }

    public void setErrorURL(Link errorURL) {
        this.errorURL = errorURL;
    }

    public URLRepository getUrlRepository() {
        return urlRepository;
    }

    public void setUrlRepository(URLRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public boolean isNotContains() {
        return notContains;
    }

    public void isContains(Link link){
        errorURL.setAlias(link.getAlias());
        errorURL.setUrl(link.getUrl());

        List<Link> filteredList = new ArrayList<>(returnTheRepoInList().stream()
               .filter(p -> p.getAlias().equals(link.getAlias()))
               .collect(Collectors.toList()));

        if (filteredList.size() == 0 ){
           urlRepository.save(link);
           notContains = true;
        } else {
          notContains = false;
        }
    }

    public Link findByAlias(String alias){

        return returnTheRepoInList().stream()
                .filter(p -> p.getAlias().equals(alias))
                .findAny().orElse(null);
    }

    public List<Link> returnTheRepoInList(){
        List<Link> list = new ArrayList();
        urlRepository.findAll().forEach(list::add);
        return list;
    }

    public Link findById(int id){
        return returnTheRepoInList().stream()
                .filter(p -> p.getId() == id)
                .findAny().orElse(null);
    }

    public void findTheSecretCodeAndDeleteTheLink(Integer id, String code){
        if (findById(id).getSecretCode().equals(code)){
            urlRepository.deleteById(id);
        }

    }



}
