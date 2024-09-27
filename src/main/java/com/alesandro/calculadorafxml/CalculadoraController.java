package com.alesandro.calculadorafxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Operaciones;

/**
 * Clase que controla la ventana
 *
 * @author alesandroquirosgobbato
 */
public class CalculadoraController {
    @FXML
    private RadioButton dividir;
    @FXML
    private RadioButton multiplicar;
    @FXML
    private RadioButton restar;
    @FXML
    private RadioButton sumar;
    @FXML
    private ToggleGroup tgOperaciones;
    @FXML
    private TextField txtOperador1;
    @FXML
    private TextField txtOperador2;
    @FXML
    private TextField txtResultado;

    /**
     * Función que se ejecuta al pulsar el botón calcular
     *
     * @param event a {@link javafx.event.ActionEvent} object
     */
    @FXML
    public void calcular(ActionEvent event) {
        try {
            double op1 = Double.parseDouble(this.txtOperador1.getText());
            double op2 = Double.parseDouble(this.txtOperador2.getText());
            Operaciones operaciones = new Operaciones(op1, op2);
            if (this.sumar.isSelected()) {
                this.txtResultado.setText(operaciones.sumar() + "");
            } else if (this.restar.isSelected()) {
                this.txtResultado.setText(operaciones.restar() + "");
            } else if (this.multiplicar.isSelected()) {
                this.txtResultado.setText(operaciones.multiplicar() + "");
            } else if (this.dividir.isSelected()) {
                if (op2 == 0) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("El operando 2 no puede ser 0");
                    alert.showAndWait();
                    txtOperador2.setText("");
                } else {
                    this.txtResultado.setText(operaciones.dividir() + "");
                }
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
    }
}
