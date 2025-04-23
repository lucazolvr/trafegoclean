package com.aiacon.trafegoclean.cidade;

import com.aiacon.trafegoclean.estruturasdedados.Lista;

/**
 * Representa os dados do grafo lidos do arquivo JSON.
 */
public class GrafoDados {
    private Lista<Intersecao> nos;
    private Lista<Rua> arestas;

    /**
     * Construtor dos dados do grafo.
     */

    public GrafoDados() {
        this.nos = new Lista<>();
        this.arestas = new Lista<>();
    }

    /**
     * Adiciona uma interseção aos dados.
     * @param no Interseção a ser adicionada.
     */
    public void addNo(Intersecao no) {
        nos.adicionar(no);
    }

    /**
     * Adiciona uma rua aos dados.
     * @param aresta Rua a ser adicionada.
     */
    public void addAresta(Rua aresta) {
        arestas.adicionar(aresta);
    }

    /**
     * Obtém as interseções.
     * @return Lista de interseções.
     */
    public Lista<Intersecao> getNos() {
        return nos;
    }

    /**
     * Obtém as ruas.
     * @return Lista de ruas.
     */
    public Lista<Rua> getArestas() {
        return arestas;
    }
}
