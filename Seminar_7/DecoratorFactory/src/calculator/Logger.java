package Seminar_7.DecoratorFactory.src.calculator;

import java.io.FileWriter;
import java.io.IOException;

public class Logger implements Loggable {

    String filePath;

    public Logger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void Log(String message) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.append(message + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}