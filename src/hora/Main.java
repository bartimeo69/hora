/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;

import java.util.Scanner;

/**
 *
 * @author DAW110
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leo=new Scanner(System.in);
        System.out.println("Introduce la hora, minutos y segundos de comienzo");
        int hora=leo.nextInt();
        int minutos=leo.nextInt();
        int segundos=leo.nextInt();
        hora horacomienzo=new hora (hora,minutos,segundos);
        System.out.println("Introduce la hora, minutos y segundos del fin");
        hora=leo.nextInt();
        minutos=leo.nextInt();
        segundos=leo.nextInt();
        hora horafin=new hora(hora,minutos,segundos);
        System.out.println("Introduce numero de telefono");
        String numerotelefono=leo.nextLine();
        Llamada llamada=new Llamada(numerotelefono,horacomienzo,horafin);
        System.out.println("La duracion de la llamada es de " + llamada.duracionllamada());
    }
    
}
