package com.todolist.todolistwebapp.Nota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* Logic */
@Service
public class NotaService {

    private final NotaRepository notaRepository;

    @Autowired
    public NotaService(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }

    public List<Note> getNotes(){
        return notaRepository.findAll();
    }

}
