package com.soft1841.oop.week1;

import javafx.scene.control.TextField;

public class MyTextField extends TextField {
    public MyTextField() {
        this.setPrefSize(1000, 60);
        this.setStyle("-fx-border-radius: 200;-fx-background-radius: 200");
    }
}
