package controller;

public class RepeteDois {

	public RepeteDois() {
		super();
	}
	
	public int repeteDois(int n, int two) {
		//Condição de parada
		if(n == 0) {
			return 0;
		} else {
			//Chamada da Função
			if(n%10 == two) {
				return 1 + repeteDois(n/10, two);
			} else {
				return repeteDois(n/10, two);
			}
		}
	}

}
