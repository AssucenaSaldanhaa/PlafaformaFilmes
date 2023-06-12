package br.com.alura.screenatch.modelos;

public class Serie extends Titulo {

    private int temporada;
    private boolean ativo;
    private int episodioPorTemporada;
    private int minutoPorEpsodio;


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutoPorEpsodio() {
        return minutoPorEpsodio;
    }

    public void setMinutoPorEpsodio(int minutoPorEpsodio) {
        this.minutoPorEpsodio = minutoPorEpsodio;
    }

    @Override
    public int getDuracaoEmMinutos() {

        System.out.println(temporada +" "+ minutoPorEpsodio +" "+ episodioPorTemporada);
        return temporada * minutoPorEpsodio * episodioPorTemporada;
    }
}
