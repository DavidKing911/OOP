package Homework_5;

import Homework_5.Controller.UserController;
import Homework_5.Model.Calculator;
import Homework_5.Model.CalcImplem;
import Homework_5.Model.Log;
import Homework_5.Views.ViewCalculator;

public class Program {
    public static void main(String[] args) {
        Calculator calc = new CalcImplem();
        UserController userController = new UserController(calc);
        Log logManager = new Log("Homework_5/log.log");
        ViewCalculator viewCalc = new ViewCalculator(userController, logManager);
        viewCalc.run();
    }
}