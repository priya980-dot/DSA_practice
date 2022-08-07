package prac;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursionandbacktracking {
    public static void main(String[] args) {
        boolean [][]maze={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        int [][]path=new int[maze.length][maze[0].length];
    boolmaze(" ",maze,0,0,path,1);

    }
//    static ArrayList<String> ans(String pro,int r,int c){
//        //int count=0;
//        ArrayList<String> news=new ArrayList<String>();
//        if(r==1&&c==1){
//            news.add(pro);
//            return news;
//
//        }
//
//        if()
//            if(r>1){
//                news.addAll( ans(pro+'D',r-1,c));}
//        if(c>1){
//            news.addAll( ans(pro+'R',r,c-1));}
//        if(c>1&& r>1){
//            news.addAll( ans(pro+'d',r-1,c-1));}
//
//
//        return news;
//    }
    //maze wid obstacles
//    static ArrayList<String> boolmaze(String pro, boolean[][] maze, int r, int c){
//        ArrayList<String> news=new ArrayList<>();
//        if(r==maze.length-1&&c==maze[0].length-1){
//            news.add(pro);
//            return news;
//        }
//if(!maze[r][c]){
//    return news;
//}
//
//if(r< maze.length-1){
//    news.addAll(boolmaze(pro+'D',maze,r+1,c));
//}
//        if(c< maze[0].length-1){
//          news.addAll(  boolmaze(pro+'R',maze,r,c+1));
//        }
//
//        if(r< maze.length-1 &&c< maze[0].length-1){
//            news.addAll(boolmaze(pro+'d',maze,r+1,c+1));
//        }
//        return news;
//    }

    //backytacking
    static void boolmaze(String pro, boolean[][] maze, int r, int c,int [][]path,int steps){

        if(r==maze.length-1&&c==maze[0].length-1){
            path[r][c]=steps;
            for(int[]arr:path ){
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(pro);
            System.out.println();
            return ;
        }
        if(!maze[r][c]){
            return ;
        }

        maze[r][c]=false;
        path[r][c]=steps;
        if(r< maze.length-1){
           boolmaze(pro+'D',maze,r+1,c,path,steps+1);
        }
        if(c< maze[0].length-1){
            boolmaze(pro+'R',maze,r,c+1,path,steps+1);
        }

        if(r< maze.length-1 &&c< maze[0].length-1){
            boolmaze(pro+'d',maze,r+1,c+1,path,steps+1);
        }
       if(r>0){
           boolmaze(pro+'U',maze,r-1,c,path,steps+1);
       }
       if(c>0){
           boolmaze(pro+'L',maze,r,c-1,path,steps+1);
       }

       maze[r][c]=true;
       path[r][c]=0;
    }
}
