package com.aiacon.trafegoclean.estruturasdedados;
/**
 * Implementa uma fila de prioridade para o algoritmo de Dijkstra, ordenada por menor distância.
 */
public class FilaDePrioridades {
    private static class FilaNo{
        String intersecaoId;
        double distancia;
        FilaNo prox;

        FilaNo (String intersecaoId, double distancia) {
            this.intersecaoId = intersecaoId;
            this.distancia = distancia;
            this.prox = null;
        }
    }

    private FilaNo head;

    /**
     * Construtor da fila de prioridade.
     */
    public FilaDePrioridades () {
        head = null;
    }

    /**
     * Adiciona um elemento à fila, mantendo a ordem por distância.
     * @param intersecaoId ID da interseção.
     * @param distancia Distância associada.
     */
    public void enqueue(String intersecaoId, double distancia) {
        FilaNo novoNo = new FilaNo(intersecaoId, distancia);
        if (head == null || distancia < head.distancia) {
            novoNo.prox = head;
            head = novoNo;
        } else {
            FilaNo atual = head;
            while (atual.prox != null && atual.prox.distancia <= distancia) {
                atual = atual.prox;
            }
            novoNo.prox = atual.prox;
            atual.prox = novoNo;
        }
    }

    /**
     * Remove e retorna o elemento com menor distância.
     * @return ID da interseção ou null se a fila estiver vazia.
     */
    public String dequeue() {
        if (head == null) {
            return null;
        }
        String intersecaoId = head.intersecaoId;
        head = head.prox;
        return intersecaoId;
    }
    /**
     * Verifica se a fila está vazia.
     * @return true se vazia, false caso contrário.
     */
    public boolean isEmpty() {
        return head == null;
    }
    /**
     * Atualiza a prioridade de um elemento na fila.
     * @param intersecaoId ID da interseção.
     * @param novaDistancia Nova distância.
     */
    public void atualizarPrioridade (String intersecaoId, double novaDistancia) {
        FilaNo ant = null;
        FilaNo atual = head;

        while (atual != null && !atual.intersecaoId.equals(intersecaoId)) {
            ant = atual;
            atual = atual.prox;
        }
        if (atual != null) {
            if (ant == null) {
                head = atual.prox;
            } else {
            ant.prox = atual.prox;
            }
        }
        enqueue(intersecaoId, novaDistancia);
    }
}
