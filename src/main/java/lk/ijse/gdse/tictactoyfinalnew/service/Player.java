package lk.ijse.gdse.tictactoyfinalnew.service;

public abstract class Player {

    protected lk.ijse.gdse.tictactoyfinalnew.service.BoardImpl board;

    public Player(lk.ijse.gdse.tictactoyfinalnew.service.BoardImpl board) {
        this.board = board;
    }

    public abstract void move(int row, int col);

}
