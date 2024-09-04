package com.tobias.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HolaMundoController {
    /// "/Hola" es la dirección https
    @GetMapping("/Hola")
    public String holaMundo()
    {return "Hola mundo desde SpringBoot";}

    @GetMapping("/Chau")
    public String chauMundo()
    {return "Chau";}

    @GetMapping("/HolaMundo")
    public String HolaMundo(Model model)
    {
        model.addAttribute("nombre", "UTN");
        return "hola";
    }
}
