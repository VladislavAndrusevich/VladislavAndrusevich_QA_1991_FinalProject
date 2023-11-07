package by.factory.impl;

import by.factory.OperatorFactory;
import by.operator.Operator;
import by.operator.impl.ComplexNumberDivideOperator;
import by.operator.impl.ComplexNumberProduceOperator;
import by.operator.impl.ComplexNumberSumOperator;

public class OperatorFactoryImpl implements OperatorFactory {

    @Override
    public Operator getOperator(String operation) {

        if (operation.equalsIgnoreCase("+")) {
            return new ComplexNumberSumOperator();
        } else if (operation.equalsIgnoreCase("*")) {
            return new ComplexNumberProduceOperator();
        } else if (operation.equalsIgnoreCase("/")) {
            return new ComplexNumberDivideOperator();
        } else {
            throw new IllegalArgumentException("Operation is not supported --> " + operation);
        }
    }
}
