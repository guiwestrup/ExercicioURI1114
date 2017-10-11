
package exercicio1114;

import java.util.Scanner;

public class Exercicio1114 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int senha = 2002;
        boolean conf = true;
        while (conf == true)
        {
            int c = input.nextInt();
            if (c != senha)
            {
                System.out.println("Senha Invalida");
            }
            else if (c == senha)
            {
                conf = false;
            }
        }
        System.out.println("Acesso Permitido");
    }
    
}
