/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku_Final;

/**
 *
 * @author Admin
 */
public class Violater {
    int boxer_x,boxer_y;
    int i,j;
    int [][] board = new int[9][9];
    boolean violate;
    Boolean Validate(int[][] board)
    {
        this.board = board;
        
        for(int l=0;l<9;l++)
        {
            for (int k=0;k<9;k++)
            {
                i=l;j=k;
                violate = Horizon(board[l][k],l,k) || Vertical(board[l][k],l,k) || Box(board[l][k],l,k);                
                if(violate == true && board[l][k]!=0)
                    return false;
            }
        }
        return true;
    }
    
    private boolean Box(int k,int row,int col) {
        getBox();
        for(int x=boxer_x;x<boxer_x+3;x++)
        {
            for(int y=boxer_y;y<boxer_y+3;y++)
            {
                if(board[x][y]==k && (x!=row && y!=col))
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

    private boolean Vertical(int k,int row, int col) {
        for(int x=0;x<9;x++)
            if(board[x][col]==k && (x!=row))
                return true;
        return false;
    }

    private boolean Horizon(int k,int row,int col) {
        for(int x=0;x<9;x++)
            if(board[row][x]==k && x!=col)
                return true;
        return false;
    }
}
