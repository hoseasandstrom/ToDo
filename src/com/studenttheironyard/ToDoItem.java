package com.studenttheironyard;

/**
 * Created by hoseasandstrom on 5/23/16.
 */
public class ToDoItem {
    int id;
    String text;
    boolean isDone;


    public ToDoItem(int id, String text, boolean isDone) {
        this.id = id;
        this.text = text;
        this.isDone = isDone;
    }
}
