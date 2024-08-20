/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shannel Bejarano
 */
import javax.swing.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = JOptionPane.showInputDialog("Bienvenido a Quien "
                + "Quiere ser Millonario, cual es tu nombre");
        String Saludo = JOptionPane.showInputDialog("Te deseamos mucha suerte " + nombre);
        String pregunta = JOptionPane.showInputDialog("Pregunta #1, elija una respuesta: ");
        Object[] optiones = {"Rafael", "Miguel", "Davinci", "Cristo"};
        Object respuesta = JOptionPane.showConfirmDialog(null, "¿Quien pinto la Mona Lisa?",
                "Pregunta #1", JOptionPane.QUESTION_MESSAGE, null,optiones[0], optiones);
    }

                

