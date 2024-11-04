package com.del_dev.planeta_limpo.controlles;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/")
public class ControllerRaiz {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
    }

}
