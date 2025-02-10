package com.todolist.todolistwebapp.Nota;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name="nota")
public class Note {

    @Id
    @SequenceGenerator(
            name="note_sequence",
            sequenceName="note_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "note_sequence"
    )

    private Long id;

    private String titolo;
    private LocalDate data;  // Changed to LocalDate for better date handling
    private String autore;
    private String contenuto;

    // Constructor without id since it is auto-generated
    public Note(String titolo, LocalDate data, String autore, String contenuto) {
        this.titolo = titolo;
        this.data = data;
        this.autore = autore;
        this.contenuto = contenuto;
    }

    public Note() {}

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public String toString() {
        return "Note{" +
                "titolo='" + titolo + '\'' +
                ", data=" + data +
                ", autore='" + autore + '\'' +
                ", contenuto='" + contenuto + '\'' +
                '}';
    }
}
