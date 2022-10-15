public class nKnight {
    public static void main(String[] args) {
        int r=4;
        boolean[][] board=new boolean[r][r];
        knight(board,0,0,4);
    }

    private static void knight(boolean[][] board, int row,int col,int knights) {
        if (knights==0){
            Display(board);
            System.out.println();
            return;
        }

        if (row==board.length-1 && col==board.length){
            return;
        }

        if (col==board.length){
            knight(board,row+1,0,knights);
            return;
        }

            if (isSafe(board,row,col)){
                board[row][col]=true;
                knight(board,row,col+1,knights-1);
                board[row][col]=false;
            }

            knight(board,row,col+1,knights);
    }

    private static void Display(boolean[][] board) {
            for (boolean[] r:board) {
                for (boolean element:r) {
                    if (element){
                        System.out.print("K ");
                    }
                    else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (Valid(board,row-2,col-1)){
            if (board[row-2][col-1]){
                return false;
            }
        }

        if (Valid(board,row-1,col-2)){
            if (board[row-1][col-2]){
                return false;
            }
        }

        if (Valid(board,row-1,col+2)){
            if (board[row-1][col+2]){
                return false;
            }
        }

        return true;
    }

    private static boolean Valid(boolean[][] board,int row,int col){
        if (row>=0 && row<board.length && col>=0 && col< board.length){
            return true;
        }
        return false;
    }

}
