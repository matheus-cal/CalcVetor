package controller;

import java.util.Random;

public class calculatorController extends Thread {
	
	private int m[][];
	
	public calculatorController(int m[][]) {
		this.m = m;
	}
	
	@Override
	public void run() {
		calc();
	}
	
	private void calc() {
		for(int i = 0 ; i < 3 ; i++) {
			int sum = 0;
			for(int k = 0 ; k < 5 ; k++) {
				Random generator = new Random();
				m[i][k] = generator.nextInt(100);
				sum += m[i][k];
			}
			System.out.println("Linha " + i + " = " + sum);		
		}
	}
}
