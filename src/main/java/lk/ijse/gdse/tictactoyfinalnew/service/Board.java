package lk.ijse.gdse.tictactoyfinalnew.service;

public interface Board {
    void initializeBoard();

    boolean isLegalMove(int row, int col);

    void updateMove(int row, int col, Piece piece);

    Winner checkWinner();

}
