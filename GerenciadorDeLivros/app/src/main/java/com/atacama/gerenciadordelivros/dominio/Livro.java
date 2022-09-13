package com.atacama.gerenciadordelivros.dominio;

import java.io.Serializable;

public class Livro implements Serializable {
    private long id;
    private String titulo;
    private String autor;
    private String editora;
    private int emprestar;

    public Livro(long id, String titulo, String autor, String editora, int emprestar) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.emprestar = emprestar;
    }

    public Livro(String titulo, String autor, String editora, int emprestar) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.emprestar = emprestar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEmprestar() {
        return emprestar;
    }

    public void setEmprestar(int emprestar) {
        this.emprestar = emprestar;
    }
}
