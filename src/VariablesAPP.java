
public class VariablesAPP {

	public static void main(String[] args) {
		
		//Declaración y inicialización de nombre,apellidos y fecha de nacimiento
		
		String nom="Pep",cognom1="Botella",cognom2="Mares";
		int dia=18,mes=01,any=1984;
		
		//Cálculo de números años de traspaso
		
		final int REFTRASPAS=1948;
		int ntraspas;
		ntraspas=(any-REFTRASPAS)/4;
		
		//Búcle de años de traspaso y cálculo si es un año de traspaso
		
		int anytraspas=REFTRASPAS;
		for (int i = 0; i < ntraspas; i++) {
			anytraspas=anytraspas+4;				
			}
		boolean bool=(any==anytraspas);

		//Unir la informació en variables e imprimir
		
		String nomcomplet= nom+" "+cognom1+" "+cognom2;
		String dataneixement = dia+"/"+mes+"/"+any;
		System.out.println(nomcomplet);
		System.out.println(dataneixement);		
		if (bool){
			System.out.println("El meu any de naixement és de traspàs.");
			}else{
			System.out.println("El meu any de naixement no és de traspàs.");	
			}
		}
}
