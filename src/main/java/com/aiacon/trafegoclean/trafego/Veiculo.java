package com.aiacon.trafegoclean.trafego;

import com.aiacon.trafegoclean.cidade.Intersecao;
import com.aiacon.trafegoclean.estruturasdedados.Lista;

/**
 * Representa um veículo no sistema de tráfego.
 */
public class Veiculo {
    private String id;
    private Intersecao origem;
    private Intersecao destino;
    private Lista<Intersecao> rota;
    private double tempoEspera;
    private double consumoEnergia;

    /**
     * Construtor do veículo.
     * @param id Identificador único.
     * @param origem Interseção de origem.
     * @param destino Interseção de destino.
     */

    public Veiculo(String id, Intersecao origem, Intersecao destino) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.rota = new Lista<>();
        this.tempoEspera = 0.0;
        this.consumoEnergia = 0.0;
    }

    /**
     * Obtém o identificador do veículo.
     * @return ID do veículo.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtém a interseção de origem.
     * @return Interseção de origem.
     */
    public Intersecao getOrigem() {
        return origem;
    }

    /**
     * Obtém a interseção de destino.
     * @return Interseção de destino.
     */
    public Intersecao getDestino() {
        return destino;
    }

    /**
     * Obtém a rota do veículo.
     * @return Lista de interseções da rota.
     */
    public Lista<Intersecao> getRota() {
        return rota;
    }

    /**
     * Define a rota do veículo.
     * @param rota Nova rota.
     */
    public void setRota(Lista<Intersecao> rota) {
        this.rota = rota;
    }

    /**
     * Adiciona tempo de espera ao veículo.
     * @param tempo Tempo em segundos.
     */
    public void adicionarTempoEspera(double tempo) {
        this.tempoEspera += tempo;
    }

    /**
     * Obtém o tempo total de espera.
     * @return Tempo de espera em segundos.
     */
    public double getTempoEspera() {
        return tempoEspera;
    }

    /**
     * Adiciona consumo de energia ao veículo.
     * @param energia Consumo em unidades arbitrárias.
     */
    public void adicionarConsumoEnergia(double energia) {
        this.consumoEnergia += energia;
    }

    /**
     * Obtém o consumo total de energia.
     * @return Consumo de energia.
     */
    public double getConsumoEnergia() {
        return consumoEnergia;
    }
}
