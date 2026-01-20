package org.example.chess.pieces;

import org.example.chess.ChessPiece;
import org.example.chess.Color;
import org.example.gameboard.Board;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
