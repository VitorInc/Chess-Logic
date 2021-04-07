package Application;


import boardGame.Board;
import boardGame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while(true) {
            try{
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("source: ");
                ChessPosition source =UI.readChessPosition(in);

                System.out.println();
                System.out.print("target: ");
                ChessPosition target =UI.readChessPosition(in);

                ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
            }
            catch (ChessException e){
                System.out.println(e.getMessage());
                in.nextLine();
            }

        }
    }
}
