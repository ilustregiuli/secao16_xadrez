package secao16_xadrez.chess.pieces;

import secao16_xadrez.boardgame.Board;
import secao16_xadrez.chess.ChessPiece;
import secao16_xadrez.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
}
