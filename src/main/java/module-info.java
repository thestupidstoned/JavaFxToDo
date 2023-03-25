module com.example.javafxtodo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.javafxtodo to javafx.fxml;
    exports com.example.javafxtodo;
}