package com.mobike.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  @GetMapping({"/", "", "/home"})
  public String index(Model model) {
    model.addAttribute("title", "MOBIKE");
    return "home";
  }
//  @GetMapping("/perfil")
//  public String perfil(Model model) {
//    return "perfil";
//  }
//
//  @GetMapping("/listar")
//  public String listar(Model model) {
//    model.addAttribute("title", "Lista de usuarios");
//    return "listarUsuarios";
//  }
//
//  @ModelAttribute("usuarios")
//  public List<Usuario> poblarUsuarios() {
//    List<Usuario> usuarios = new ArrayList<>();
//
//    return usuarios;
//  }
}
