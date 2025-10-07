package oit.is.group7.calculation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Sample21Controller {
  @GetMapping("/sample21")
  public String sample21() {
    return "sample21";
  }

  @GetMapping("/sample22/{param1}/{param2}")
  public String sample22(@PathVariable String param1, @PathVariable String param2, ModelMap model) {
    int a = Integer.parseInt(param1);
    int b = Integer.parseInt(param2);
    int sum = a + b;
    model.addAttribute("sum", sum);
    return "sample21.html";
  }
}
