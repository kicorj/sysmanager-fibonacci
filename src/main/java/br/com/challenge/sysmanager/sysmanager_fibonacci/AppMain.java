package br.com.challenge.sysmanager.sysmanager_fibonacci;

import java.util.Scanner;

/**
 * Main Class para execução do desafio
 * @author kico
 *
 */
public class AppMain 
{
	private static int LIMIT = 40;
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        int iterations;
  
        //Loop enquanto o usuário não digitar um número igual ou inferior ao limite
        do {
	        System.out.println("Digite o número de iterações da série Fibonacci: "); 
	        iterations = sc.nextInt(); // Lê o input 
	        
	        if (iterations > LIMIT) {
	        	System.out.println("O limite de iterações é " + LIMIT);
	        }
        } while (iterations > LIMIT);
        
        sc.close();
 
        for (int i = 0; i < iterations; i++){
            System.out.println(Fibonacci.getFibonacci(i));
        }
    }
}
