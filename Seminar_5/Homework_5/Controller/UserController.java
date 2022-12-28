package Homework_5.Controller;

import Homework_5.Model.Calculator;
import Homework_5.Model.Complex;

public class UserController {

    private Calculator calc;
    
    public UserController(Calculator calc) {
        this.calc = calc;
    }

    public Complex sum(Complex complex1, Complex complex2){
        return calc.Sum(complex1, complex2);   
    }

    public Complex minus(Complex complex1, Complex complex2){
        return calc.Minus(complex1, complex2);   
    }

    public Complex multi(Complex complex1, Complex complex2){
        return calc.Mult(complex1, complex2);   
    }

    public Complex div(Complex complex1, Complex complex2){
        return calc.Div(complex1, complex2);   
    }

}