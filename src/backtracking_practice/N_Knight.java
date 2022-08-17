package backtracking_practice;

public class N_Knight {
    public static void main(String[] args) {

        boolean[][]board=new boolean[6][6];
        Knight(board,1,0,3);
    }
    static void Knight(boolean[][]board,int r,int c,int K){
        if(K==0){
            display(board);
            System.out.println();
            return;
        }
        //last col and row
        if(r==board.length-1 && c==board.length){
            return;
        }
        //col ends
        if(c==board.length){
            Knight(board,r+1,c,K);
            return;



        }

        if(isSafe(board,r,c)){
            board[r][c]=true;
            Knight(board,r,c+1,K-1);
            board[r][c]=false;
        }

        Knight(board,r,c+1,K);

    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        if(isValid(board,r,c)){
            //waha knight h ya ni
            if(board[r][c]){
                //mana krdo ki nhi put kr skte
                return false;
            }

        }
        if(isValid(board,r-2,c-1)){
            //waha knight h ya ni
            if(board[r-2][c-1]){
                //mana krdo ki nhi put kr skte
                return false;
            }

        }if(isValid(board,r-2,c+1)){
            //waha knight h ya ni
            if(board[r-2][c+1]){
                //mana krdo ki nhi put kr skte
                return false;
            }

        }if(isValid(board,r-1,c+2)){
            //waha knight h ya ni
            if(board[r-1][c+2]){
                //mana krdo ki nhi put kr skte
                return false;
            }

        }if(isValid(board,r-1,c-2)){
            //waha knight h ya ni
            if(board[r-1][c-2]){
                //mana krdo ki nhi put kr skte
                return false;
            }

        }





        return true;
    }

    private static boolean isValid(boolean[][] board, int r, int c) {
        if(r>=0 && r< board.length && c>=0 && c< board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] r:board){
            for(boolean ele:r){
                if(ele){
                    System.out.print(" K ");
                }else{
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }
}
