package br.com.alura.screenatch.calculos;
import br.com.alura.screenatch.modelos.Filmes;
import br.com.alura.screenatch.modelos.Serie;
import br.com.alura.screenatch.modelos.Titulo;

public class CalculadoraDeTempo {
        private int tempoTotal= 0;

        public int getTempoTotal() {
            return tempoTotal;
        }

        public void inclui(Titulo titulo){
            this.tempoTotal +=titulo.getDuracaoEmMinutos();
        }

}

