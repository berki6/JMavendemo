module com.test {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.test to javafx.fxml;
    exports com.test;
}
