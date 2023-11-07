package by;

import by.calculator.Calculator;
import by.calculator.impl.CalculatorImpl;
import by.dto.ComplexNumberDto;
import by.factory.impl.OperatorFactoryImpl;

public class Main {
    public static void main(String[] args) {
        ComplexNumberDto inputOne = new ComplexNumberDto(1.1, 2.2);
        ComplexNumberDto inputTwo = new ComplexNumberDto(4.4, 3.3);

        OperatorFactoryImpl factory = new OperatorFactoryImpl();
        Calculator calculator = new CalculatorImpl(factory);

        ComplexNumberDto sumResult = calculator.executeCalculation(inputOne, inputTwo, "+");
        ComplexNumberDto produceResult = calculator.executeCalculation(inputOne, inputTwo, "*");
        ComplexNumberDto divideResult = calculator.executeCalculation(inputOne, inputTwo, "/");

        System.out.println("----------------------------------");

        System.out.println("Operation sum result is " + sumResult.toString());
        System.out.println("Operation produce result is " + produceResult.toString());
        System.out.println("Operation divide result is " + divideResult.toString());

    }
}