package Seminar_6.Homework;

import Seminar_6.Homework.controller.NoteController;
import Seminar_6.Homework.models.FileOperation;
import Seminar_6.Homework.models.FileOperationImpl;
import Seminar_6.Homework.models.NoteManager;
import Seminar_6.Homework.models.NoteManagerImpl;
import Seminar_6.Homework.views.NoteAdder;
import Seminar_6.Homework.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        
        FileOperation fileOperation = new FileOperationImpl("Seminar_6/Homework/notes.txt"); 
        NoteManager noteManagerImpl = new NoteManagerImpl(fileOperation);
        NoteController noteController = new NoteController(noteManagerImpl);
        NoteAdder noteAdder = new NoteAdder();
        ViewNote view = new ViewNote(noteController, noteAdder );
        view.run();
    }
}