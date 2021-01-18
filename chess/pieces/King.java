package secao16_xadrez.chess.pieces;

import secao16_xadrez.boardgame.Board;
import secao16_xadrez.chess.ChessPiece;
import secao16_xadrez.chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}
	

}
