package solid;

import solid.srp.FigureManager;
import solid.srp.Point;
import solid.srp.Square;

public class Main {
    public static void main(String[] args) {
        FigureManager figureManager = new FigureManager(2);
        Square square = new Square(new Point(1,1), 5);
        figureManager.draw(square);
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());
    }
}