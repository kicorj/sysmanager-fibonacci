package br.com.challenge.sysmanager.sysmanager_fibonacci;

public class IterationsLimitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IterationsLimitException(int limit) {
		super("O número máximo de iterações é " + limit);
	}

}
