package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;
import chess.pieces.king;

public class ChessMatch {
	private Board board; //a partida precisa de um tabuleiro

	public ChessMatch() {
		super();
		board = new Board(8,8); //define o tamanho do tabuleiro
		//para iniciar a partida
		initialSetup();
	} 
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		
		return mat;
	}
	
	//para iniciar
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new king(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new king(board, Color.WHITE), new Position(7, 4));
	}
	
}
