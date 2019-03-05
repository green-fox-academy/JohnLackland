package com.greenfoxacademy.springstart.controillers;

import com.greenfoxacademy.springstart.models.ShopItems;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {
private List<ShopItems> itemList = Arrays.asList(new ShopItems("Box of shit", "A box of shit", 1000, 10),
                                         new ShopItems("Goat", "A goat", 20000, 12),
                                         new ShopItems("Laptop", "Laptop which is not working", 2000, 0),
                                         new ShopItems("Valami ", " nem tudom ", 5000,10),
                                         new ShopItems("szemuveg", "szemuveg.", 4000,5));


    @RequestMapping("/webshop")
    public String base(Model model){
        model.addAttribute("itemList", itemList);
        return "firstPage";
    }

    @RequestMapping("/only-availabel")
    public String onlyAvailable(Model model){
        model.addAttribute("itemList", itemList.stream()
            .filter(p -> p.getQuantity() > 0)
            .collect(Collectors.toList()));
        return "firstPage";
    }

    @RequestMapping("/cheapestFirst")
    public String cheapestFirst(Model model){
        model.addAttribute("itemList", itemList.stream().sorted(Comparator.comparing(ShopItems::getPrice)).collect(Collectors.toList()));

        return "firstPage";
    }

    @RequestMapping("/contains")
    public String contains(Model model){
        model.addAttribute("itemList", itemList.stream()
                .filter(p -> p.getName().equals("Laptop") || p.getName().equals("Laptop"))
                .collect(Collectors.toList()));
        return "firstPage";
    }

    @RequestMapping("/avarage")
    public String avarage(Model model){
        model.addAttribute("avarage", "Avarage stock:" + itemList.stream()
                .mapToDouble(ShopItems::getQuantity).summaryStatistics().getAverage());
        return "avarage";
    }

    @RequestMapping("/max")
    public String getMax(Model model){
        model.addAttribute("avarage", "The most expensive thing in the shop:" + itemList.stream()
                .sorted(Comparator.comparing(ShopItems::getPrice)
                .reversed()).limit(1).collect(Collectors.toList()).get(0).getName());
        return "avarage";
    }

    @RequestMapping("/search")
    public String findThis(Model model,  @RequestParam("barmi") String barmi){
        model.addAttribute("itemList", itemList.stream().filter(p -> p.getName().toLowerCase().contains(barmi.toLowerCase()) ||
                p.getDescription().toLowerCase().contains(barmi.toLowerCase()))
                .collect(Collectors.toList()));
        return "firstPage";
    }
}
