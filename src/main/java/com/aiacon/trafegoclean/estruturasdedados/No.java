package com.aiacon.trafegoclean.estruturasdedados;

public class No<T> {
    private T dado;
    private No<T> prox;

    /**
     * Construtor do nó.
     * @param dado Dado a ser armazenado.
     */
    public No(T dado) {
        this.dado = dado;
        this.prox = null;
    }

    /**
     * Obtém o dado armazenado.
     * @return Dado do nó.
     */
    public T getDado() {
        return dado;
    }

    /**
     * Define o dado do nó.
     * @param dado Novo dado.
     */
    public void setDado(T dado) {
        this.dado = dado;
    }

    /**
     * Obtém o próximo nó.
     * @return Próximo nó ou null se não houver.
     */
    public No<T> getProx() {
        return prox;
    }

    /**
     * Define o próximo nó.
     * @param prox Próximo nó.
     */
    public void setProx(No<T> prox) {
        this.prox = prox;
    }
}
