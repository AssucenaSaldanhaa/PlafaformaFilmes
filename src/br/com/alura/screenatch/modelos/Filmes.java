package br.com.alura.screenatch.modelos;

import br.com.alura.screenatch.calculos.Classificavel;

public class Filmes extends Titulo implements Classificavel {
    String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificavel() {
        return (int) pegaMedia()/2;
    }

    public String getNome() {

        return null;
    }}


