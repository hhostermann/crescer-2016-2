/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cwi.crescer.aulaum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author henrique.ostermann
 */
public class StringRun {
    public static void main(String[] args) {
        if ("A".compareTo(new String("A")) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        try (final InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
            try (final BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                System.out.println("Hello World! - " + bufferedReader.readLine());
            } catch (Exception e) {
                //...
            }
        } catch (Exception e) {
            //...
        }
    }


//Solicitar que o usuário informe um frase, e retorna a quantidade de vogais.
//Solicitar que o usuário informe valores e inverter string de entrada.
public static int RetornaNumeroVogal(String frase){
    int cont = 0;
    frase.toLowerCase();
    for (int i=0; i<=frase.length(); i++)
    {
        char letra = frase.charAt(i);
        if (letra == 'a' ||letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u' ){
            cont++;
        }
    }
    return cont;
   }
//
//   public static String ConcatenarEnum(Estados[] exercicio){
//       String string = "";
//    for (int i = 0 ; i < exercicio.lenght(); i++ ){
//        string += exercicio[i].getNome() + ",";
//    }
//    return string;
//   }
   public static void PegarDataConsole(){
       Date dataPegar = new Date();
       System.out.println("Data Atual:" + dataPegar);
   }
   public static void PegarODiaDaSemna (){
       SimpleDateFormat data;
       data = new SimpleDateFormat("dd/MM/yyyy");
       Date novaData = new Date(bufferedReader.readLine());
       GregorianCalendar gregorio = new GregorianCalendar();
       gregorio.setTime(novaData);
       int diaDaSemana = gregorio.get(GregorianCalendar.DAY_OF_WEEK);
       
   }
}