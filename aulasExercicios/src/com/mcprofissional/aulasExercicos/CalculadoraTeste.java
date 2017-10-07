package com.mcprofissional.aulasExercicos;

import javax.swing.JOptionPane;

public class CalculadoraTeste {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		int opcao = Integer.valueOf(JOptionPane.showInputDialog(
				"Escolha a operacao:" + "\n1. Para Soma\n2. Para Subtracao\n3. Para Multiplicacao\n4. Para Divisao"));

		if (opcao == 1) {
			JOptionPane.showMessageDialog(null, "O resultado e: " + calculadora.soma());
		}

		else if (opcao == 2) {
			JOptionPane.showMessageDialog(null, "O resultado e: " + calculadora.subtrair());
		}

		else if (opcao == 3) {
			if (calculadora.multiplica() == 0) {
				JOptionPane.showMessageDialog(null, "O zero e um elemento absorvente");
			} else {
				JOptionPane.showMessageDialog(null, "O resultado e: " + calculadora.multiplica());
			}
		}

		else if (opcao == 4) {
				JOptionPane.showMessageDialog(null, "O resultado e: " + calculadora.divisao());
		}

		else {
			JOptionPane.showMessageDialog(null, "Opcao invalida, por favor tente novamente!");
		}
	}

}
