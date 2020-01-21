package application;

import boardGame.Board;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch CM = new ChessMatch();
		UI.printBoard(CM.getPieces());
		/*Board board = new Board(8, 8);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());*/
		
		
	}

}
