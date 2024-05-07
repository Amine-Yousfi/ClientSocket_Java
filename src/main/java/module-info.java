module org.example.socketclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.socketclient to javafx.fxml;
    exports org.example.socketclient;
}