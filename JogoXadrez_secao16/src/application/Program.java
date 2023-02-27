package application;

import boardgame.Board;
import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		
		Position p = new Position(3, 5);
		System.out.println(p.toString());
		
		Board board = new Board(8,8);

	}

}
