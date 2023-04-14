package _10_memoriaArrayLista;

public class _BoxingUnboxingWrapper {
	public static void main(String[] args) {
	
		/*
		 * Boxing
			É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível
			ver slide 21
		 */
		int x = 20;
		Object obj = x;
		System.out.println("boxing "+ x);
		
		/*
		 * UNBOXING
		 * É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível
		 */
		int y = (int) obj;
		System.out.println("unboxing "+ y);
		
		/*
		 * wrapper
		 * São classes equivalentes aos tipos primitivos. Cada tipo primitivo tem a sua. Iniciam em maiusculo
		• vantagem: Boxing e unboxing de forma natural
		• Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!): uso de BD
		 Pois tipos referência (classes) aceitam valor null e usufruem dos recursos OO:
		 	Tipo primitivo 	Classe Wrapper 	Argumentos do construtor
			Boolean 		Boolean 		booleanou String
			byte 			Byte 			byte ou String
			char 			Character 		char
			Int 			Integer 		int ou String
			float 			Float 			float, double ou String
			double 			Double 			double ou String
			long 			Long 			long ou String
			short 			Short 			short ou String
		 */
		 int w = 22;
		 Integer obj2 = w;
		 int z = obj2; //não precisa do casting devido ao Integer -> wrapper
		 System.out.println("test wrapper "+ z);
		
	}
}
