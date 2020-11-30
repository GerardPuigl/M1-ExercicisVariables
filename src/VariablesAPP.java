
public class VariablesAPP {

	public static void main(String[] args) {

		// Declaración y inicialización de nombre,apellidos y fecha de nacimiento
		String nom = "Gerard", cognom1 = "Puig", cognom2 = "Latorre";
		int dia = 01, mes = 01, any = 1990;

		System.out.println(nom + " " + cognom1 + " " + cognom2);
		System.out.println(dia + "/" + mes + "/" + any);
		
		// Cáculo de numeros años de traspaso respecto al 1948 como año de referencia.
		final int REFTRASPAS = 1948;
		int ntraspas;
		ntraspas = (any - REFTRASPAS) / 4;
		
		System.out.println("Anys de traspas entre el teu aniversari i el 1948: "+ntraspas);
		
		//Mostrar anys de traspàs
		int anytraspas=REFTRASPAS;
		for (int i = 0; i < ntraspas; i++) {
			anytraspas=anytraspas+4;				
			System.out.println(anytraspas);
		}
		boolean bool=(any==anytraspas);
		if (bool){
			System.out.println("El meu any de naixement és de traspàs.");
		}else{
			System.out.println("El meu any de naixement no és de traspàs.");	
		}

	}
}
