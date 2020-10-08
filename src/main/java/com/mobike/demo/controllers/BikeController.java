package com.mobike.demo.controllers;

import com.mobike.demo.models.entity.Bike;
import com.mobike.demo.models.services.IBikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

//@Controller
public class BikeController {

  @Autowired
  private IBikeService iBikeService;

//  @GetMapping("/bikes")
//  public String findAll(Model model) {
//    model.addAttribute("title", "Listado de bicicletas");
//    model.addAttribute("bikes", iBikeService.findAll());
//    return "bikes";
//  }
//
//  @GetMapping("/newBike")
//  public String getNewBike(Model model) {
//    model.addAttribute("title", "Nueva bicicleta");
//    model.addAttribute("bike", new Bike());
//    return "newBikeForm";
//  }
//
//  @PostMapping("/newBike")
//  public String postNewBike(@Valid Bike bike, BindingResult result, RedirectAttributes flash, Model model) {
//    if (result.hasErrors()) {
//      model.addAttribute("title", "Formulario de bicicleta");
//      return "newBikeForm";
//    }
//
//    String mensajeFLash = (bike.getId() != null) ? "Bicicleta Registrada" : "Bicicleta Editada";
//
//    iBikeService.save(bike);
//    flash.addFlashAttribute("success", mensajeFLash);
//    return "redirect:bikes";
//  }
//
//  @GetMapping("/newBike/{id}")
//  public String editBike(@PathVariable Long id, RedirectAttributes flash, Model model) {
//    Bike bike = new Bike();
//    if (id > 0) {
//      bike = iBikeService.findOne(id);
//      if (bike == null){
//        flash.addFlashAttribute("error", "El ID no existe en la bdd!");
//        return "redirect:/listar";
//      }
//
//    } else {
//      flash.addFlashAttribute("error", "El ID no puede ser cero!");
//      return "redirect:/listar";
//    }
//    model.addAttribute("title", "Editar bicicleta");
//    model.addAttribute("bike", bike);
//    return "newBikeForm";
//  }
//
//  @GetMapping("/delete/{id}")
//  public String delete(@PathVariable Long id, RedirectAttributes flash, Model model) {
//    if (id > 0) {
//      iBikeService.delete(id);
//      flash.addFlashAttribute("success", "Bicicleta Eliminada");
//    }
//    return "redirect:/bikes";
//  }
}
