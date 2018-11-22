package com.soft1841.oop.week1;

import javafx.scene.control.Button;

public class MyButton extends Button {
    //自定义构造方法，实现一个指定宽度和高和背景色的按钮
    public MyButton(){
        //给当前按钮对象设置合适的尺寸
        this.setPrefSize(170,170);
        this.setStyle("-fx-background-radius: 250");
    }

}



