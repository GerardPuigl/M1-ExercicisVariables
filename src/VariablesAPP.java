
public class VariablesAPP {

	public static void main(String[] args) {
		
		//Declaraci� i inicializaci� de noms,cognoms y data de neixement
		String nom="Pep",cognom1="Botella",cognom2="Mares";
		int dia=18,mes=01,any=1984;
		System.out.println(nom+" "+cognom1+" "+cognom2);
		System.out.println(dia+"/"+mes+"/"+any);
		
		//C�lcul anys de trasp�s
		final int REFTRASPAS=1948;
		int ntraspas;
		ntraspas=(any-REFTRASPAS)/4;
		System.out.println(ntraspas);
		
		//Mostrar anys de trasp�s
		int anytraspas=REFTRASPAS;
		for (int i = 0; i < ntraspas; i++) {
			anytraspas=anytraspas+4;				
			System.out.println(anytraspas);
			}
		boolean bool=(any==anytraspas);
		if (bool){
			System.out.println("El meu any de naixement �s de trasp�s.");
			}else{
			System.out.println("El meu any de naixement no �s de trasp�s.");	
			}

		}

}
