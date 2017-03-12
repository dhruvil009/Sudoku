/**
 * Created by admin on 03-02-2017.
 */
@SuppressWarnings("DefaultFileTemplate")
public class Experiment {
    private int[][] board=new int[9][9];
    int i,j;
    int boxer_x,boxer_y;
    int count=0;
    Boolean backtrack=true;
    private Experiment(int[][] board)
    {
        this.board=board;
    }
    String printFileBoard() {
        String string = "";
        string = string + "*********************\n";
        for(int x=0;x<9;x++) {
            if (x == 3 || x == 6)
                string = string + "*********************\n";
            for (int y = 0; y < 9; y++) {
                if (y == 3 || y == 6)
                    string = string + " * ";
                string = string + board[x][y] + " ";
            }
            string = string + "\n";
        }
        string = string + "*********************\n";
        return string;
    }
    private void printBoard()
    {
        System.out.println("*********************");
        for(int x=0;x<9;x++) {
            if (x == 3 || x == 6)
                System.out.println("*********************");
            for (int y = 0; y < 9; y++) {
                if (y == 3 || y == 6)
                    System.out.print("* ");
                System.out.print(board[x][y] + " ");
            }
            System.out.println();
        }
    }
    private Boolean isFull()
    {
        int flag=0;
        for(int x=0;x<9;x++) {
            for (int y = 0; y < 9; y++) {
                if (board[x][y] == 0) {
                    flag = 1;
                }
            }
        }
        return flag != 1;
    }
    public boolean solver(int[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        board[r][c] = k;
                        if (isValid(board, r, c) && solver(board)) {
                            return true;
                        } else {
                            board[r][c] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(int[][] board, int r, int c) {
        //check row
        boolean[] row = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (board[r][i] >= 1 && board[r][i] <= 9) {
                if (row[board[r][i] - 1] == false) {
                    row[board[r][i] - 1] = true;
                } else {
                    return false;
                }
            }
        }

        //check column
        boolean[] col = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (board[i][c] >= 1 && board[i][c] <= 9) {
                if (col[board[i][c] - 1] == false) {
                    col[board[i][c] - 1] = true;
                } else {
                    return false;
                }
            }
        }

        //check the 3*3 grid
        boolean[] grid = new boolean[9];
        for (int i = (r / 3) * 3; i < (r / 3) * 3 + 3; i++) {
            for (int j = (c / 3) * 3; j < (c / 3) * 3 + 3; j++) {
                if (board[i][j] >= 1 && board[i][j] <= 9) {
                    if (grid[board[i][j] - 1] == false) {
                        grid[board[i][j] - 1] = true;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
    private int possibleEntries()
    {
        String possibility="";
        int value;

        if(!Horizon(1) && !Vertical(1) && !Box(1))
            possibility+=1;
        if(!Horizon(2) && !Vertical(2) && !Box(2))
            possibility+=2;
        if(!Horizon(3) && !Vertical(3) && !Box(3))
            possibility+=3;
        if(!Horizon(4) && !Vertical(4) && !Box(4))
            possibility+=4;
        if(!Horizon(5) && !Vertical(5) && !Box(5))
            possibility+=5;
        if(!Horizon(6) && !Vertical(6) && !Box(6))
            possibility+=6;
        if(!Horizon(7) && !Vertical(7) && !Box(7))
            possibility+=7;
        if(!Horizon(8) && !Vertical(8) && !Box(8))
            possibility+=8;
        if(!Horizon(9) && !Vertical(9) && !Box(9))
            possibility+=9;

        if(possibility.length()==1) {
            value = Integer.parseInt(possibility);
            backtrack=true;
            count++;
            System.out.println("Found "+count);
            printBoard();
        }
        else
            value = 0;
        return value;
    }

    private boolean Box(int k) {
        getBox();
        for(int x=boxer_x;x<boxer_x+3;x++)
        {
            for(int y=boxer_y;y<boxer_y+3;y++)
            {
                if(board[x][y]==k)
                    return true;
            }
        }
        return false;
    }

    private void getBox() {
        if(i<3)
        {
            boxer_x=0;
        }
        else if(i<6)
        {
            boxer_x=3;
        }
        else
        {
            boxer_x=6;
        }
        if(j<3)
        {
            boxer_y=0;
        }
        else if(j<6)
        {
            boxer_y=3;
        }
        else
        {
            boxer_y=6;
        }
    }

    private boolean Vertical(int k) {
        for(int x=0;x<9;x++)
            if(board[x][j]==k)
                return true;
        return false;
    }

    private boolean Horizon(int k) {
        for(int x=0;x<9;x++)
            if(board[i][x]==k)
                return true;
        return false;
    }

    public static void main(String args[])
    {
        int SudokuBoard[][] = new int[9][9];
        SudokuBoard[0][0] = 0;
        SudokuBoard[0][1] = 0;
        SudokuBoard[0][2] = 0;
        SudokuBoard[0][3] = 3;
        SudokuBoard[0][4] = 0;
        SudokuBoard[0][5] = 0;
        SudokuBoard[0][6] = 2;
        SudokuBoard[0][7] = 0;
        SudokuBoard[0][8] = 0;
        SudokuBoard[1][0] = 0;
        SudokuBoard[1][1] = 0;
        SudokuBoard[1][2] = 0;
        SudokuBoard[1][3] = 0;
        SudokuBoard[1][4] = 0;
        SudokuBoard[1][5] = 8;
        SudokuBoard[1][6] = 0;
        SudokuBoard[1][7] = 0;
        SudokuBoard[1][8] = 0;
        SudokuBoard[2][0] = 0;
        SudokuBoard[2][1] = 7;
        SudokuBoard[2][2] = 8;
        SudokuBoard[2][3] = 0;
        SudokuBoard[2][4] = 6;
        SudokuBoard[2][5] = 0;
        SudokuBoard[2][6] = 3;
        SudokuBoard[2][7] = 4;
        SudokuBoard[2][8] = 0;
        SudokuBoard[3][0] = 0;
        SudokuBoard[3][1] = 4;
        SudokuBoard[3][2] = 2;
        SudokuBoard[3][3] = 5;
        SudokuBoard[3][4] = 1;
        SudokuBoard[3][5] = 0;
        SudokuBoard[3][6] = 0;
        SudokuBoard[3][7] = 0;
        SudokuBoard[3][8] = 0;
        SudokuBoard[4][0] = 1;
        SudokuBoard[4][1] = 0;
        SudokuBoard[4][2] = 6;
        SudokuBoard[4][3] = 0;
        SudokuBoard[4][4] = 0;
        SudokuBoard[4][5] = 0;
        SudokuBoard[4][6] = 4;
        SudokuBoard[4][7] = 0;
        SudokuBoard[4][8] = 9;
        SudokuBoard[5][0] = 0;
        SudokuBoard[5][1] = 0;
        SudokuBoard[5][2] = 0;
        SudokuBoard[5][3] = 0;
        SudokuBoard[5][4] = 8;
        SudokuBoard[5][5] = 6;
        SudokuBoard[5][6] = 1;
        SudokuBoard[5][7] = 5;
        SudokuBoard[5][8] = 0;
        SudokuBoard[6][0] = 0;
        SudokuBoard[6][1] = 3;
        SudokuBoard[6][2] = 5;
        SudokuBoard[6][3] = 0;
        SudokuBoard[6][4] = 9;
        SudokuBoard[6][5] = 0;
        SudokuBoard[6][6] = 7;
        SudokuBoard[6][7] = 6;
        SudokuBoard[6][8] = 0;
        SudokuBoard[7][0] = 0;
        SudokuBoard[7][1] = 0;
        SudokuBoard[7][2] = 0;
        SudokuBoard[7][3] = 7;
        SudokuBoard[7][4] = 0;
        SudokuBoard[7][5] = 0;
        SudokuBoard[7][6] = 0;
        SudokuBoard[7][7] = 0;
        SudokuBoard[7][8] = 0;
        SudokuBoard[8][0] = 0;
        SudokuBoard[8][1] = 0;
        SudokuBoard[8][2] = 9;
        SudokuBoard[8][3] = 0;
        SudokuBoard[8][4] = 0;
        SudokuBoard[8][5] = 5;
        SudokuBoard[8][6] = 0;
        SudokuBoard[8][7] = 0;
        SudokuBoard[8][8] = 0;
        Experiment me = new Experiment(SudokuBoard);
        me.printBoard();
        me.solver(SudokuBoard);
    }
}
