package Seminar_6.Homework.controller;

import java.util.List;

import Seminar_6.Homework.models.Note;
import Seminar_6.Homework.models.NoteManager;

public class NoteController {
    private NoteManager noteManager;

    public NoteController(NoteManager noteManager) {
        this.noteManager = noteManager;
    }

    public void addNote(Note note) {
        noteManager.addNote(note);
    }

    public Note readNote(Integer id) throws Exception {
        return noteManager.readNote(id);
    }

    public List<Note> readAllNotes(){
        return noteManager.getAllNotes();
    }
    
    public void deleteNote(Integer id) throws Exception{
        noteManager.deleteNote(id);
    }

    public void updateNote(Integer id, String title, String text) throws Exception{
        noteManager.updateNote(id, title, text);
    }

}