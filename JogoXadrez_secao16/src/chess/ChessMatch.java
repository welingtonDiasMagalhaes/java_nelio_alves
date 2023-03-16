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
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//para iniciar
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new king(board, Color.BLACK));
		placeNewPiece('e', 1, new king(board, Color.WHITE));
	}
	
}
