package com.aiacon.trafegoclean.estruturasdedados;
/**
 * Implementa uma pilha genérica para armazenar elementos em ordem LIFO.
 * @param <T> Tipo dos elementos armazenados.
 */
public class Pilha <T>{
    private No<T> topo;
    private int tamanho;

    /**
     * Construtor da pilha.
     */
    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }
    /**
     * Adiciona um elemento ao topo da pilha.
     * @param dado Elemento a ser adicionado.
     */
    public void push(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.setProx(topo);
        topo = novoNo;
        tamanho++;
    }

    /**
     * Remove e retorna o elemento do topo.
     * @return Elemento do topo ou null se vazia.
     */
    public T pop() {
        if (topo == null) {
            return null;
        }
        T dado = topo.getDado();
        topo = topo.getProx();
        tamanho--;
        return dado;
    }

    /**
     * Verifica se a pilha está vazia.
     * @return true se vazia, false caso contrário.
     */
    public boolean isEmpty() {
        return topo == null;
    }

    /**
     * Retorna o tamanho da pilha.
     * @return Número de elementos.
     */
    public int tamanho() {
        return tamanho;
    }
}
