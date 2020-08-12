/**
 * 
 */
package mockito.example.services.impl;

import MiCustom.MiExcepcionCustom;
import mockito.example.services.BasicOperationsService;
import mockito.example.services.CalculatorService;
import mockito.example.services.DataService;

public class CalculatorServiceImpl implements CalculatorService,BasicOperationsService {
	private DataService dataService;
	private BasicOperationsService basicOperationsService;

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public DataService getDataService() {
		return this.dataService;
	}

	@Override
	public double calculateSum(int a, int b) {
		return basicOperationsService.add(a, b);
	}

	@Override
	public double calculateSubstraction(int a, int b) {
		return basicOperationsService.subtract(a, b);
	}
	
	@Override
	public double calculateDivision(int a, int b) throws IllegalArgumentException{
		 return a/b;
	}

	@Override
	public double calculateMultiplication(int a, int b) {
		return basicOperationsService.multiply(a, b);	
	}
	
	@Override
	public double calculateAverage() {
		int[] numbers = this.getDataService().getListOfNumbers();
		double avg = 0;
		for (int i : numbers) {
			avg += i;
		}
		return (numbers.length > 0) ? avg / numbers.length : 0;
	}

	@Override
	public boolean isOdd(int a) {
		// TODO implement me
		return false;
	}

	@Override
	public String printResult(double result) {
		String textToDisplay = "El resultado es: " + result;
		System.out.print(textToDisplay);
		return textToDisplay;
	}

	public boolean isEven(int value) {
		if(value%2==0) {
			return true;
		}else 
			return false;
	}

	@Override
	public double add(double input1, double input2) {
		return input1 + input2;
	}

	@Override
	public double subtract(double input1, double input2) {
		return input1-input2;
	}

	@Override
	public double multiply(double input1, double input2) {
		return input1*input2;
	}

	@Override
	public double divide(double input1, double input2) {
		return input1/input2;
	}
}
