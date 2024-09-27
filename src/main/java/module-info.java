module com.alesandro.calculadorafxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.alesandro.calculadorafxml to javafx.fxml;
    exports com.alesandro.calculadorafxml;
}