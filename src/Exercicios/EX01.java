
package Exercicios;

import static java.lang.Math.pow;


public class EX01 {
    public static void main(String[] args) {
        int soma = 0;
        
        
        for(int cont = 1;cont < 50; cont++){
            soma = (int) (soma + pow(soma,cont));
            
        }
        System.out.println(soma);
        
    }
}
