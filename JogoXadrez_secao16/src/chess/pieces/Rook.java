package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	//toString() para colocar a inicial da peça no tabuleiro
	@Override
	public String toString() {
		return "R";
	}
	
	

}
