package by.calculator;

import by.dto.ComplexNumberDto;

public interface Calculator {

    ComplexNumberDto executeCalculation(ComplexNumberDto inputOne, ComplexNumberDto inputTwo, String operation);
}
