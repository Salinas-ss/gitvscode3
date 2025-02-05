import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int segundos;
        double minutos, horas, dias;
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca segundos: ");
        segundos=s.nextInt();
        minutos=segundos/60.0;
        horas=minutos/60.0;
        dias=horas/24.0;
        System.out.println("Son "+minutos+" minutos, "+horas+" horas y "+dias+" dias");//comentario
    }
}
