package Desarrollo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class practica_sem2 {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("0.00");
        double var;
        sumar(10, 9, "Mario");
        var = raiz_cuadrada(2);
        double z = var * 12;
        String var1 = formato.format(z);
        System.out.println("El resultado es de: " + var1);
    }

    private static void sumar() {
        int a = 2;
        int b = 20;
        int suma = a + b;
        System.out.println("La suma es de: " + suma);
    }

    private static void sumar(int x, int y, String nombre) {
        int resultado = x+y;
        System.out.println(nombre + " te ganaste un total de: " + resultado);
    }

    private static double raiz_cuadrada(int x) {
        double valor = Math.sqrt(x);
        return valor;
    }
    
    
    
    
    
}
