package boardgame;

public abstract class Piece {

	protected Position position;	// Como ainda não é uma posição definitiva da peça, não deve
	private Board board;			// aparecer no tabuleiro. Por isso o protected.

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {	// Protected porque não deve ser acessado por todas as classes.
		return board;				// só por classes específicas
	}
	
	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
