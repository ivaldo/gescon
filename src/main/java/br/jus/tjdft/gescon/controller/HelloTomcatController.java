package br.jus.tjdft.gescon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTomcatController {

    @RequestMapping("hello")
    public String sayHello(){
        return "Hello, SpringBoot on Tomcat";
    }
    
}