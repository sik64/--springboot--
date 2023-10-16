package com.example.demo12.controller;

import com.example.demo12.dto.ItemDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping(value = "/test")
    public String test() {
        System.out.println("test init");
        return "/test";
    }

    @GetMapping(value = "/info")
    public String info() {
        System.out.println("info init");
        return "/info";
    }

    @GetMapping(value = "/data")
    public String data() {
        System.out.println("data init");
        return "/data";
    }

    @GetMapping(value = "/param1")
    public String param1(@RequestParam("name") String name, Model model) {
        model.addAttribute("data","데이터");
        model.addAttribute("name",name);
        System.out.println("param1 init");
        return "/param1";
    }
    @GetMapping(value = "/data3")
    public String data3() {
        System.out.println("data3 init");
        return "/data3";
    }
    @GetMapping(value = "/param3")
    public String param3(@RequestParam(value = "name1",required=true) String name1,
                         @RequestParam("name2") String name2,
                         @RequestParam("name3") String name3,
                         Model model) {
        model.addAttribute("data","데이터");
        model.addAttribute("name1",name1);
        model.addAttribute("name2",name2);
        model.addAttribute("name3",name3);
        System.out.println("param3 init");
        return "/param3";
    }

    @GetMapping(value = "/data6")
    public String data6() {
        System.out.println("data6 init");
        return "/data6";
    }
    @GetMapping(value = "/param6")
    public String param6(ItemDTO itemDTO, Model model) {
        model.addAttribute("itemname", itemDTO.getItemname());
        model.addAttribute("itemprice",itemDTO.getItemprice());
        System.out.println("param6 init");
        return "/param6";
    }
}
