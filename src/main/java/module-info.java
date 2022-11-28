module com.example.sumadojava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sumadojava to javafx.fxml;
    exports com.example.sumadojava;
}