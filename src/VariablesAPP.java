
public class VariablesAPP {

	public static void main(String[] args) {
		
		//Declaració i inicializació de noms,cognoms y data de neixement
		String nom="Pep",cognom1="Botella",cognom2="Mares";
		int dia=18,mes=01,any=1984;
		System.out.println(nom+" "+cognom1+" "+cognom2);
		System.out.println(dia+"/"+mes+"/"+any);
		
		//Cálcul anys de traspàs
		final int REFTRASPAS=1948;
		int ntraspas;
		ntraspas=(any-REFTRASPAS)/4;
		System.out.println(ntraspas);
		
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
