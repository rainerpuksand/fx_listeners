module com.example.fx_listeners {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_listeners to javafx.fxml;
    exports com.example.fx_listeners;
}