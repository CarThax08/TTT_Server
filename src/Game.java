import java.util.Arrays;
import java.util.Objects;

public class Game {

    public String[][] board;

    public Client player1;
    public Client player2;

    public Game(){
        board = new String[][]{new String[]{" ", " ", " "}, new String[]{" ", " ", " "}, new String[]{" ", " ", " "}};
    }

    public boolean changeSpace(int x, int y, String letter){
        if (Objects.equals(board[x][y], " ")){
            board[x][y] = letter;
            return true;
        }else{
            return false;
        }
    }

    public Client checkWin(){
        for(String[] row : board){
            if(Arrays.stream(row).allMatch(x -> Objects.equals(x, "X"))){
                return player1;
            }
            if(Arrays.stream(row).allMatch(x -> Objects.equals(x, "O"))){
                return player2;
            }
        }
        if(Objects.equals(board[0][0], "X") && Objects.equals(board[0][1], "X") && Objects.equals(board[0][2], "X")){
            return player1;
        }
        if(Objects.equals(board[0][0], "O") && Objects.equals(board[0][1], "O") && Objects.equals(board[0][2], "O")){
            return player2;
        }

        return null;
    }

}
