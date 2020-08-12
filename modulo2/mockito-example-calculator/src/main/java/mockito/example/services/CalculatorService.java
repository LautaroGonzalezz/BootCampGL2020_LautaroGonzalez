/**
 * 
 */
package mockito.example.services;

import MiCustom.MiExcepcionCustom;

public interface CalculatorService {

	double calculateSum(int a, int b);
	double calculateSubstraction(int a, int b);
	double calculateDivision(int a, int b) throws MiExcepcionCustom;
	double calculateMultiplication(int a, int b);
	double calculateAverage();
	boolean isOdd(int a);
	String printResult(double result);
}
