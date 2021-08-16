package faixasEtarias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppFaixasEtarias {
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        List<Integer> faixasEtarias =new ArrayList<Integer> ();

        for (int i = 0; i < 5; i++) {
            faixasEtarias.add(0);
        }

        System.out.println("Informe as idades: ");

        for (int i = 0; i < 10; i++) {
            int idade = scanner.nextInt();
            int faixa = 4;
            if(idade<15){
                faixa = 0;
            } else {
                if (idade < 30) {
                    faixa = 1;
                } else {
                    if (idade < 45) {
                        faixa = 2;
                    } else {
                        if (idade < 60) {
                            faixa = 3;
                        } 
                    }
                }
            }
            faixasEtarias.set(faixa, faixasEtarias.get(faixa)+1);
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Na faixa "+ (i+1) + " existem "+ faixasEtarias.get(i) +"pessoas" );

        }
        System.out.println("Percentual na primeira faixa : "+faixasEtarias.get(0)*10);
        System.out.println("Percentual na ultima faixa : "+faixasEtarias.get(4)*10);
        scanner.close();
    }

}
