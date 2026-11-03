module com.mycompany.casopraccelular1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.casopraccelular1 to javafx.fxml, com.gluonhq.gluonfx.plugin;
    exports com.mycompany.casopraccelular1;
}