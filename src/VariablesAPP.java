
public class VariablesAPP {

	public static void main(String[] args) {
		
		//Declaraci�n y inicializaci�n de nombre,apellidos y fecha de nacimiento
		
		String nom="Pep",cognom1="Botella",cognom2="Mares";
		int dia=18,mes=01,any=1984;
		
		//C�lculo de n�meros a�os de traspaso
		
		final int REFTRASPAS=1948;
		int ntraspas;
		ntraspas=(any-REFTRASPAS)/4;
		
		//B�cle de a�os de traspaso y c�lculo si es un a�o de traspaso
		
		int anytraspas=REFTRASPAS;
		for (int i = 0; i < ntraspas; i++) {
			anytraspas=anytraspas+4;				
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
		}
}
