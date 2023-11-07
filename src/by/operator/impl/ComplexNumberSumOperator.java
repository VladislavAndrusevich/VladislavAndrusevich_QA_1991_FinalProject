package by.operator.impl;

import by.dto.ComplexNumberDto;
import by.operator.Operator;

public class ComplexNumberSumOperator implements Operator {

    @Override
    public ComplexNumberDto executeOperation(ComplexNumberDto inputOne, ComplexNumberDto inputTwo) {
        double resultReal = inputOne.getReal() + inputTwo.getReal();
        double resultImaginary = inputOne.getImaginary() + inputTwo.getImaginary();

        return new ComplexNumberDto(resultReal, resultImaginary);
    }
}
