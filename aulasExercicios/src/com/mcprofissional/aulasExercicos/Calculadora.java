package com.mcprofissional.aulasExercicos;

import javax.swing.JOptionPane;

public class Calculadora {

	protected double num1, num2;

	public Calculadora() {
	}

	protected double soma() {
		num1 = Double.valueOf(JOptionPane.showInputDialog("Insira o Primeiro numero:"));
		num2 = Double.valueOf(JOptionPane.showInputDialog("Insira o segundo numero:"));
		return (num1 + num2);
	}

	protected double subtrair() {
		num1 = Double.valueOf(JOptionPane.showInputDialog("Insira o Primeiro numero:"));
		num2 = Double.valueOf(JOptionPane.showInputDialog("Insira o segundo numero:"));
		return (num1 - num2);
	}

	protected double multiplica() {
		num1 = Double.valueOf(JOptionPane.showInputDialog("Insira o Primeiro numero:"));
		num2 = Double.valueOf(JOptionPane.showInputDialog("Insira o segundo numero:"));
		return (num1 * num2);
	}

	protected double divisao() {

		num1 = Double.valueOf(JOptionPane.showInputDialog("Insira o Primeiro numero:"));
		num2 = Double.valueOf(JOptionPane.showInputDialog("Insira o segundo numero:"));

		if (num2 != 0) {
			return (num1 / num2);
		} else {
			return 0;
		}
	}

}
