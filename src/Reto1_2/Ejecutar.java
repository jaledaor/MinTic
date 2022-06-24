package Reto1_2;

import javax.swing.JOptionPane;

/**
 * @author Jairo Alejandro Davila Ortiz
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        String numero_1;
        String numero_2;
        String opcion;
        String operacion;
        double resultado;
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

                        numero_1 = (JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Suma"));
                        while (!calculadora.ValidaNumero(numero_1)) {
                            numero_1 = JOptionPane.showInputDialog(null,
                                    "Numero Invalido. Ingrese Valor Equivalente a Numero 1 para la Suma");
                        }
                        numero_2 = JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la Suma");
                        while (!calculadora.ValidaNumero(numero_2)) {
                            numero_2 = JOptionPane.showInputDialog(null,
                                    "Numero Invalido. Ingrese Valor Equivalente a Numero 2 para la Suma");
                        }
                        ClsCalculadora calculaSuma = new ClsCalculadora(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                        resultado = calculaSuma.Suma(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                        JOptionPane.showMessageDialog(null, "El resultado para la Suma de: \n"
                                + "Numero 1: " + numero_1 + "\n"
                                + "Numero 2: " + numero_2 + "\n"
                                + "[" + numero_1 + " + " + numero_2 + "]" + "=" + resultado);
                    } else {
                        if (operacion.equals("2")) {
                            numero_1 = (JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Resta"));
                            while (!calculadora.ValidaNumero(numero_1)) {
                                numero_1 = JOptionPane.showInputDialog(null,
                                        "Numero Invalido. Ingrese Valor Equivalente a Numero 1 para la Resta");
                            }
                            numero_2 = JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la Resta");
                            while (!calculadora.ValidaNumero(numero_2)) {
                                numero_2 = JOptionPane.showInputDialog(null,
                                        "Numero Invalido. Ingrese Valor Equivalente a Numero 2 para la Resta");
                            }
                            ClsCalculadora calculaResta = new ClsCalculadora(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                            resultado = calculaResta.Resta(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                            JOptionPane.showMessageDialog(null, "El resultado para la Resta de: \n"
                                    + "Numero 1: " + numero_1 + "\n"
                                    + "Numero 2: " + numero_2 + "\n"
                                    + "[" + numero_1 + " - " + numero_2 + "]" + "=" + resultado);
                        } else {
                            if (operacion.equals("3")) {
                                numero_1 = (JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Multiplicación"));
                                while (!calculadora.ValidaNumero(numero_1)) {
                                    numero_1 = JOptionPane.showInputDialog(null,
                                            "Numero Invalido. Ingrese Valor Equivalente a Numero 1 para la Multiplicación");
                                }
                                numero_2 = JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la Multiplicación");
                                while (!calculadora.ValidaNumero(numero_2)) {
                                    numero_2 = JOptionPane.showInputDialog(null,
                                            "Numero Invalido. Ingrese Valor Equivalente a Numero 2 para la Multiplicación");
                                }
                                ClsCalculadora calculaMult = new ClsCalculadora(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                                resultado = calculaMult.Multiplicacion(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                                JOptionPane.showMessageDialog(null, "El resultado para la Multiplicación de: \n"
                                        + "Numero 1: " + numero_1 + "\n"
                                        + "Numero 2: " + numero_2 + "\n"
                                        + "[" + numero_1 + " * " + numero_2 + "]" + "=" + resultado);
                            } else {
                                if (operacion.equals("4")) {
                                    numero_1 = (JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la División"));
                                    while (!calculadora.ValidaNumero(numero_1)) {
                                        numero_1 = JOptionPane.showInputDialog(null,
                                                "Numero Invalido. Ingrese Valor Equivalente a Numero 1 para la División");
                                    }
                                    numero_2 = JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la División");
                                    while (!calculadora.ValidaNumero(numero_2) || numero_2.equals("0")) {
                                        numero_2 = JOptionPane.showInputDialog(null,
                                                "Numero Invalido. Ingrese Valor Equivalente a Numero 2 para la División");
                                    }
                                    ClsCalculadora calculaDiv = new ClsCalculadora(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                                    resultado = calculaDiv.Division(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                                    JOptionPane.showMessageDialog(null, "El resultado para la División de: \n"
                                            + "Numero 1: " + numero_1 + "\n"
                                            + "Numero 2: " + numero_2 + "\n"
                                            + "[" + numero_1 + " / " + numero_2 + "]" + "=" + resultado);
                                } else {
                                    if (operacion.equals("5")) {
                                        numero_1 = (JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Potencia"));
                                        while (!calculadora.ValidaNumero(numero_1)) {
                                            numero_1 = JOptionPane.showInputDialog(null,
                                                    "Numero Invalido. Ingrese Valor Equivalente a Numero 1 para la Potencia");
                                        }
                                        numero_2 = JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 2 para la Potencia");
                                        while (!calculadora.ValidaNumero(numero_2)) {
                                            numero_2 = JOptionPane.showInputDialog(null,
                                                    "Numero Invalido. Ingrese Valor Equivalente a Numero 2 para la Potencia");
                                        }
                                        ClsCalculadora calculaPot = new ClsCalculadora(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                                        resultado = calculaPot.Potencia(Double.parseDouble(numero_1), Double.parseDouble(numero_2));
                                        JOptionPane.showMessageDialog(null, "El resultado para la Potencia de: \n"
                                                + "Numero 1: " + numero_1 + "\n"
                                                + "Numero 2: " + numero_2 + "\n"
                                                + "[" + numero_1 + " ^ " + numero_2 + "]" + "=" + resultado);
                                    } else {
                                        if (operacion.equals("6")) {
                                            numero_1 = (JOptionPane.showInputDialog("Ingrese Valor Equivalente a Numero 1 para la Raiz Cuadrada"));
                                        while (!calculadora.ValidaNumero(numero_1) || Double.parseDouble(numero_1)<0) {
                                            numero_1 = JOptionPane.showInputDialog(null,
                                                    "Numero Invalido. Ingrese Valor Equivalente a Numero 1 para la Cuadrada");
                                        }
                                            ClsCalculadora calculaSqrt = new ClsCalculadora(Double.parseDouble(numero_1));
                                            resultado = calculaSqrt.RaizCuadrada(Double.parseDouble(numero_1));
                                            JOptionPane.showMessageDialog(null, "El resultado para la Raiz Cuadrada de: \n"
                                                    + "Numero 1: " + numero_1 + "\n"
                                                    + "[" + numero_1 + "]" + "=" + resultado);
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
