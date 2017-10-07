package com.mcprofissional.listasGenericas;

public class Lista<T> {

	protected T[] elementos;
	protected int tamanho;

	public Lista() {
		this(10);
	}

	@SuppressWarnings("unchecked")
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	protected boolean adiciona(T elemento) {
		if (this.elementos.length > this.tamanho) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	protected boolean adiciona(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}

	protected int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	protected T busca(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		return this.elementos[posicao];
	}

	public boolean estaVazia() {
		return (this.tamanho == 0);
	}

	public int tamanho() {
		return this.tamanho;
	}

	protected void remove(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		for (int i = posicao; i <= this.tamanho; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	protected void remove(int posicao, T elemento) {
		this.remove(this.busca(elemento));
	}

	public String toString() {
		StringBuilder insere = new StringBuilder();
		insere.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			insere.append(this.elementos[i]);
			insere.append(", ");
		}
		if (this.tamanho > 0) {
			insere.append(this.elementos[this.tamanho - 1]);
		}
		insere.append("]");
		return insere.toString();
	}

}
