package Reto1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Alejandro Davila Ortiz
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        double numero_1;
        double numero_2;
        String opcion;
        String operacion;
        double resultado;
        boolean validar_numero_1 = true;
        boolean validar_numero_2 = true;
        String menuP;
        String MenuO;
        ClsCalculadora calculadora = new ClsCalculadora();
        menuP = calculadora.MenuPrincipal();
        MenuO = calculadora.MenuOperaciones();
        do {

            opcion = JOptionPane.showInputDialog(menuP);
            if (opcion.equals("1")) {
                do {
                    operacion = JOptionPane.showInputDialog(MenuO);
                    if (operacion.equals("1")) {
                        numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Suma"));
                        numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la Suma"));
                        ClsCalculadora calculaSuma = new ClsCalculadora(numero_1, numero_2);
                        resultado = calculaSuma.Suma(numero_1, numero_2);
                        JOptionPane.showMessageDialog(null, "El resultado para la Suma de: \n"
                                + "Numero 1: " + numero_1 + "\n"
                                + "Numero 2: " + numero_2 + "\n"
                                + "[" + numero_1 + " + " + numero_2 + "]" + "=" + resultado);
                    } else {
                        if (operacion.equals("2")) {
                            numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Resta"));
                            numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la Resta"));
                            ClsCalculadora calculaResta = new ClsCalculadora(numero_1, numero_2);
                            resultado = calculaResta.Resta(numero_1, numero_2);
                            JOptionPane.showMessageDialog(null, "El resultado para la Resta de: \n"
                                    + "Numero 1: " + numero_1 + "\n"
                                    + "Numero 2: " + numero_2 + "\n"
                                    + "[" + numero_1 + " - " + numero_2 + "]" + "=" + resultado);
                        } else {
                            if (operacion.equals("3")) {
                                numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Multiplicación"));
                                numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la Multiplicación"));
                                ClsCalculadora calculaMult = new ClsCalculadora(numero_1, numero_2);
                                resultado = calculaMult.Multiplicacion(numero_1, numero_2);
                                JOptionPane.showMessageDialog(null, "El resultado para la Multiplicación de: \n"
                                        + "Numero 1: " + numero_1 + "\n"
                                        + "Numero 2: " + numero_2 + "\n"
                                        + "[" + numero_1 + " * " + numero_2 + "]" + "=" + resultado);
                            } else {
                                if (operacion.equals("4")) {
                                    numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la División"));
                                    numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la División"));
                                    ClsCalculadora calculaDiv = new ClsCalculadora(numero_1, numero_2);
                                    resultado = calculaDiv.Division(numero_1, numero_2);
                                    JOptionPane.showMessageDialog(null, "El resultado para la División de: \n"
                                            + "Numero 1: " + numero_1 + "\n"
                                            + "Numero 2: " + numero_2 + "\n"
                                            + "[" + numero_1 + " / " + numero_2 + "]" + "=" + resultado);
                                } else {
                                    if (operacion.equals("5")) {
                                        numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Potencia"));
                                        numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la Potencia"));
                                        ClsCalculadora calculaPot = new ClsCalculadora(numero_1, numero_2);
                                        resultado = calculaPot.Potencia(numero_1, numero_2);
                                        JOptionPane.showMessageDialog(null, "El resultado para la Potencia de: \n"
                                                + "Numero 1: " + numero_1 + "\n"
                                                + "Numero 2: " + numero_2 + "\n"
                                                + "[" + numero_1 + " ^ " + numero_2 + "]" + "=" + resultado);
                                    } else {
                                        if (operacion.equals("6")) {
                                            numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Raiz Cuadrada"));
                                            ClsCalculadora calculaSqrt = new ClsCalculadora(numero_1);
                                            resultado = calculaSqrt.RaizCuadrada(numero_1);
                                            JOptionPane.showMessageDialog(null, "El resultado para la Raiz Cuadrada de: \n"
                                                    + "Numero 1: " + numero_1 + "\n"
                                                    + "[" + numero_1 +"]" + "=" + resultado);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (!operacion.equals("7"));
            } else {
                if (opcion.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar este Software");
                    System.exit(0);
                }
            }

        } while (!opcion.equals("2"));

    }
}
