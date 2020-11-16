package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class Controller {
    @FXML
    private TextField usu;

    @FXML
    private PasswordField passw;

    @FXML
    private Button login;

    @FXML
    private Label mostrar;

    @FXML private void Vacio(KeyEvent event){
        Object eve = event.getSource();

        if(eve.equals(usu)){
            if (event.getCharacter().equals(" ")){
                event.consume();
            }
        }else if (eve.equals(passw)){
            if (event.getCharacter().equals(" ")){
                event.consume();
            }
        }
    }
    @FXML private void ButtonAction(ActionEvent event){
        Object eve = event.getSource();
        String usuario = usu.getText();
        String password = passw.getText();

        if (eve.equals(login)){
            if (!usuario.isEmpty() && !password.isEmpty()){
                if (usuario.equals("afuera01") && password.equals("1234")){
                    JOptionPane.showMessageDialog(null,"Bienvenido");

                }else{
                    JOptionPane.showConfirmDialog(null,"Usuario y contraseña incorrectos!");
                }

            }else{
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión",
                                            "WARNING",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    @FXML private void MostrarPassword(MouseEvent event){
        Object eve = event.getSource();
        mostrar.setTooltip(new Tooltip(passw.getText()));
    }
}
