package pack01;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.*;

public class ControlDeEntradas {

    public static int entradaoEnteroPositivo(){
        int n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            n = entradaUsuario.nextInt();
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
        Scanner entradaUsuario = new Scanner(System.in);//Scanner(System.in).useDelimiter("\\s*\n\\s*");
        do{
            s = entradaUsuario.next();
        }while(s.length() <= 0);
        //entradaUsuario.close();
        return s;
    }

    public static boolean entradaBoolean(){
        boolean b = false;
        boolean b2;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            System.out.println("Escriba true para SI.");
            System.out.println("Escriba false para NO.");
            try{
                b = entradaUsuario.nextBoolean();
                b2 = true;
            }catch(InputMismatchException e){
                System.out.println("Entrada invalida!");
                b2 = false;
            }
        }while(!b2);

        //entradaUsuario.close();

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
            anio = entradaUsuario.nextInt();
        }while(anio < 0);
        do{
            System.out.println("Introduzca el mes: ");
            mes = entradaUsuario.nextInt();
        }while(mes < 0 || mes > 12);
        do{
            System.out.println("Introduzca el dia:");
            dia = entradaUsuario.nextInt();

        }while ((dia < 0)|| (dia > 31) || (mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30) || (mes == 2) && (dia > 29));

        date = LocalDate.of(anio, mes, dia);

        return date;
    }

    public static int entradaOpcion(int nMax){
        int n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            n = entradaUsuario.nextInt();
        }while((n < 1) && (n > nMax));
        //entradaUsuario.close();
        return n;
    }
}
