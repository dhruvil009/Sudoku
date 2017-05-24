/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku_Final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Generator {
    int sudoku1[][] = new int[9][9];
    int sudoku2[][] = new int[9][9];
    int sudoku3[][] = new int[9][9];
    int sudoku4[][] = new int[9][9];
    int sudoku5[][] = new int[9][9];
    int board[][];
    int boxer_x,boxer_y;
    int i,j;
    
    public Generator() {
        /*getSudoku(1);
        getSudoku(2);
        getSudoku(3);
        getSudoku(4);
        getSudoku(5);
        *//*
        sudoku1[0][0] = 0;
        sudoku1[0][1] = 3;
        sudoku1[0][2] = 0;
        sudoku1[0][3] = 8;
        sudoku1[0][4] = 0;
        sudoku1[0][5] = 0;
        sudoku1[0][6] = 0;
        sudoku1[0][7] = 0;
        sudoku1[0][8] = 0;
        sudoku1[1][0] = 9;
        sudoku1[1][1] = 0;
        sudoku1[1][2] = 5;
        sudoku1[1][3] = 6;
        sudoku1[1][4] = 0;
        sudoku1[1][5] = 0;
        sudoku1[1][6] = 7;
        sudoku1[1][7] = 0;
        sudoku1[1][8] = 0;
        sudoku1[2][0] = 0;
        sudoku1[2][1] = 0;
        sudoku1[2][2] = 1;
        sudoku1[2][3] = 0;
        sudoku1[2][4] = 9;
        sudoku1[2][5] = 3;
        sudoku1[2][6] = 2;
        sudoku1[2][7] = 0;
        sudoku1[2][8] = 0;
        sudoku1[3][0] = 8;
        sudoku1[3][1] = 0;
        sudoku1[3][2] = 6;
        sudoku1[3][3] = 5;
        sudoku1[3][4] = 0;
        sudoku1[3][5] = 0;
        sudoku1[3][6] = 0;
        sudoku1[3][7] = 0;
        sudoku1[3][8] = 0;
        sudoku1[4][0] = 0;
        sudoku1[4][1] = 4;
        sudoku1[4][2] = 0;
        sudoku1[4][3] = 0;
        sudoku1[4][4] = 3;
        sudoku1[4][5] = 0;
        sudoku1[4][6] = 0;
        sudoku1[4][7] = 0;
        sudoku1[4][8] = 0;
        sudoku1[5][0] = 0;
        sudoku1[5][1] = 0;
        sudoku1[5][2] = 0;
        sudoku1[5][3] = 0;
        sudoku1[5][4] = 0;
        sudoku1[5][5] = 0;
        sudoku1[5][6] = 0;
        sudoku1[5][7] = 0;
        sudoku1[5][8] = 0;
        sudoku1[6][0] = 4;
        sudoku1[6][1] = 7;
        sudoku1[6][2] = 2;
        sudoku1[6][3] = 3;
        sudoku1[6][4] = 0;
        sudoku1[6][5] = 6;
        sudoku1[6][6] = 9;
        sudoku1[6][7] = 5;
        sudoku1[6][8] = 0;
        sudoku1[7][0] = 0;
        sudoku1[7][1] = 1;
        sudoku1[7][2] = 9;
        sudoku1[7][3] = 4;
        sudoku1[7][4] = 8;
        sudoku1[7][5] = 7;
        sudoku1[7][6] = 0;
        sudoku1[7][7] = 6;
        sudoku1[7][8] = 0;
        sudoku1[8][0] = 3;
        sudoku1[8][1] = 6;
        sudoku1[8][2] = 8;
        sudoku1[8][3] = 2;
        sudoku1[8][4] = 5;
        sudoku1[8][5] = 9;
        sudoku1[8][6] = 0;
        sudoku1[8][7] = 1;
        sudoku1[8][8] = 0;*/
        sudoku1=genx(sudoku1);
        int duplicate[][] = new int[9][9];
        /*copy(duplicate, sudoku1);
        while(new Kernel().IsSolvable(duplicate)!=true)
        {
            sudoku1 = new int[9][9];
            sudoku1 = genx(sudoku1);
            copy(duplicate,sudoku1);
        }*/
            
            
        sudoku5[0][0] = 0;
        sudoku5[0][1] = 1;
        sudoku5[0][2] = 7;
        sudoku5[0][3] = 0;
        sudoku5[0][4] = 3;
        sudoku5[0][5] = 4;
        sudoku5[0][6] = 5;
        sudoku5[0][7] = 8;
        sudoku5[0][8] = 0;
        sudoku5[1][0] = 0;
        sudoku5[1][1] = 5;
        sudoku5[1][2] = 0;
        sudoku5[1][3] = 6;
        sudoku5[1][4] = 8;
        sudoku5[1][5] = 9;
        sudoku5[1][6] = 0;
        sudoku5[1][7] = 0;
        sudoku5[1][8] = 0;
        sudoku5[2][0] = 0;
        sudoku5[2][1] = 0;
        sudoku5[2][2] = 3;
        sudoku5[2][3] = 7;
        sudoku5[2][4] = 5;
        sudoku5[2][5] = 1;
        sudoku5[2][6] = 2;
        sudoku5[2][7] = 0;
        sudoku5[2][8] = 0;
        sudoku5[3][0] = 0;
        sudoku5[3][1] = 0;
        sudoku5[3][2] = 0;
        sudoku5[3][3] = 1;
        sudoku5[3][4] = 7;
        sudoku5[3][5] = 8;
        sudoku5[3][6] = 3;
        sudoku5[3][7] = 9;
        sudoku5[3][8] = 2;
        sudoku5[4][0] = 0;
        sudoku5[4][1] = 0;
        sudoku5[4][2] = 0;
        sudoku5[4][3] = 3;
        sudoku5[4][4] = 4;
        sudoku5[4][5] = 0;
        sudoku5[4][6] = 7;
        sudoku5[4][7] = 0;
        sudoku5[4][8] = 6;
        sudoku5[5][0] = 0;
        sudoku5[5][1] = 0;
        sudoku5[5][2] = 0;
        sudoku5[5][3] = 9;
        sudoku5[5][4] = 2;
        sudoku5[5][5] = 0;
        sudoku5[5][6] = 0;
        sudoku5[5][7] = 0;
        sudoku5[5][8] = 0;
        sudoku5[6][0] = 0;
        sudoku5[6][1] = 0;
        sudoku5[6][2] = 0;
        sudoku5[6][3] = 4;
        sudoku5[6][4] = 1;
        sudoku5[6][5] = 3;
        sudoku5[6][6] = 0;
        sudoku5[6][7] = 0;
        sudoku5[6][8] = 0;
        sudoku5[7][0] = 0;
        sudoku5[7][1] = 0;
        sudoku5[7][2] = 2;
        sudoku5[7][3] = 5;
        sudoku5[7][4] = 6;
        sudoku5[7][5] = 0;
        sudoku5[7][6] = 9;
        sudoku5[7][7] = 0;
        sudoku5[7][8] = 3;
        sudoku5[8][0] = 0;
        sudoku5[8][1] = 0;
        sudoku5[8][2] = 0;
        sudoku5[8][3] = 0;
        sudoku5[8][4] = 0;
        sudoku5[8][5] = 0;
        sudoku5[8][6] = 0;
        sudoku5[8][7] = 0;
        sudoku5[8][8] = 0;

        sudoku4[0][0] = 0;
        sudoku4[0][1] = 3;
        sudoku4[0][2] = 0;
        sudoku4[0][3] = 8;
        sudoku4[0][4] = 0;
        sudoku4[0][5] = 0;
        sudoku4[0][6] = 0;
        sudoku4[0][7] = 0;
        sudoku4[0][8] = 0;
        sudoku4[1][0] = 9;
        sudoku4[1][1] = 0;
        sudoku4[1][2] = 5;
        sudoku4[1][3] = 6;
        sudoku4[1][4] = 0;
        sudoku4[1][5] = 0;
        sudoku4[1][6] = 7;
        sudoku4[1][7] = 0;
        sudoku4[1][8] = 0;
        sudoku4[2][0] = 0;
        sudoku4[2][1] = 0;
        sudoku4[2][2] = 1;
        sudoku4[2][3] = 0;
        sudoku4[2][4] = 9;
        sudoku4[2][5] = 3;
        sudoku4[2][6] = 2;
        sudoku4[2][7] = 0;
        sudoku4[2][8] = 0;
        sudoku4[3][0] = 8;
        sudoku4[3][1] = 0;
        sudoku4[3][2] = 6;
        sudoku4[3][3] = 5;
        sudoku4[3][4] = 0;
        sudoku4[3][5] = 0;
        sudoku4[3][6] = 0;
        sudoku4[3][7] = 0;
        sudoku4[3][8] = 0;
        sudoku4[4][0] = 0;
        sudoku4[4][1] = 4;
        sudoku4[4][2] = 0;
        sudoku4[4][3] = 0;
        sudoku4[4][4] = 3;
        sudoku4[4][5] = 0;
        sudoku4[4][6] = 0;
        sudoku4[4][7] = 0;
        sudoku4[4][8] = 0;
        sudoku4[5][0] = 0;
        sudoku4[5][1] = 0;
        sudoku4[5][2] = 0;
        sudoku4[5][3] = 0;
        sudoku4[5][4] = 0;
        sudoku4[5][5] = 0;
        sudoku4[5][6] = 0;
        sudoku4[5][7] = 0;
        sudoku4[5][8] = 0;
        sudoku4[6][0] = 4;
        sudoku4[6][1] = 7;
        sudoku4[6][2] = 2;
        sudoku4[6][3] = 3;
        sudoku4[6][4] = 0;
        sudoku4[6][5] = 6;
        sudoku4[6][6] = 9;
        sudoku4[6][7] = 5;
        sudoku4[6][8] = 0;
        sudoku4[7][0] = 0;
        sudoku4[7][1] = 1;
        sudoku4[7][2] = 9;
        sudoku4[7][3] = 4;
        sudoku4[7][4] = 8;
        sudoku4[7][5] = 7;
        sudoku4[7][6] = 0;
        sudoku4[7][7] = 6;
        sudoku4[7][8] = 0;
        sudoku4[8][0] = 3;
        sudoku4[8][1] = 6;
        sudoku4[8][2] = 8;
        sudoku4[8][3] = 2;
        sudoku4[8][4] = 5;
        sudoku4[8][5] = 9;
        sudoku4[8][6] = 0;
        sudoku4[8][7] = 1;
        sudoku4[8][8] = 0;

        sudoku3[0][0] = 0;
        sudoku3[0][1] = 0;
        sudoku3[0][2] = 0;
        sudoku3[0][3] = 8;
        sudoku3[0][4] = 1;
        sudoku3[0][5] = 5;
        sudoku3[0][6] = 0;
        sudoku3[0][7] = 0;
        sudoku3[0][8] = 3;
        sudoku3[1][0] = 0;
        sudoku3[1][1] = 0;
        sudoku3[1][2] = 0;
        sudoku3[1][3] = 0;
        sudoku3[1][4] = 0;
        sudoku3[1][5] = 0;
        sudoku3[1][6] = 0;
        sudoku3[1][7] = 0;
        sudoku3[1][8] = 0;
        sudoku3[2][0] = 0;
        sudoku3[2][1] = 0;
        sudoku3[2][2] = 0;
        sudoku3[2][3] = 2;
        sudoku3[2][4] = 9;
        sudoku3[2][5] = 4;
        sudoku3[2][6] = 0;
        sudoku3[2][7] = 5;
        sudoku3[2][8] = 0;
        sudoku3[3][0] = 0;
        sudoku3[3][1] = 8;
        sudoku3[3][2] = 1;
        sudoku3[3][3] = 0;
        sudoku3[3][4] = 7;
        sudoku3[3][5] = 3;
        sudoku3[3][6] = 5;
        sudoku3[3][7] = 4;
        sudoku3[3][8] = 0;
        sudoku3[4][0] = 0;
        sudoku3[4][1] = 0;
        sudoku3[4][2] = 7;
        sudoku3[4][3] = 5;
        sudoku3[4][4] = 6;
        sudoku3[4][5] = 8;
        sudoku3[4][6] = 0;
        sudoku3[4][7] = 9;
        sudoku3[4][8] = 0;
        sudoku3[5][0] = 0;
        sudoku3[5][1] = 6;
        sudoku3[5][2] = 0;
        sudoku3[5][3] = 1;
        sudoku3[5][4] = 4;
        sudoku3[5][5] = 2;
        sudoku3[5][6] = 0;
        sudoku3[5][7] = 0;
        sudoku3[5][8] = 8;
        sudoku3[6][0] = 0;
        sudoku3[6][1] = 0;
        sudoku3[6][2] = 8;
        sudoku3[6][3] = 3;
        sudoku3[6][4] = 5;
        sudoku3[6][5] = 0;
        sudoku3[6][6] = 7;
        sudoku3[6][7] = 0;
        sudoku3[6][8] = 2;
        sudoku3[7][0] = 0;
        sudoku3[7][1] = 0;
        sudoku3[7][2] = 3;
        sudoku3[7][3] = 6;
        sudoku3[7][4] = 2;
        sudoku3[7][5] = 9;
        sudoku3[7][6] = 0;
        sudoku3[7][7] = 1;
        sudoku3[7][8] = 0;
        sudoku3[8][0] = 0;
        sudoku3[8][1] = 0;
        sudoku3[8][2] = 0;
        sudoku3[8][3] = 0;
        sudoku3[8][4] = 8;
        sudoku3[8][5] = 0;
        sudoku3[8][6] = 0;
        sudoku3[8][7] = 0;
        sudoku3[8][8] = 0;

        sudoku2[0][0] = 8;
        sudoku2[0][1] = 0;
        sudoku2[0][2] = 0;
        sudoku2[0][3] = 7;
        sudoku2[0][4] = 2;
        sudoku2[0][5] = 3;
        sudoku2[0][6] = 5;
        sudoku2[0][7] = 0;
        sudoku2[0][8] = 0;
        sudoku2[1][0] = 7;
        sudoku2[1][1] = 0;
        sudoku2[1][2] = 0;
        sudoku2[1][3] = 0;
        sudoku2[1][4] = 0;
        sudoku2[1][5] = 0;
        sudoku2[1][6] = 8;
        sudoku2[1][7] = 0;
        sudoku2[1][8] = 0;
        sudoku2[2][0] = 5;
        sudoku2[2][1] = 4;
        sudoku2[2][2] = 0;
        sudoku2[2][3] = 0;
        sudoku2[2][4] = 0;
        sudoku2[2][5] = 0;
        sudoku2[2][6] = 0;
        sudoku2[2][7] = 1;
        sudoku2[2][8] = 0;
        sudoku2[3][0] = 0;
        sudoku2[3][1] = 0;
        sudoku2[3][2] = 0;
        sudoku2[3][3] = 8;
        sudoku2[3][4] = 6;
        sudoku2[3][5] = 1;
        sudoku2[3][6] = 0;
        sudoku2[3][7] = 0;
        sudoku2[3][8] = 0;
        sudoku2[4][0] = 0;
        sudoku2[4][1] = 0;
        sudoku2[4][2] = 0;
        sudoku2[4][3] = 0;
        sudoku2[4][4] = 0;
        sudoku2[4][5] = 0;
        sudoku2[4][6] = 0;
        sudoku2[4][7] = 0;
        sudoku2[4][8] = 0;
        sudoku2[5][0] = 0;
        sudoku2[5][1] = 1;
        sudoku2[5][2] = 0;
        sudoku2[5][3] = 9;
        sudoku2[5][4] = 4;
        sudoku2[5][5] = 2;
        sudoku2[5][6] = 0;
        sudoku2[5][7] = 0;
        sudoku2[5][8] = 0;
        sudoku2[6][0] = 0;
        sudoku2[6][1] = 5;
        sudoku2[6][2] = 0;
        sudoku2[6][3] = 4;
        sudoku2[6][4] = 3;
        sudoku2[6][5] = 6;
        sudoku2[6][6] = 2;
        sudoku2[6][7] = 7;
        sudoku2[6][8] = 9;
        sudoku2[7][0] = 0;
        sudoku2[7][1] = 6;
        sudoku2[7][2] = 0;
        sudoku2[7][3] = 2;
        sudoku2[7][4] = 1;
        sudoku2[7][5] = 0;
        sudoku2[7][6] = 3;
        sudoku2[7][7] = 5;
        sudoku2[7][8] = 0;
        sudoku2[8][0] = 2;
        sudoku2[8][1] = 0;
        sudoku2[8][2] = 0;
        sudoku2[8][3] = 5;
        sudoku2[8][4] = 8;
        sudoku2[8][5] = 7;
        sudoku2[8][6] = 1;
        sudoku2[8][7] = 0;
        sudoku2[8][8] = 4;
    }
    
    private String FileRead(String s) throws IOException
    {
        int i;
        String result="";
        FileInputStream fin;
        try {
            fin = new FileInputStream(s);
        }
        catch(FileNotFoundException e) {
            System.out.println("File Not Found");
            return result;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: ShowFile File");
            return result;
        }
        do {
            i = fin.read();
            if(i != -1) result+=(char)i;
        } while(i != -1);
        fin.close();
        
        return result;
    }

    private void getSudoku(int d) throws IOException {
        String read="";
        int k=0;
        switch(d)
        {
            case 1:
                read=FileRead("Sudoku1.txt");
                for(int i=0;i<9;i++)
                {
                    for(int j=0;j<9;j++)
                    {
                        System.out.println(read.charAt(k));
                        sudoku1[i][j]=Integer.parseInt(String.valueOf(read.charAt(k)));
                        k+=2;
                    }
                }
                break;
            case 2:
                read=FileRead("Sudoku2.txt");
                for(int i=0;i<9;i++)
                {
                    for(int j=0;j<9;j++)
                    {
                        sudoku2[i][j]=Integer.parseInt(String.valueOf(read.charAt(k)));
                        k+=2;
                    }
                }
                break;
            case 3:
                read=FileRead("Sudoku3.txt");
                for(int i=0;i<9;i++)
                {
                    for(int j=0;j<9;j++)
                    {
                        sudoku3[i][j]=Integer.parseInt(String.valueOf(read.charAt(k)));
                        k+=2;
                    }
                }
                break;
            case 4:
                read=FileRead("Sudoku4.txt");
                for(int i=0;i<9;i++)
                {
                    for(int j=0;j<9;j++)
                    {
                        sudoku4[i][j]=Integer.parseInt(String.valueOf(read.charAt(k)));
                        k+=2;
                    }
                }
                break;
            case 5:
                read=FileRead("Sudoku5.txt");
                for(int i=0;i<9;i++)
                {
                    for(int j=0;j<9;j++)
                    {
                        sudoku5[i][j]=Integer.parseInt(String.valueOf(read.charAt(k)));
                        k+=2;
                    }
                }
                break;
        }
    }
    private int[][] genx(int sudoku1[][])
    {
        //System.out.println("Generating new");
        int i=0,j=0,k=0;
        while(i<27)
        {
            boolean rand = true;
            while(rand)
            {
                j = (int)(Math.random()*8);
                k = (int)(Math.random()*8);
                //System.out.print("randomising "+j+":"+k+" ");
                if(sudoku1[j][k]==0)
                    rand = false;
            }

            boolean valid = false;
            int count = 0;
            while(!valid)
            {
                int data = 1 + (int)(Math.random()*9);
                sudoku1[j][k] = data;
                this.board = sudoku1;
                count++;
                valid = new Violater().Validate(board);
                //System.out.println(j+":"+k+" ");
                if(count>=9)
                {
                    valid = true;
                    i--;
                    sudoku1[j][k]=0;
                }
            }
            i++;
        }
        return sudoku1;
    }
    
    protected void copy(int[][]dest, int[][] src)
    {
        for(int d=0;d<9;d++)
        {
            System.arraycopy(src[d], 0, dest[d], 0, 9);
        }
    }
   
}
