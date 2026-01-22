package org.example.chess;

import org.example.gameboard.BoardException;

public class ChessException extends BoardException {
    public ChessException(String message) {
        super(message);
    }
}
