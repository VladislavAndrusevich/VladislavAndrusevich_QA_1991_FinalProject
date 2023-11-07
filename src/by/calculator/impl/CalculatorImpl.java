package by.calculator.impl;

import by.calculator.Calculator;
import by.decorator.OperatorDecorator;
import by.decorator.impl.OperatorDecoratorImpl;
import by.dto.ComplexNumberDto;
import by.factory.OperatorFactory;
import by.operator.Operator;

public class CalculatorImpl implements Calculator {

    private final OperatorFactory factory;

    public CalculatorImpl(OperatorFactory factory) {
        this.factory = factory;
    }

    @Override
    public ComplexNumberDto executeCalculation(ComplexNumberDto inputOne, ComplexNumberDto inputTwo, String operation) {
        Operator operator = factory.getOperator(operation);
        OperatorDecorator decorator = new OperatorDecoratorImpl(operator);

        return decorator.executeOperation(inputOne, inputTwo);
    }
}
