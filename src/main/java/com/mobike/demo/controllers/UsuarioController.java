package com.mobike.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UsuarioController {

  @GetMapping({"/", "/home"})
  public String list(Model model) {
    return "userHome";
  }

  @GetMapping("/editar")
  public String edit() { return "userEdit"; }

//  @GetMapping("/agregar")
//  public String create() {
//    return "arrendarBicicleta";
//  }

//  @GetMapping("/delete")
//  public String delete() {
//    return "newUserForm";
//  }

}
