package boardgame;

public class Piece {
	protected Position position; //protected para que a position referida aqui seja visivel nesse pacote e subclasses
	private Board board;
	
	//para criar uma peça tem que informar o board (tabuleiro) e a position inicia com null
	public Piece(Board board) {
		super();
		this.board = board;
		this.position = null; //não precisa colocar, pois o padrão a instanciar é null
	}

	//somente classes desse pacote e subclasses poderão acessar
	protected Board getBoard() {
		return board;
	}

	/*
	 * não permite alteração no tabuleiro
	 * public void setBoard(Board board) { this.board = board; }
	 */	
}
