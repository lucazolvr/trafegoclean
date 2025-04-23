package com.aiacon.trafegoclean.cidade;

import com.aiacon.trafegoclean.estruturasdedados.Lista;
import com.aiacon.trafegoclean.estruturasdedados.No;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Representa o mapa da cidade como um grafo de interseções e ruas.
 */
public class Mapa implements Grafo {
    private Lista<Intersecao> intersecoes;
    private Lista<Rua> ruas;

    /**
     * Construtor do mapa.
     */
    public Mapa() {
        this.intersecoes = new Lista<>();
        this.ruas = new Lista<>();
    }

    /**
     * Carrega o grafo a partir de um arquivo JSON.
     * @param filePath Caminho do arquivo JSON.
     * @throws IOException Se houver erro na leitura do arquivo.
     */
    public void loadFromJson(String filePath) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        GrafoDados grafoDados = mapper.readValue(new File(filePath), GrafoDados.class);

        No<Intersecao> no = grafoDados.getNos().getHead();
        while (no != null) {
            intersecoes.adicionar(no.getDado());
            no = no.getProx();
        }

        No<Rua> aresta = grafoDados.getArestas().getHead();
        while (aresta != null) {
            ruas.adicionar(aresta.getDado());
            aresta = aresta.getProx();
        }
    }

    @Override
    public void adicionarIntersecao(Intersecao intersecao) {
        intersecoes.adicionar(intersecao);
    }

    @Override
    public void adicionarRua(Rua rua) {
        ruas.adicionar(rua);
    }

    @Override
    public Lista<Rua> getVizinhos(String intersecaoId) {
        Lista<Rua> vizinhos = new Lista<>();
        No<Rua> atual = ruas.getHead();
        while (atual != null) {
            if (atual.getDado().getOrigem().equals(intersecaoId)) {
                vizinhos.adicionar(atual.getDado());
            }
            atual = atual.getProx();
        }
        return vizinhos;
    }

    @Override
    public Intersecao getIntersecao(String id) {
        No<Intersecao> atual = intersecoes.getHead();
        while (atual != null) {
            if (atual.getDado().getId().equals(id)) {
                return atual.getDado();
            }
            atual = atual.getProx();
        }
        return null;
    }

    @Override
    public Lista<Intersecao> getIntersecoes() {
        return intersecoes;
    }

    @Override
    public Lista<Rua> getRuas() {
        return ruas;
    }

}
