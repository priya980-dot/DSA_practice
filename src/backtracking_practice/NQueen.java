package backtracking_practice;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];

        System.out.println(queens(board,0));
    }
     static  int queens(boolean[][] board,int r){
        if(r== board.length){
        display(board);
            System.out.println();
        return 1;}
//placing queen
         int count=0;
         for (int col = 0; col < board.length; col++) {
             if(isSafe(board,r,col)){
                 board[r][col]=true;
                 count +=queens(board,r+1);
                 board[r][col]=false;
             }
         }
return count;
     }

    private static boolean isSafe(boolean[][] board, int r, int col) {
        //vertical row
        //if queen there or not
        for (int i = 0; i <r; i++) {
            if(board[i][col]){//if there is queen
                return  false;
            }
        }
         //diagonal left
        int minleft=Math.min(r,col);
        for (int i = 1; i <= minleft; i++) {
            if(board[r-i][col-i]){
                return false;
            }
        }

        //diagonal left
        int minright=Math.min(r, board.length-col-1);
        for (int i = 1; i <= minright; i++) {
            if(board[r-i][col+i]){
                return false;
            }
        }
//can place queen
        return true;
    }

    private static void display(boolean[][] board) {
    for(boolean []row: board){
        for(boolean ele: row){
    if(ele){
        System.out.print(" Q ");
    }else{
    System.out.print(" X ");
}
    }
        System.out.println();
        }


    }
}
