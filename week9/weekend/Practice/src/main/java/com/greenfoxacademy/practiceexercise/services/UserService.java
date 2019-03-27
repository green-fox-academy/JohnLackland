package com.greenfoxacademy.practiceexercise.services;

import com.greenfoxacademy.practiceexercise.models.User;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private List<User> userList;
    private String errorMessage;
    boolean isSomethingWentWrong;

    public UserService() {
        userList = new ArrayList<>();
        errorMessage = "";
        isSomethingWentWrong = false;
    }

    public void saveUser(User user){
        if (!isValidPassword(user.getPassword())){
            errorMessage = "Please provide a valid password";
            isSomethingWentWrong = true;
        }else if(userList.stream() // Megnezem hogy van e mar ilyen e-mail a listaban vagy sem
                .filter(p-> p.geteMail().equals(user.geteMail()))
                .collect(Collectors.toList()).size() > 0){

            errorMessage  = "E-mail is already in use";
            isSomethingWentWrong = true;
        }else {
            userList.add(user);
            isSomethingWentWrong = false;
        }
    }

    // Ez az ami eldonti hogy latin betus-e a password, ha igen akkor true-t ad vissza
    private boolean isValidPassword(String passworld) {
        String test = Normalizer.normalize(passworld, Normalizer.Form.NFD);
        return test.matches("\\p{L}+");
    }

    public List<User> getUserList() {
        return userList;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isSomethingWentWrong() {
        return isSomethingWentWrong;
    }
}
