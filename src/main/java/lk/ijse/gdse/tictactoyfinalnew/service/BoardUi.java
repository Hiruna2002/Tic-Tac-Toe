package lk.ijse.gdse.tictactoyfinalnew.service;

public interface BoardUi {
    void update(int row, int col, Piece piece);
    void NotifyWinner(Piece winner);

}
