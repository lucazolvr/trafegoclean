package com.aiacon.trafegoclean.cidade;
import com.aiacon.trafegoclean.estruturasdedados.Lista;

/**
 * Interface para a estrutura de grafo da cidade.
 */
public interface Grafo {
    /**
     * Adiciona uma interseção ao grafo.
     * @param intersecao Interseção a ser adicionada.
     */
    void adicionarIntersecao(Intersecao intersecao);

    /**
     * Adiciona uma rua ao grafo.
     * @param rua Rua a ser adicionada.
     */
    void adicionarRua(Rua rua);

    /**
     * Obtém as ruas vizinhas de uma interseção.
     * @param intersecaoId ID da interseção.
     * @return Lista de ruas vizinhas.
     */
    Lista<Rua> getVizinhos(String intersecaoId);

    /**
     * Obtém uma interseção pelo ID.
     * @param id ID da interseção.
     * @return Interseção ou null se não encontrada.
     */
    Intersecao getIntersecao(String id);

    /**
     * Obtém todas as interseções do grafo.
     * @return Lista de interseções.
     */
    Lista<Intersecao> getIntersecoes();

    /**
     * Obtém todas as ruas do grafo.
     * @return Lista de ruas.
     */
    Lista<Rua> getRuas();
}
