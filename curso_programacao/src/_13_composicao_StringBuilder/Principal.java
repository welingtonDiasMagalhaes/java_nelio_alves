package _13_composicao_StringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//post 1
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow thats hasome!");
		
		Post p1 = new Post(
				sdf.parse("21/02/2018 13:12:13"),
				"Travelling to New Zeland",
				"visit to wonderfull country",
				12);
		//Post(Date moment, String title, String content, Integer likes))
		//adicionando os comentários
		p1.addComment(c1);
		p1.addComment(c2);
		
		//post 2
		Comment c3 = new Comment("Have a nice trip!");
		Comment c4 = new Comment("Wow thats hasome!");
		
		Post p2 = new Post(
				sdf.parse("11/11/1111 11:12:13"),
				"Good night!",
				"See you tomorrow",
				33);
		//Post(Date moment, String title, String content, Integer likes))
		//adicionando os comentários
		p2.addComment(c3);
		p2.addComment(c4);
		
		//para exibir: vai chamar o toString na classe Post
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		
		//post 2
		
		
	}
}
