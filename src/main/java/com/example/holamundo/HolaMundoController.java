package com.example.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j //con esta notacion puedo depurar
public class HolaMundoController {
     @GetMapping("/")
     public String home() {
          log.info("hola desde backend");
          return "Hola mundo con Spring 2";
     }
}
