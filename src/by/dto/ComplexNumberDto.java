package by.dto;

import java.util.Objects;

public class ComplexNumberDto {

    private final double real;
    private final double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumberDto(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "Real is " + real + " and Imaginary is " + imaginary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumberDto that = (ComplexNumberDto) o;
        return Objects.equals(real, that.real) && Objects.equals(imaginary, that.imaginary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }
}
