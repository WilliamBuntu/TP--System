module com.example.tpsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens com.example.tpsystem to javafx.fxml;
    exports com.example.tpsystem;
}