package aumentoSalario;

import java.util.Scanner;

public class AppAumentoSalario {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salario do colaborador: ");

        float salario = scanner.nextFloat();

        Colaborador colaborador = new Colaborador (salario);
        System.out.println(colaborador.mostrarAumento());

        scanner.close();
    }

}
