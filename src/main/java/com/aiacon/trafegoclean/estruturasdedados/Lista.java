package com.aiacon.trafegoclean.estruturasdedados;
/**
 * Implementa uma lista encadeada genérica para armazenar elementos.
 * @param <T> Tipo dos elementos armazenados.
 */
public class Lista<T> {
    private No<T> head;
    private int tamanho;

    /**
     * Construtor da lista encadeada.
     */
    public Lista() {
        this.head = null;
        this.tamanho = 0;
    }

    /**
     * Adiciona um elemento ao final da lista.
     * @param elemento Elemento a ser adicionado.
     */
    public void adiciona(T elemento) {
        No<T> novoNo = new No(elemento);
        if (head == null) {
            head = novoNo;
        }else{
            No<T> noAtual = head;
            while (noAtual.getProx() != null) {
                noAtual = noAtual.getProx();
            }
            noAtual.setProx(novoNo);
        }
        tamanho++;
    }

    /**
     * Obtém o elemento no índice especificado.
     * @param indice Índice do elemento.
     * @return Elemento no índice.
     * @throws IndexOutOfBoundsException Se o índice for inválido.
     */
    public T acessar(int indice){
        if (indice < 0 || indice >= tamanho) {
            throw new ArrayIndexOutOfBoundsException("Índice invalido" + indice);
        }
        No<T> noAtual = head;
        for (int i = 0; i < indice; i++) {
            noAtual = noAtual.getProx();
        }
        return noAtual.getDado();
    }

    /**
     * Retorna o tamanho da lista.
     * @return Número de elementos.
     */
    public int tamanho() {
        return tamanho;
    }

    /**
     * Obtém o nó cabeça da lista.
     * @return Nó cabeça ou null se a lista estiver vazia.
     */
    public No<T> getHead() {
        return head;
    }

}
