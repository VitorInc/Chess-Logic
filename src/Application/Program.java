package Application;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;

import java.awt.*;

public class Program {
    public static void main(String[] args) {

        ChessMatch partida = new ChessMatch();
        UI.printBoard(partida.getPieces());

    }
}
