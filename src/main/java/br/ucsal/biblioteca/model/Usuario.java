package br.ucsal.biblioteca.model;

import annotations.NameLength;

public class Usuario {

    private static Integer contadorId = 1;

    private int id;

    @NameLength
    private String nome;

    public Usuario(String nome) {
        this.id = contadorId++;
        this.nome = nome;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

}
