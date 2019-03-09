package com.greenfoxacademy.foxclub.Controllers;

import com.greenfoxacademy.foxclub.Model.Fox;
import com.greenfoxacademy.foxclub.Model.FoxList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    FoxList foxList = new FoxList();
    List<Fox> foxes = new ArrayList<>();

   /* MainController(){
        this.foxList = new FoxList();
    }*/

    @GetMapping("/")
    public String getIndexPage(Model model, @RequestParam(required = false, defaultValue = "Fox") String name) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(Model model, @RequestParam(required = false, value = "name") String name, @RequestParam(required = false, value = "newAccount") String newAccount) {

        if (newAccount != null) {
            foxList.addFox(newAccount);
            System.out.println(newAccount);
            return "redirect:/login";
        }

        if (name.equals("")) {
            return "redirect:/login";
        } else if (foxList.isItIn(name)) {
            return "redirect:/?name=" + name;
        } else {
            if (!foxList.isItIn(name))
                model.addAttribute("isItIn", true);
            return "login";
        }
    }
}
