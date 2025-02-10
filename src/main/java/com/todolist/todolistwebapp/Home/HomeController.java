package com.todolist.todolistwebapp.Home;

import com.todolist.todolistwebapp.Nota.NotaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path="/home")
public class HomeController {

    public final NotaService notaService;

    @Autowired
    public HomeController(NotaService notaService) {
        this.notaService = notaService;
    }

    @GetMapping
    public String loadHomePage(){
        return "home";
    }
}
