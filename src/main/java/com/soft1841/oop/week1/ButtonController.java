package com.soft1841.oop.week1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.net.URL;
import java.util.ResourceBundle;

public class ButtonController implements Initializable {
    @FXML private Button B0;
    @FXML private Button B1;
    @FXML private Button B2;
    @FXML private Button B3;
    @FXML private Button B4;
    @FXML private Button B5;
    @FXML private Button B6;
    @FXML private Button B7;
    @FXML private Button B8;
    @FXML private Button B9;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image B0Image = new Image("/img/设置.png");
        ImageView imageView = new ImageView(B0Image);
        B0.setGraphic(imageView);
        Image B1Image = new Image("/img/百度.png");
        ImageView imageView1 = new ImageView(B1Image);
        B1.setGraphic(imageView1);
        Image B2Image = new Image("/img/知乎.png");
        ImageView imageView2 = new ImageView(B2Image);
        B2.setGraphic(imageView2);
        Image B3Image = new Image("/img/IT之家.png");
        ImageView imageView3 = new ImageView(B3Image);
        B3.setGraphic(imageView3);
        Image B4Image = new Image("/img/贴吧.png");
        ImageView imageView4 = new ImageView(B4Image);
        B4.setGraphic(imageView4);
        Image B5Image = new Image("/img/阿里云.png");
        ImageView imageView5 = new ImageView(B5Image);
        B5.setGraphic(imageView5);
        Image B6Image = new Image("/img/csdn.png");
        ImageView imageView6 = new ImageView(B6Image);
        B6.setGraphic(imageView6);
        Image B7Image = new Image("/img/简书.png");
        ImageView imageView7 = new ImageView(B7Image);
        B7.setGraphic(imageView7);
        Image B8Image = new Image("/img/github.png");
        ImageView imageView8 = new ImageView(B8Image);
        B8.setGraphic(imageView8);
        Image B9Image = new Image("/img/码云.png");
        ImageView imageView9 = new ImageView(B9Image);
        B9.setGraphic(imageView9);
    }
}
