package Homework_5.Model;

public interface Calculator {
    Complex Sum(Complex complex1, Complex complex2);
    Complex Minus(Complex complex1, Complex complex2);
    Complex Mult (Complex complex1, Complex complex2);
    Complex Div(Complex complex1, Complex complex2);
}