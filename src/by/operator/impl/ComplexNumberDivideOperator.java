package by.operator.impl;

import by.dto.ComplexNumberDto;
import by.operator.Operator;

public class ComplexNumberDivideOperator implements Operator {

    @Override
    public ComplexNumberDto executeOperation(ComplexNumberDto inputOne, ComplexNumberDto inputTwo) {
        double bottomResult = Math.pow(inputTwo.getReal(), 2) + Math.pow(inputTwo.getImaginary(), 2);
        double resultReal = (inputOne.getReal() * inputTwo.getReal() + inputOne.getImaginary() * inputTwo.getImaginary()) / bottomResult;
        double resultImaginary = (inputOne.getImaginary() * inputTwo.getReal() - inputOne.getReal() * inputTwo.getImaginary()) / bottomResult;

        return new ComplexNumberDto(resultReal, resultImaginary);
    }
}
