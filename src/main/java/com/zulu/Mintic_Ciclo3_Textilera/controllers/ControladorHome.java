package com.zulu.Mintic_Ciclo3_Textilera.controllers;

import com.zulu.Mintic_Ciclo3_Textilera.entities.User;
import com.zulu.Mintic_Ciclo3_Textilera.services.MovimientoServicio;
import com.zulu.Mintic_Ciclo3_Textilera.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Controller for the home page.
 */
@Controller
public class ControladorHome {
    UserService userService;

    public ControladorHome(UserService userService) {
        this.userService = userService;
    }

   @GetMapping("/")
   public String home(Model model, @AuthenticationPrincipal OidcUser principal) {

       if (principal != null) {
           User user = this.userService.getOrCreateUser(principal.getClaims());
           model.addAttribute("user", user);
       }
       return "indexlp";
   }

    @GetMapping("/inicio")
    public String showTaskList() {
        return "index2";
    }

    @GetMapping("/inicio/movementss")
    public String showTaskList2() {
        return "movements";
    }

    @GetMapping("/inicio/employess")
    public String showTaskList3() {
        return "employes";
    }

    @GetMapping("/inicio/enterprisess")
    public String showTaskList4() {
        return "enterprises";
    }

    /*@GetMapping("/delmovements/{id}")
    public String eliminarEmpleado(@PathVariable Long id, RedirectAttributes redirectAttributes){
        if (movimientoServicio.deleteMovimientoDinero(id)){
            redirectAttributes.addFlashAttribute("mensaje","deleteOK");
            return "redirect:/movements";
        }
        redirectAttributes.addFlashAttribute("mensaje", "deleteError");
        return "redirect:/VerEmpleados";
    }*/


}