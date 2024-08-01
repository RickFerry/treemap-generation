package com.example.treemapgeneration;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TreeMapGenerationApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        TreeMapRenderer renderer = new TreeMapRenderer();
        Scene scene = new Scene(renderer.renderTreeMap(), 800, 600);
        primaryStage.setTitle("TreeMap Generation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
