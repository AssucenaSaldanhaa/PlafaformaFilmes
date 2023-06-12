import br.com.alura.screenatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenatch.modelos.Episodios;
import br.com.alura.screenatch.modelos.Filmes;
import br.com.alura.screenatch.modelos.Serie;
import br.com.alura.screenatch.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filmes meuFilme = new Filmes();
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setNome("Crepusculo");
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("O total de avaliações é:" + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setMinutoPorEpsodio(10);
        lost.setDuracaoEmMinutos(90);
        lost.setTemporada(5);
        lost.setEpisodioPorTemporada(100);

        System.out.println("O tempo para maratonar é: " + lost.getDuracaoEmMinutos());

        Filmes outroFilme= new Filmes();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtrar(meuFilme);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacao(300);
        filtro.filtrar(episodio);


        var filmeDaAssucena = new Filmes();
        filmeDaAssucena.setDuracaoEmMinutos(200);
        filmeDaAssucena.setAnoDeLancamento(2003);
        filmeDaAssucena.avalia(10);



        ArrayList<Filmes> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaAssucena);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista" + listaDeFilmes.size());
        System.out.println("Primeiro filme" + listaDeFilmes.get(0).getNome());


    }
}