package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //nw - northwest
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//while position exists and there is no piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
            p.setValues(p.getRow() - 1, p.getColumn() - 1);//move to the next position
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {//if position exists and there is an opponent piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
        }

        //ne - northeast
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//while position exists and there is no piece
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);//move to the next position
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {//if position exists and there is an opponent piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
        }

        //se - southeast
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//while position exists and there is no piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
            p.setValues(p.getRow() + 1, p.getColumn() + 1);//move to the next position
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {//if position exists and there is an opponent piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
        }

        //sw - southwest
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//while position exists and there is no piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
           p.setValues(p.getRow() + 1, p.getColumn() - 1);//move to the next position
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {//if position exists and there is an opponent piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
        }
        return mat;
    }
}
