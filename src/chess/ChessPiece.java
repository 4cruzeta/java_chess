package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {		//extends - subclasse de Piece.

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);								// Construtor com superclasse board.
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
