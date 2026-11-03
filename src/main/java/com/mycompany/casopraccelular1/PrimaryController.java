package com.mycompany.casopraccelular1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class PrimaryController {
    
    @FXML private TextArea txtProductos;
    
    @FXML private TextField txtSelec;
    
    @FXML private TextArea txtProdSelec;
    
    @FXML
    public void initialize(){
        
        txtProductos.setText(
            "1 , HAMBURGUESA C/PAPAS , $85 Mx. \n"+
            "2 , BONNELES C/PAPAS  , $95 Mx. \n"+
            "3 , HOT DOGS C/PAPAS , $60 Mx. \n"+
            "4 , PAPAS C/CHILLI , $85 MX. \n");
    
    
    }

    @FXML
    private void switchToSecondary() throws IOException {

        String[] menuProductos = {
            "Pediste una Hamburguesa c/papas de $85 Mx.", // Posición 0 (Opción 1)
            "Pediste unos Boneless c/papas de $95 Mx.",  // Posición 1 (Opción 2)
            "Pediste unos Hot Dogs c/papas de $60 Mx.",  // Posición 2 (Opción 3)
            "Pediste unas Papas c/chilli de $85 Mx."     // Posición 3 (Opción 4)
        };
        
        try {
            
            int Opc = Integer.parseInt(txtSelec.getText()) - 1;

            if (Opc >= 0 && Opc < menuProductos.length) {
                txtProdSelec.setText(menuProductos[Opc]);
            } else {
                txtProdSelec.setText("Opción no válida. Ingresa un número del 1 al 4.");
            }
        } catch (NumberFormatException e) {
            
            txtProdSelec.setText("Por favor ingresa solo números válidos.");
        }
        
    }
}
