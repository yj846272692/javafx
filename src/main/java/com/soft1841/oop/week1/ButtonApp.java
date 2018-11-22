package com.soft1841.oop.week1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;


import java.net.URL;

public class ButtonApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getResource("/fxml/main.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root,1200,800);
        scene.getStylesheets().addAll("/css/style.css");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.setTitle("新建窗口");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
