package secao16_xadrez.boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}


/*	public boolean possibleMoves() {
		
	}
	
	public boolean possibleMove(Position p) {
		
	}
	
	public boolean isThereAnyPossibleMove() {
		
	}
	*/
	
}
