package backtracking_practice;

import java.util.ArrayList;
import java.util.List;

public class solving {
    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        char [][]maze={
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        System.out.println(WOsearch(maze,"ABCCED"));
    }

    private static boolean WOsearch(char[][] maze, String s) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if(maze[i][j]==s.charAt(0)&& WOO(maze,s,i,j,0)){
                    return true;
                }
            }
        }
        return false;


    }

    private static boolean WOO(char[][] maze, String s, int r, int c,int count) {
        //base
        if(count==s.length()){
            return true;
        }
        if(r==-1 || c==-1||r==maze.length||c==maze[0].length||maze[r][c]!=s.charAt(count)){
            return false;
        }

        char t=maze[r][c];
        maze[r][c]='*';

        boolean anns=   WOO(maze,s,r+1,c,count+1)||
                  WOO(maze,s,r,c+1,count+1)
                ||WOO(maze,s,r-1,c,count+1)
                ||WOO(maze,s,r,c-1,count+1);

        maze[r][c]=t;
        return anns;
    }


//    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> fin=new ArrayList<>();
//back(candidates,target,0,new ArrayList<>(),fin);
//        return fin;
//}
//
//    private static void back(int[] candidates, int target, int ind, List<Integer> list, List<List<Integer>> fin) {
//        if(target<0){
//            return;
//        }
//        if(target==0){
//            fin.add(new ArrayList<>(list));
//        }
//        for(int i=ind;i<candidates.length;i++){
//          list.add(candidates[i]);
//          back(candidates,target-candidates[i],i,list,fin);
//list.remove(list.size()-1);
//        }
//    }


}
