package boardgame;

public class Piece {

	protected Position position;	// Como ainda não é uma posição definitiva da peça, não deve
	private Board board;			// aparecer no tabuleiro. Por isso o protected.

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {	// Protected porque não deve ser acessado por todas as classes.
		return board;				// só por classes específicas
	}
}
