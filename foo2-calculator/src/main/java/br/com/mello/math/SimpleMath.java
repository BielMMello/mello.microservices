package br.com.mello.math;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {
	
	public Double Soma(Double num1, Double num2) {
		return num1 + num2;
	}
	
	public Double Subtracao(Double num1, Double num2) {
		return num1 - num2;
	}
	
	public Double Divisao(Double num1, Double num2) {
		return num1 / num2;
	}
	
	public Double Multiplicacao(Double num1, Double num2) {
		return num1 * num2;
	}
	
	public Double Media(Double num1, Double num2) {
		return (num1 + num2)/2;
	}
	
	public Double Raiz(Double num) {
		return (Double) Math.sqrt(num);
	}

}
