package by.operator;

import by.dto.ComplexNumberDto;

public interface Operator {

    ComplexNumberDto executeOperation(ComplexNumberDto inputOne, ComplexNumberDto inputTwo);
}
