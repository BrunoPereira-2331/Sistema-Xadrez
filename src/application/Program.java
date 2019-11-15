package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch CM = new ChessMatch();
		UI.printBoard(CM.getPieces());
		
	}

}
