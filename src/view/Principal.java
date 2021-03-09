package view;

import controller.calculatorController;


public class Principal {
	
	public static void main(String[] args) {
	
		int m[][] = new int [3][5];
		
		for (int i = 0 ; i < 3 ; i++) {
			Thread calc = new calculatorController(m);
			calc.start();
		}
	}
}
