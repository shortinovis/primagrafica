module com.example.primagrafica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primagrafica to javafx.fxml;
    exports com.example.primagrafica;
}