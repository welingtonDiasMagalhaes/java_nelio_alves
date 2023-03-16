package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces; //matriz de peças
	
	public Board(int rows, int columns) {

		super();
		if(rows <1 || columns < 1) {
			throw new BoardException("error creating board: there must be at least 1 row and 1 column!");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	/*
	 * public void setRows(int rows) { this.rows = rows; }
	 */

	public int getColumns() {
		return columns;
	}

	/*
	 * public void setColumns(int columns) { this.columns = columns; }
	 */
	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on board!");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on board!");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("there is already a piece on position: "+ position);
		}
		//posicionando a peça
		pieces[position.getRow()][position.getColumn()] = piece;
		//peça recebe a sua posição
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 &&  row < this.rows && column >= 0 && column < this.columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on board!");
		}
		return this.piece(position) != null;
	}

}
