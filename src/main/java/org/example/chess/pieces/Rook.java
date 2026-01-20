package org.example.chess.pieces;

import org.example.chess.ChessPiece;
import org.example.chess.Color;
import org.example.gameboard.Board;

public class Rook extends ChessPiece {


    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }


    }
