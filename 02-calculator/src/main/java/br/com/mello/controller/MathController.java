package br.com.mello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mello.exception.UnsuportedMathOperationException;
import br.com.mello.math.SimpleMath;
import br.com.mello.request.converters.NumberConverter;

@RestController
public class MathController {
	
	@Autowired
	private SimpleMath math;
	
	@Autowired
	private NumberConverter NumberConverter;
	
	@RequestMapping(value="/Soma/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double Soma(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateInput(numberOne,numberTwo);
		return math.Soma(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));		
	}	
	
	@RequestMapping(value="/Subtracao/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double Subtracao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateInput(numberOne,numberTwo);
		return math.Subtracao(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));	
	}	
	
	@RequestMapping(value="/Multiplicacao/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double Multiplicacao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateInput(numberOne,numberTwo);
		return math.Multiplicacao(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));	
	}	
	
	@RequestMapping(value="/Divisao/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double Divisao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateInput(numberOne,numberTwo);
		return math.Divisao(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));	
	}

	@RequestMapping(value="/Media/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double Media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateInput(numberOne,numberTwo);
		return math.Media(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));		
	}	
	
	@RequestMapping(value="/Raiz/{number}", method=RequestMethod.GET)
	public Double Raiz(@PathVariable("number") String number) throws Exception {
		ValidateInput(number);
		return math.Raiz(NumberConverter.covertToDouble(number));		
	}	
	
	private void ValidateInput(String number) {
		if (!NumberConverter.isNumeric(number) || !NumberConverter.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
	}
	
	private void ValidateInput(String numberOne, String numberTwo) {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
	}
	
}










