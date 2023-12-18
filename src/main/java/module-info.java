module com.example.aplikacja_desktopowa {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.aplikacja_desktopowa to javafx.fxml;
    exports com.example.aplikacja_desktopowa;
}