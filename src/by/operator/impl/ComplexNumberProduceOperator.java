package by.operator.impl;

import by.dto.ComplexNumberDto;
import by.operator.Operator;

public class ComplexNumberProduceOperator implements Operator {

    @Override
    public ComplexNumberDto executeOperation(ComplexNumberDto inputOne, ComplexNumberDto inputTwo) {
        double resultReal = inputOne.getReal() * inputTwo.getReal() - inputOne.getImaginary() * inputTwo.getImaginary();
        double resultImaginary = inputOne.getImaginary() * inputTwo.getReal() + inputOne.getReal() * inputTwo.getImaginary();

        return new ComplexNumberDto(resultReal, resultImaginary);
    }
}
