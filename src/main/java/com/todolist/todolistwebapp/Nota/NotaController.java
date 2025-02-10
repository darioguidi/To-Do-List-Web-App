package com.todolist.todolistwebapp.Nota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/* Respond the Request*/
@RestController
@RequestMapping(path="/note")
public class NotaController {

    private final NotaService notaService;

    @Autowired
    public NotaController(NotaService notaService) {
        this.notaService = notaService;
    }

    @GetMapping
    public List<Note> getNotes(){
        return notaService.getNotes();
    }

    @RequestMapping(path="/ciao/{name}")
    public String Hello(Map<String, Object> model, @PathVariable String name){
        model.put("name",name);
        return "home";
    }
}
