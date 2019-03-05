package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.BankAccount;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
    private BankAccount bankAccount = new BankAccount("Simba", 2000.00, "lion");
    private List<BankAccount> bankAccountList;

    public MainController(){
        bankAccountList = Arrays.asList(bankAccount,
                                        new BankAccount("Pumba", 4000.00, "boar"),
                                        new BankAccount("Timon", 6660.00, "animal"),
                                        new BankAccount("Mufase", 4232.00, "halo"));
    }

    @GetMapping("/show")
    public String showBankAccount(Model model){
        model.addAttribute("account", bankAccount);
        return "index";
    }

    @GetMapping("/raw")
    public String showString(Model model){
        model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "raw";
    }

    @GetMapping("/oneElement")
    public String showOneElement(Model model){
        model.addAttribute("bankAccountList", bankAccountList);
        return "oneElement";
    }
}
