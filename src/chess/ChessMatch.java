package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);	//Essa classe é que define o tamanho do tabuleiro.
	}
	
	//O programa conhece apenas a camada Chess e não a de tabuleiro (Board).

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);	//Faz o downcasting para ChessPiece
			}
		}
		return mat;
	}
}