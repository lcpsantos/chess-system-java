package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";//Rook
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //above
        p.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//while position exists and there is no piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
            p.setRow(p.getRow() - 1);//move to the next position
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {//if position exists and there is an opponent piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
        }

        //left
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//while position exists and there is no piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
            p.setColumn(p.getColumn() - 1);//move to the next position
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {//if position exists and there is an opponent piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
        }

        //right
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//while position exists and there is no piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
            p.setColumn(p.getColumn() + 1);//move to the next position
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {//if position exists and there is an opponent piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
        }

        //below
        p.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//while position exists and there is no piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
            p.setRow(p.getRow() + 1);//move to the next position
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {//if position exists and there is an opponent piece
            mat[p.getRow()][p.getColumn()] = true;//can move to this position
        }
        return mat;
    }
}
