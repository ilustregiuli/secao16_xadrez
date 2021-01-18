package secao16_xadrez.chess;

import secao16_xadrez.boardgame.Board;
import secao16_xadrez.boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	

}
