module com.simpleoscilloscopegui {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.simpleoscilloscopegui to javafx.fxml;
    exports com.simpleoscilloscopegui;
}