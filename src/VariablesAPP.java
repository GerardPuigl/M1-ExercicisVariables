
public class VariablesAPP {

	public static void main(String[] args) {
		
		//Declaraci�n y inicializaci�n de nombre,apellidos y fecha de nacimiento
		
		String nom="Pep",cognom1="Botella",cognom2="Mares";
		int dia=18,mes=01,any=1984;
		
		//C�culo de numeros a�os de traspaso respecto al 1948 como a�o de referencia.
		
		final int REFTRASPAS=1948;
		int ntraspas;
		ntraspas=(any-REFTRASPAS)/4;
		
		//Bucle de a�os de traspaso y calculo si es un ano de traspaso
		
		int anytraspas=REFTRASPAS;
		for (int i = 0; i < ntraspas; i++) {
			anytraspas=anytraspas+4;				
		}
		boolean bool=(any==anytraspas);

		//Unir la informaci�n en variables e imprimir
		
		String nomcomplet= nom+" "+cognom1+" "+cognom2;
		String dataneixement = dia+"/"+mes+"/"+any;
		System.out.println(nomcomplet);
		System.out.println(dataneixement);		
		if (bool){
			System.out.println("El meu any de naixement �s de trasp�s.");
		}else{
			System.out.println("El meu any de naixement no �s de trasp�s.");
			
		}
	}
}
