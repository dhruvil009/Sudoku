/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku_Final;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Solvable {
    int board[][];
    int i,j;
    boolean Flag=false;
    Kernel ker = new Kernel();
    boolean check(int[][] sudoku)
    {
        sudokuSolver(board);
        return Flag;
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
    protected void sudokuSolver(int[][] board) {
        this.board=board;
        int r,c;
        int solve = 0;
        while(!isFull())
        {
            if(ker.backtrack) {
                r = 0;
                c = 0;
                ker.backtrack=false;
            } else {
                if(j==8)
                {
                    //System.out.println("c set");
                    c=0;
                    r = (i+1)%9;
                }
                else
                {
                    //System.out.println("r set");
                    r = i;
                    c = j+1;
                }
            }
            Loop:
            for (int x = r; x < 9; x++) {
                for (int y = c; y < 9; y++){
                    c=0;
                    solve++;
                    if (board[x][y] == 0) {
                        i = x;
                        j = y;
                        break Loop;
                    }
            }
            }
            if(solve<10000)
                board[i][j] = ker.possibleEntries();
            else
                break;
        }
        
        if (isFull())
        {
            Flag=true;
        }
    }
}
