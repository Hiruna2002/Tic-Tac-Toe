package lk.ijse.gdse.tictactoyfinalnew.service;

public class HumanPlayer extends Player {

    public HumanPlayer(lk.ijse.gdse.tictactoyfinalnew.service.BoardImpl board) {
        super(board);
    }

    @Override
    public void move(int row, int col) {
        if(board.isLegalMove(row, col)){
            board.updateMove(row, col, Piece.X);
        }
    }
}
