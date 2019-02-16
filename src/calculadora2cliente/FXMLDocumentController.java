/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2cliente;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import clases.Cliente;
import clases.OperacionesAritmeticas;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import javafx.geometry.Point2D;
/**
 *
 * @author J.Armando
 */
public class FXMLDocumentController implements Initializable {
    Cliente cliente = new Cliente();
    boolean bandera=true;
    double numero1=0;
    double total=0;
    char operacion;
    int punteo=0;
    int operacionBandera=0;
    OperacionesAritmeticas op;
    @FXML
    private Label lblNumeros;
    @FXML
    private Label lblHistorial;
    private String verCero(String cadena)
    {  
        if(bandera)
        {
            bandera=false;
            return cadena;           
        }
        return lblNumeros.getText() + cadena;
    }
    
   @FXML
    private void btnNumero1_clcik(ActionEvent event) {
      lblNumeros.setText(verCero("1"));
    }
    @FXML
    private void btnNumero2_clcik(ActionEvent event) {
       lblNumeros.setText(verCero("2"));  
    }
    @FXML
    private void btnNumero3_clcik(ActionEvent event) {
       lblNumeros.setText(verCero("3"));
    }
    @FXML
    private void btnNumero4_clcik(ActionEvent event) {
        lblNumeros.setText(verCero("4"));
    }
    @FXML
    private void btnNumero5_clcik(ActionEvent event) {
       lblNumeros.setText(verCero("5"));
    }
    @FXML
    private void btnNumero6_clcik(ActionEvent event) {
        lblNumeros.setText(verCero("6"));
    }
    @FXML
    private void btnNumero7_clcik(ActionEvent event) {
        lblNumeros.setText(verCero("7"));
    }
    @FXML
    private void btnNumero8_clcik(ActionEvent event) {
        lblNumeros.setText(verCero("8")); 
    }
    @FXML
    private void btnNumero9_clcik(ActionEvent event) {
        lblNumeros.setText(verCero("9"));
    }
    @FXML
    private void btnNumero0_clcik(ActionEvent event) {
        lblNumeros.setText(verCero("0"));
    }
    @FXML
    private void limpiarPantalla(ActionEvent e)
    {
        lblHistorial.setText("");
        lblNumeros.setText("0");
        total = 0;
        punteo =0;
        bandera=true;
    } 
    @FXML
    private void borrarNumeros(ActionEvent e)
    {
        int numero= lblNumeros.getText().length();
        if(numero>1)
        {
            lblNumeros.setText(lblNumeros.getText().substring(0,numero-1 ));
        }
        else{
            lblNumeros.setText("0");
            bandera=true;
        }
    }
   
    @FXML
   private void agregarPunto(ActionEvent e)
   {   
      lblNumeros.setText(lblNumeros.getText() +".");     
      bandera=false;
   }
   
   private void hacerOperaciones()
   {
       operaciones(operacion);
       lblHistorial.setText(lblHistorial.getText()+lblNumeros.getText()+String.valueOf(operacion));
       lblNumeros.setText(String.valueOf(total));
   }
  
   @FXML
   private void sumar(ActionEvent e)
   {
       operacionBandera = 1;
       hacerOperaciones();
      operacion='+';
   }
   @FXML
   private void restar(ActionEvent e)
   {
       operacionBandera = 2;
       hacerOperaciones();
       operacion='-';
   }
   
   @FXML
   private void multiplicar(ActionEvent e)
   {
       operacionBandera = 3;
       hacerOperaciones();
       operacion='x';
   }
   
    @FXML
   private void dividir(ActionEvent e)
   {
       operacionBandera = 4;
       hacerOperaciones();
       operacion='/';
   }
   @FXML
   private void sacarRaiz(ActionEvent e)
   {
      try
      {
       numero1 = Double.parseDouble(lblNumeros.getText());
       double raiz = cliente.realizarRaiz(numero1);
       lblNumeros.setText(String.valueOf(raiz));   
      }catch(Exception ex)
      {
          System.out.println("ha ocurrido un error");
      }
      
   }
   @FXML
   private void elevarPotencia(ActionEvent e)
   {    
       try
       {
            numero1 = Double.parseDouble(lblNumeros.getText());
            double potencia = cliente.realizarPotencia(numero1);
            lblNumeros.setText(String.valueOf(potencia));
       }
       catch(Exception ex)
       {
           System.out.println("Ha ocurrido un error");
       }
   }
  
   @FXML
   private void mostrarTotal(ActionEvent e)
   {
       hacerOperaciones();
       lblHistorial.setText("");
       numero1=0;
       total=0;
   }
   private void operaciones(char tipoOperacion)
   {
     switch(tipoOperacion)
     {
         case '+':
             numero1 = Double.parseDouble(lblNumeros.getText());
             total +=numero1;
             mostrarSigno(operacionBandera);
             break;
         case '-':
             numero1 = Double.parseDouble(lblNumeros.getText());
             total -=numero1; 
             mostrarSigno(operacionBandera);
            break;
         case 'x':
             numero1 = Double.parseDouble(lblNumeros.getText());
             total *=numero1; 
             mostrarSigno(operacionBandera);
             break;
         case '/':
             numero1 = Double.parseDouble(lblNumeros.getText());
             total /=numero1; 
             mostrarSigno(operacionBandera);
             break;
         default:
             total = Double.parseDouble(lblNumeros.getText());
             mostrarSigno(operacionBandera);
             break;
     }
     bandera = true;
   }
   
   private void mostrarSigno(int op)
   {
       switch(op)
       {
           case 1: //sumar
               operacion='+';
               break;
            case 2: //restar
               operacion='-';
               break;
            case 3: //multiplicar
               operacion='x';
               break;
             case 4: //dividir
               operacion='/';
               break;
             default:
                 break;
       }
   }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lblHistorial.setText("");
        lblNumeros.setText("0");
    }    
    
}
