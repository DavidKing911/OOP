package Seminar_6.Homework.views;

import java.util.Scanner;
import Seminar_6.Homework.models.Note;

public class NoteAdder {
    

    protected String promptString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    protected Integer promptInteger(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }

    Note setNote() {
        String title = promptString("Title: ");
        String text = promptString("Text: ");
        return new Note(title, text);
    }

}