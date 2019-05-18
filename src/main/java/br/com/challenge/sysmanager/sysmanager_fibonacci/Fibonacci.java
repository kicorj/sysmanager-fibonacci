package br.com.challenge.sysmanager.sysmanager_fibonacci;

/**
 * Classe para geração de série de Fibonacci
 * @author kico
 *
 */
public class Fibonacci {
	
	private Fibonacci() {}
	
	/**
	 * Método que retorna a série de Fibonnaci de forma recursiva
	 * @param number
	 * @return
	 */
	public static int getFibonacci(int number) {
		
        if (number == 0) {
            return 0;
        }
        else if(number == 1)
        {
            return 1;
        }
     
       return getFibonacci(number - 1) + getFibonacci(number - 2);
    }
	
}
