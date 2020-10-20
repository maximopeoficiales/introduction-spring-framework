package com.example.holamundo;

import java.util.ArrayList;

import com.example.domain.Persona;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// import lombok.extern.slf4j.Slf4j;

@Controller
// @Slf4j
public class HolaMundoController {
     @Value("${index.saludo}") // obtengo las variables de application.properties
     private String saludo;

     @GetMapping("/")
     public String home(Model model) {
          // log.info("Mostrando pagina de inicio");
          Persona persona = new Persona();
          persona.setNombre("Maximo");
          persona.setApellido("Apaza");
          persona.setEmail("maximopeoficiales@gmail.com");
          persona.setTelefono("8099544");
          // Persona 2
          Persona persona2 = new Persona();
          persona2.setNombre("Mayrin");
          persona2.setApellido("Apaza");
          persona2.setEmail("maximopeoficiales1@gmail.com");
          persona2.setTelefono("8136666");
          // lista de personas
          // List<Persona> personas = Arrays.asList(persona, persona2);
          ArrayList<Persona> personas = new ArrayList<Persona>();
          String mensaje = "Mensaje desde Backend";// se puede declarar como var en la version 10
          model.addAttribute("mensaje", mensaje);
          model.addAttribute("saludo", saludo);
          // model.addAttribute("persona", persona);
          model.addAttribute("personas", personas);
          return "index";
     }
}
