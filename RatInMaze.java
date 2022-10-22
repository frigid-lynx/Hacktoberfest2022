/***********************************************
You are given a N*N maze with a rat placed at maze[0][0]. 
Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1]. 
Rat can move in any direction ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1.
Cells with value 0 are blocked means rat can not enter into those cells and those with value 1 are open.

This program prints true if there is a path otherwise false

Sample Input  :
3
1 0 1
1 0 1
1 1 1
Sample Output :
true

*************************************************/

import java.util.Scanner;

public class RatInMaze {
    public static boolean ratInAMaze(int maze[][]){

        /*Your class should be named Solution.
         *Don't write main().
         *Don't take input, it is passed as function argument.
         *Don't print output.
         *Taking input and printing output is handled automatically.
         */
        int n = maze.length;
        int[][] path = new int[n][n];
        return ratInAMaze(maze,0,0,path);

    }

    private static boolean ratInAMaze(int[][] maze,int i,int j,int[][] path){
        int n = maze.length;
        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            //path[i][j] = 0;
            return false;
        }

        path[i][j] = 1;
        if(i == n-1 && j== n-1){
            return true;
        }
        //top
        if(ratInAMaze(maze,i-1,j,path)) return true;
        //right
        if(ratInAMaze(maze,i,j+1,path)) return true;
        //down
        if(ratInAMaze(maze,i+1,j,path)) return true;
        //left
        if(ratInAMaze(maze,i,j-1,path)) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[][] maze = new int[size][size];
        System.out.println("Enter maze matrix : ");
        for (int i =0; i<size; i++){
            for (int j =0 ; j<size; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        System.out.println(ratInAMaze(maze));
    }
}
