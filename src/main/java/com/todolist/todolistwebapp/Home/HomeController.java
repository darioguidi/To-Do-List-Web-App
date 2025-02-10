package com.todolist.todolistwebapp.Home;

import com.todolist.todolistwebapp.Nota.NotaService;
import com.todolist.todolistwebapp.Nota.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path="/home")
public class HomeController {

    public final NotaService notaService;

    @Autowired
    public HomeController(NotaService notaService) {
        this.notaService = notaService;
    }
/*
    @GetMapping
    public String loadHomePage(Model model){
        List<Note> notes = notaService.getNotes();
        model.addAttribute("notes", notes);
        return "home";
    }*/

    @GetMapping
    public String loadHomePage(){
        return "home";
    }
}
