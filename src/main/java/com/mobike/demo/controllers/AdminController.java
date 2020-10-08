package com.mobike.demo.controllers;

import com.mobike.demo.models.entity.Bike;
import com.mobike.demo.models.entity.Usuario;
import com.mobike.demo.models.services.IBikeService;
import com.mobike.demo.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("admin")
public class AdminController {

  @Autowired
  private IUsuarioService iUsuarioService;
  @Autowired
  private IBikeService iBikeService;

  @GetMapping({"/", "/home"})
  public String home(Model model) {
    model.addAttribute("title", "HOME");
    return "adminHome";
  }

  @GetMapping("/users")
  public String userslist(Model model) {
    model.addAttribute("title", "USUARIOS");
    model.addAttribute("users", iUsuarioService.findAll());
    System.out.println(iUsuarioService.findAll());
    return "users";
  }

  @GetMapping("/bikes")
  public String bikeslist(Model model) {
    model.addAttribute("title", "BICICLETAS");
    model.addAttribute("bikes", iBikeService.findAll());
    System.out.println(iBikeService.findAll());
    return "bikes";
  }

  @GetMapping("/newUser")
  public String edit(Model model) {
    model.addAttribute("title", "NUEVO USUARIO");
    Usuario usuario = new Usuario();
    model.addAttribute("usuario", usuario);
    return "newUserForm";
  }

  @PostMapping("/newUser")
  public String postNewUser(@Valid Usuario usuario, BindingResult result, RedirectAttributes flash, Model model) {
    if (result.hasErrors()) {
      model.addAttribute("title", "NUEVO USUARIO *");
      return "newUserForm";
    }
    String mensajeFlash = (usuario.getId() != null) ? "Usuario Registrado" : "Usuario modificado";

    iUsuarioService.save(usuario);
    flash.addFlashAttribute("success", mensajeFlash);
    return "redirect:/admin/users";
  }



    @GetMapping("/newBike")
  public String getNewBike(Model model) {
    model.addAttribute("title", "NUEVA BICICLETA");
    model.addAttribute("bike", new Bike());
    return "newBikeForm";
  }

  @PostMapping("/newBike")
  public String postNewBike(@Valid Bike bike, BindingResult result, RedirectAttributes flash, Model model) {
    if (result.hasErrors()) {
      model.addAttribute("title", "NUEVA BICICLETA *");
      return "newBikeForm";
    }
    String mensajeFLash = (bike.getId() != null) ? "Bicicleta Registrada" : "Bicicleta Editada";

    iBikeService.save(bike);
    flash.addFlashAttribute("success", mensajeFLash);
    return "redirect:/admin/bikes";
  }

//  @GetMapping("/bikes")
//  public String create() {
//    return "arrendarBicicleta";
//  }

//  @GetMapping("/delete")
//  public String delete() {
//    return "newUserForm";
//  }

}
