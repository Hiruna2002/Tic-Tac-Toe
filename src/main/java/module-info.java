module lk.ijse.gdse.tictactoyfinalnew {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.gdse.tictactoyfinalnew.controller to javafx.fxml;
    exports lk.ijse.gdse.tictactoyfinalnew;
}