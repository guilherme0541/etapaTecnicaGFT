package turno;

import java.util.Scanner;

public class AppTurno {
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String s, resposta;

        System.out.println("Qual o seu turno? M-manha ou T-tarde ou N-noite");
        s=scanner.next();

        if (s.equals("M")) {
            resposta="Bom dia!";
        } else {
            if (s.equals("T")) {
                resposta="Boa Tarde!";
            } else {
                if (s.equals("N")) {
                    resposta="Boa Noite!";
                } else {
                    resposta="Valor Invalido";
                }
            }
        }
        System.out.println(resposta);
        scanner.close();
    }
}
