package com.aiacon.trafegoclean.cidade;
/**
 * Representa uma rua (aresta) no grafo da cidade, conectando interseções.
 */
public class Rua {
    private String id;
    private String origem;
    private String destino;
    private double comprimento;
    private double tempoViagem;
    private int capacidade;
    private String direcao;

    /**
     * Construtor da rua.
     * @param id Identificador único.
     * @param origem ID da interseção de origem.
     * @param destino ID da interseção de destino.
     * @param comprimento Comprimento em metros.
     * @param capacidade Máximo de veículos suportados.
     * @param direcao Direção ("unidirecional" ou "bidirecional").
     */

    public Rua(String id, String origem, String destino, double comprimento, int capacidade, String direcao) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.comprimento = comprimento;
        this.tempoViagem = 0.0;
        this.capacidade = capacidade;
        this.direcao = direcao;
    }

    /**
     * Obtém o identificador da rua.
     * @return ID da rua.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtém a interseção de destino.
     * @return ID da interseção de destino.
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Obtém a interseção de destino.
     * @return ID da interseção de destino.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Obtém o comprimento da rua.
     * @return Comprimento em metros.
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * Obtém o tempo de travessia.
     * @return Tempo em segundos.
     */
    public double getTempoViagem() {
        return tempoViagem;
    }

    /**
     * Define o tempo de travessia.
     * @param tempoViagem Tempo em segundos.
     */
    public void setTempoViagem(double tempoViagem) {
        this.tempoViagem = tempoViagem;
    }

    /**
     * Obtém a capacidade da rua.
     * @return Máximo de veículos.
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Obtém a direção da rua.
     * @return Direção ("unidirecional" ou "bidirecional").
     */
    public String getDirecao() {
        return direcao;
    }
}
