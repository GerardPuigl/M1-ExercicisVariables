public class VariablesAPP {

	public static void main(String[] args) {

		// Declaraci� i inicialitzaci� de nom, cognom i data de naixement.
		String nom = "Gerard", cognom1 = "Puig", cognom2 = "Latorre";
		int dia = 01, mes = 01, any = 1984;

		// C�cul de n�meros d'anys de trasp�s respecte 1948 com any de refer�ncia.
		final int REFTRASPAS = 1948;
		int ntraspas;
		ntraspas = (any - REFTRASPAS) / 4;
		
		// System.out.println("Anys de traspas entre el teu aniversari i el 1948: "+ntraspas);
		
		//Mostrar anys de trasp�s
		int anytraspas=REFTRASPAS;
		for (int i = 0; i < ntraspas; i++) {
			anytraspas=anytraspas+4;				
		//	System.out.println(anytraspas);
		}
		boolean bool=(any==anytraspas);

		//Unir la informaci� en variables e imprimir
		
		String nomcomplet= nom+" "+cognom1+" "+cognom2;
		String dataneixement = dia+"/"+mes+"/"+any;
		System.out.println(nomcomplet);
		System.out.println(dataneixement);		
		if (bool){
			System.out.println("El meu any de naixement �s de trasp�s.");
		}else{
			System.out.println("El meu any de naixement no �s de trasp�s.");
			
		}
		
		//Nivell 2, declarar una variable double i fer cast a les altres 
		double varDouble= 0.1342;
		int varInt;
		float varFloat;
		String varString;
		
		varInt = (int)varDouble;
		varFloat = (float)varDouble;
		varString = String.valueOf(varDouble);
		
		System.out.println("Cast int: " +  varInt);
		System.out.println("Cast float: " +  varFloat);
		System.out.println("Cast String: " +  varString);
		

	}
}
