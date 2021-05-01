package pack01;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.*;

public class ControlDeEntradas {

    public static int entradaoEnteroPositivo(){
        int n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            try{
                n = entradaUsuario.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el numero");
                n = -1;
            }
        }while(n < 0);
        //entradaUsuario.close();
        return n;
    }

    public static float entradaFlotantePositivo(){
        float n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            n = entradaUsuario.nextFloat();
        }while(n < 0);
        //entradaUsuario.close();
        return n;
    }

    public static String entradaString(){

        String s = null;
        Scanner entradaUsuario = new Scanner(System.in).useDelimiter("\\s*\n\\s*");
        do{
            s = entradaUsuario.next();
        }while(s.length() <= 0);
        //entradaUsuario.close();
        return s;
    }

    public static boolean entradaBoolean(){
        Scanner entradaUsuario = new Scanner(System.in);
        String s;
        boolean b = true;
        do{
            System.out.println("Introduzca \"Si\" o \"No\":");
            s = entradaUsuario.nextLine();
            if(s.equalsIgnoreCase("Si")){
                b = true;
            }else if(s.equalsIgnoreCase("No")){
                b = false;
            }
        }while(!s.equalsIgnoreCase("SI") && !s.equalsIgnoreCase("NO"));
        return b;
    }

    public static LocalDate entradaFecha(){

        int anio;
        int mes;
        int dia;

        LocalDate date;

        Scanner entradaUsuario = new Scanner(System.in);

        do{
            System.out.println("Introduzca el año: ");
            try{
                anio = entradaUsuario.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el numero.");
                System.out.println("Recuerde que deben ser enteros positivos, no caracteres.");
                anio = -1;
            }

        }while(anio < 0);
        do{
            System.out.println("Introduzca el mes: ");
            try{
                mes = entradaUsuario.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el numero.");
                System.out.println("Recuerde que deben ser enteros positivos, no caracteres.");
                mes = -1;
            }

        }while(mes < 0 || mes > 12);
        do{
            System.out.println("Introduzca el dia:");
            try{
                dia = entradaUsuario.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el numero.");
                System.out.println("Recuerde que deben ser enteros positivos, no caracteres.");
                dia = -1;
            }
        }while ((dia < 0)|| (dia > 31) || (mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30) || (mes == 2) && (dia > 29));

        date = LocalDate.of(anio, mes, dia);

        return date;
    }

    public static int entradaOpcion(int nMax){
        int n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            try{
                n = entradaUsuario.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el numero.");
                System.out.println("Recuerde que deben ser enteros positivos, no caracteres.");
                n = -1;
            }
        }while((n < 1) && (n > nMax));
        //entradaUsuario.close();
        return n;
    }
}
