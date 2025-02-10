package com.todolist.todolistwebapp.Nota;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class NotaConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(NotaRepository repository) {
        return args -> {
            // Create notes with LocalDate for date handling
            Note notaDario = new Note(
                    "Ciao",
                    LocalDate.of(1111, 1, 1), // Using LocalDate instead of String
                    "Dario",
                    "piero"
            );
            Note notaSimone = new Note(
                    "Ciao",
                    LocalDate.of(1111, 1, 1), // Using LocalDate instead of String
                    "Simone",
                    "piero"
            );

            // Save notes into the repository (id is auto-generated)
            repository.saveAll(List.of(notaDario, notaSimone));
        };
    }
}
