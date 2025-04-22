package com.aiacon.trafegoclean.cidade;

import com.aiacon.trafegoclean.semaforo.Semaforo;

/**
 * Representa uma interseção no mapa da cidade, ponto onde ruas se encontram.
 */
public class Intersecao {
    private String id;
    private double latitude;
    private double longitude;
    private Semaforo semaforo;

    /**
     * Construtor da interseção.
     * @param id Identificador único.
     * @param latitude Coordenada latitude.
     * @param longitude Coordenada longitude.
     */
    public Intersecao(String id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.semaforo = null;
    }

    /**
     * Obtém o identificador da interseção.
     * @return ID da interseção.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtém a latitude.
     * @return Latitude da interseção.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Obtém a longitude.
     * @return Longitude da interseção.
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Obtém o semáforo associado.
     * @return Semáforo ou null se não houver.
     */
    public Semaforo getSemaforo() {
        return semaforo;
    }

    /**
     * Define o semáforo da interseção.
     * @param semaforo Semáforo a ser associado.
     */
    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }
}