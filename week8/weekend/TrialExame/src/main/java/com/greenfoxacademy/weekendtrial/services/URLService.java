package com.greenfoxacademy.weekendtrial.services;

import com.greenfoxacademy.weekendtrial.models.URLClass;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class URLService {

    private List<URLClass> urlList;
    private boolean notContains;
    private URLClass errorURL;

    public URLService() {
        this.urlList = new ArrayList<>();
        notContains = true;
        errorURL = new URLClass();
    }

    public List<URLClass> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<URLClass> urlList) {
        this.urlList = urlList;
    }

    public boolean getNotContains() {
        return notContains;
    }

    public void setNotContains(boolean notContains) {
        this.notContains = notContains;
    }

    public URLClass getErrorURL() {
        return errorURL;
    }

    public void setErrorURL(URLClass errorURL) {
        this.errorURL = errorURL;
    }

    public boolean isContains(URLClass url){
        List<URLClass> helpingList = new ArrayList<>(urlList.stream()
                .filter(p -> p.getAlias().equals(url.getAlias()))
                .collect(Collectors.toList()));

        errorURL.setAlias(url.getAlias());
        errorURL.setUrl(url.getUrl());

        if (helpingList.size() == 0){

            urlList.add(url);
            notContains = true;
            return notContains;
        } else {
            notContains = false;
            return notContains;
        }
    }

}
