package by.factory;

import by.operator.Operator;

public interface OperatorFactory {

    Operator getOperator(String operation);
}
