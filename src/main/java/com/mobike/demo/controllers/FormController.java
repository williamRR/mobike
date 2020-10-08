package com.mobike.demo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class FormController {

//  @GetMapping("/register")
//  public String registerForm(Model model) {
//
//    model.addAttribute(new Usuario());
//    return "registerForm";
//  }
//
//  @PostMapping("/register")
//  public String processRegisterForm(@Valid Usuario user, BindingResult result, Model model) {
//    if (result.hasErrors()) {
//      Map<String, String> errors = new HashMap<>();
//      result.getFieldErrors().forEach(error -> {
//        errors.put(error.getField(), "EL campo".concat(error.getField()).concat(" ").concat(error.getDefaultMessage()));
//      });
//      model.addAttribute("error", errors);
//      return "registerForm";
//    }
//    model.addAttribute(user);
//    return "registerForm";
//  }
}
