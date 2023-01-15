package _10_memoriaArrayLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _Listas {

	public static void main(String[] args) {
		/*
		 * slide 26 e 27
		 * • Lista é uma estrutura de dados:
		 * Homogênea (dados do mesmo tipo) 
		 * Ordenada (elementos acessados por meio de posições)
		 * Inicia vazia, e seus elementos são alocados sob demanda
		 * Cada elemento ocupa um "nó" (ou nodo) da lista
		 * • Tipo (interface): List. Não é uma classe. Como é uma interface, não pode ser instanciada.
		 * • Classes que implementam: ArrayList, LinkedList, etc.
		 * • Vantagens: 
		 * 	Tamanho variável
		 *	Facilidade para se realizar inserções e deleções
		 * • Desvantagens: 
		 *  Acesso sequencial aos elementos. o ArrayList<> otimiza a lista e minimiza esse problema.
		 */

		//usar classe wrapper para lista!
		List<String> list = new ArrayList<>();
		//list<> -> o <> é o genérics: parametriza o tipo <String>, <Integer> ...
		//List<String> list = new List<>(); -> não pode instanciar a lista, pois é uma interface.
		//	tem que ser uma classe que a implementa ArrayList, LinkedList, etc.
		
		//Adiconar elemento
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //list.add(posicao,elemento)

		//Tamanho da lista
		System.out.println(list.size());

		//percorrendo a lista
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		//remoção de elementos
		list.remove("Anna"); //remoção por comparação
		list.remove(1); //remoção por posição
		list.removeIf(x -> x.charAt(0) == 'M'); //removeIf(): remoção por predicado -> v ou f
		
		for (String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------");
		//encontrando a posição
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //quando não encontra retorna -1
		
		System.out.println("---------------------");
		//para filtrar a lista.
		//List<String> result = -> Deve criar uma nova
		//list.stream() -> a partir do java 8, para trabalhar com expressões lambda deve converter para stream
		//filter(x -> x.charAt(0) == 'A') filtra por uma expressao lambda
		//collect(Collectors.toList()); -> para converter o stream para lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		//.findFirst().orElse(null) -> primeiro elemento e se não encontrar retorna nullo
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);

	}

}
