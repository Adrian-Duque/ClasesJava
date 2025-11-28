package Introducción;
import java.util.Scanner;
// Indicar si un mes y un dia son correctos o no
public class ej5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dime un mes: ");
        int mes = input.nextInt();
        System.out.print("Dime un dia: ");
        int dia = input.nextInt();
        //ver si es un mes valido
        if(mes>0&&mes<=12){
            //evaluamos los distintos mese
            if(mes==2&&dia>0&&dia<=28){
                System.out.print("Fecha correcta");
            }else if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&dia>0&&dia<=31){ //evaluamos los días de ese mes si son correcto
                System.out.print("Fecha correcta");
            } else if((mes==4||mes==6||mes==9||mes==11)&&dia>0&&dia<=30){
                System.out.print("Fecha correcta");
            }else {
                System.out.print("Dia incorrecto");
            }
        }else{
            System.out.println("Mes incorrecto");
        }
    }
}