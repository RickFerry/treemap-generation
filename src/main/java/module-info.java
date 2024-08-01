module com.example.treemapgeneration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.treemapgeneration to javafx.fxml;
    exports com.example.treemapgeneration;
}