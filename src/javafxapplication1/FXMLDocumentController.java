/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 *
 * @author PerlaMay
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextArea display;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button minus;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button percent;
    @FXML
    private Button zero;
    @FXML
    private Button point;
    @FXML
    private Button plus;
    @FXML
    private Button equals;
    @FXML
    private Button clear;
    @FXML
    private Button times;
    @FXML
    private Button divide;
    @FXML
    private Button backspace;
    @FXML
    private TextArea display2;
    
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    

    @FXML
    private void btn7(ActionEvent event) {
        display.setText(display.getText() + "7");
    }

    @FXML
    private void btn8(ActionEvent event) {
        display.setText(display.getText() + "8");
    }

    @FXML
    private void btn9(ActionEvent event) {
        display.setText(display.getText() + "9");
    }

    @FXML
    private void btnminus(ActionEvent event) {
        display.setText(display.getText() + "-");
    }

    @FXML
    private void btn4(ActionEvent event) {
        display.setText(display.getText() + "4");
    }

    @FXML
    private void btn5(ActionEvent event) {
        display.setText(display.getText() + "5");
    }

    @FXML
    private void btn6(ActionEvent event) {
        display.setText(display.getText() + "6");
    }

    @FXML
    private void btn1(ActionEvent event) {
        display.setText(display.getText() + "1");
    }

    @FXML
    private void btn2(ActionEvent event) {
        display.setText(display.getText() + "2");
    }

    @FXML
    private void btn3(ActionEvent event) {
        display.setText(display.getText() + "3");
    }

    @FXML
    private void btnpercent(ActionEvent event) {
        display.setText(display.getText() + "%");
    }

    @FXML
    private void btn0(ActionEvent event) {
        display.setText(display.getText() + "0");
    }

    @FXML
    private void btnpoint(ActionEvent event) {
        display.setText(display.getText() + ".");
    }

    @FXML
    private void btnplus(ActionEvent event) {
        display.setText(display.getText() + "+");
    }

    @FXML
    private void btnclear(ActionEvent event) {
        display.setText("");
    }

    @FXML
    private void btntimes(ActionEvent event) {
        display.setText(display.getText() + "*");
    }

    @FXML
    private void btndivi(ActionEvent event) {
        display.setText(display.getText() + "/");
    }

    @FXML
    private void btnerase(ActionEvent event) {
       JOptionPane.showMessageDialog(null, "Ambut unsaon ni hahahaha hunahunaon lng nko unya");
    }

    @FXML
    private void btnequals(ActionEvent event) {
        double equals;
        equals = Double.valueOf(display.getText());
        display2.setText(String.valueOf(equals));
    }

    @FXML
    private void btn7(KeyEvent event) {
    }

    @FXML
    private void btn8(KeyEvent event) {
    }

    @FXML
    private void btn9(KeyEvent event) {
    }

    @FXML
    private void btnminus(KeyEvent event) {
    }

    @FXML
    private void btn4(KeyEvent event) {
    }

    @FXML
    private void btn5(KeyEvent event) {
    }

    @FXML
    private void btn6(KeyEvent event) {
    }

    @FXML
    private void btn1(KeyEvent event) {
    }

    @FXML
    private void btn2(KeyEvent event) {
    }

    @FXML
    private void btn3(KeyEvent event) {
    }

    @FXML
    private void btnpercent(KeyEvent event) {
    }

    @FXML
    private void btn0(KeyEvent event) {
    }

    @FXML
    private void btnpoint(KeyEvent event) {
    }

    @FXML
    private void btnplus(KeyEvent event) {
    }

    @FXML
    private void btnequals(KeyEvent event) {
    }

    @FXML
    private void btnclear(KeyEvent event) {
    }

    @FXML
    private void btntimes(KeyEvent event) {
    }

    @FXML
    private void btndivi(KeyEvent event) {
    }

    @FXML
    private void btnerase(KeyEvent event) {
    }
    
}
