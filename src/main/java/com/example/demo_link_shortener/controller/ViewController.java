package com.example.demo_link_shortener.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping ("/view")
public class ViewController {


  @GetMapping("/hello")
  public String handle(Model model, @RequestParam String name){
      model.addAttribute("name",name);
      return "hello";
  }
}
