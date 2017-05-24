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
public class Kernel {
    //Generator gen = new Generator();
    private int[][] board;
    int Flag=0;
    int i,j;
    int boxer_x,boxer_y;
    int count=0;
    Boolean backtrack=true;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_menu().setVisible(true);
            }
        });
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
    protected int[][] sudokuSolver(int[][] board) {
        this.board=board;
        int r,c;
        int solve = 0;
        while(!isFull())
        {
            if(backtrack) {
                r = 0;
                c = 0;
                backtrack=false;
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
            if(solve<1000000)
                board[i][j] = possibleEntries();
            else
                break;
        }
        
        if (isFull())
        {
            String result = "Board Solved successfully in "+solve+" iterations";
            JOptionPane.showMessageDialog(null, result);
            Flag=1;
        }
        else
        {
            String result = "Tried Solving for a million iterations"+"\n"+"Sudoku Valid yet unsolvable";
            JOptionPane.showMessageDialog(null, result);
        }
        return board;
    }
    protected boolean IsSolvable(int[][] board)
    {
        sudokuSolver(board);
        return Flag!=0;
    }
    protected int possibleEntries()
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
    protected void printBoard()
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
    
}
