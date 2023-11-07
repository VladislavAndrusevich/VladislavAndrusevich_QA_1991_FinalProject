package by.decorator.impl;

import by.decorator.OperatorDecorator;
import by.dto.ComplexNumberDto;
import by.operator.Operator;

public class OperatorDecoratorImpl implements OperatorDecorator {

    private final Operator operator;

    public OperatorDecoratorImpl(Operator operator) {
        this.operator = operator;
    }

    @Override
    public ComplexNumberDto executeOperation(ComplexNumberDto inputOne, ComplexNumberDto inputTwo) {
        System.out.println("Execute operation in decorator by " + operator.getClass().getSimpleName());
        ComplexNumberDto operationResult = operator.executeOperation(inputOne, inputTwo);
        System.out.println("Operation result in decorator is --> " + operationResult.toString());

        return operationResult;
    }
}
