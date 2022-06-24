package Reto1_2;

/**
 * @author Jairo Alejandro Davila Ortiz
 */
public class ClsCalculadora {
    
    double numero_1;
    double numero_2;
    double resultado;
    
    public ClsCalculadora() {
    }
    
    public ClsCalculadora(double numero_1) {
        this.numero_1 = numero_1;
    }
    
    public ClsCalculadora(double numero_1, double numero_2) {
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
    }
    
    public String MenuPrincipal(){
        String menu="""
                    Seleccione una opción
                    
                    1. Realizar una Operación
                    2. Salir
                    """;
        return menu;
    }
    
    public String MenuOperaciones(){
        String menu="""
                    Seleccione una operación
                    
                    1.Suma
                    2.Resta
                    3.Multiplicacion
                    4.División
                    5.Potencia
                    6.Raíz Cuadrada
                    7.salir
                    """;
        return menu;
    }
            
    public double Suma(double numero_1, double numero_2) {
        resultado = numero_1 + numero_2;
        return resultado;
    }
    
    public double Resta(double numero_1, double numero_2) {
        resultado = numero_1 - numero_2;
        return resultado;
    }
    
    public double Multiplicacion(double numero_1, double numero_2) {
        resultado = numero_1 * numero_2;
        return resultado;
    }
    
    public double Division(double numero_1, double numero_2) {
        resultado = numero_1 / numero_2;
        return resultado;
    }
    
    public double Potencia(double numero_1, double numero_2) {
        resultado = Math.pow(numero_1, numero_2);
        return resultado;
    }
    
    public double RaizCuadrada(double numero_1) {
        resultado = Math.sqrt(numero_1);
        return resultado;
    }
    
    public boolean ValidaNumero(String numero){
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    
    }
}
