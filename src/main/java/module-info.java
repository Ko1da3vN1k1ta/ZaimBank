module com.example.zaimbank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zaimbank to javafx.fxml;
    exports com.example.zaimbank;
}