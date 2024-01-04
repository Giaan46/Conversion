package tokio.school;

import java.util.Scanner;

public class Conversion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introsuzca su peso, para calcular cuanto pesaria en la luna  ");
        int peso = sc.nextInt();

        if(peso > 0){
            System.out.println("“Un peso de "+ peso +" kilos en la Tierra equivalen a "+peso * 0.17  +" kilos en la luna");

        }else{
            System.out.println(" el peso introducido no es valido ");
        }
    }
}
