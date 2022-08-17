package recursion_prac;

import java.util.Arrays;



public class practice {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9,12,13,14,24};
        //int m = arr.length;
        //triangle_Sum(arr,5);
       // System.out.println(minmaxrecur(arr,m));
        //System.out.println(First("abuRvd",0));
       // System.out.println(len("qwer"));
        //System.out.println(product(2,7));
        //print(5);
//       int ans=fibo(15);
//        System.out.println(ans);
       // System.out.println(search(arr,84,0, arr.length-1));
        //System.out.println(pro(5));
        //System.out.println(sod(1234));
        //rev(1234);
       // System.out.println(zeross(12002200));
       // System.out.println(primme(6));
        ////////////arrayss
      //  System.out.println(sortt(arr,0,97));
        //string
        //System.out.println(llen("abcd"));
    }



//    private static int llen(String s) {
//        int x=0;
//        if(s.length()==0){
//            return 0;
//        }
//
//        return llen(s.substring(1))+1;
//    }

//    private static boolean sortt(int[] arr,int i,int t) {
//
//        if(i== arr.length-1){
//            return false;
//        }
//        return arr[i]==t|| sortt(arr,i+1,t);
//
//
//    }


//static int c=0;
//    private static int zeross(int n) {
//        if(n==0){
//            return c;
//        }
//        int rem=n%10;
//        if(rem==0){
//            c++;
//            return zeross(n/10);
//        }
//        return zeross(n/10);
//    }

//    static  int s=0;
//static  void rev(int n){
//
//        if(n==0){
//            return;
//        }
//        int rem=n%10;
//        s=s*10+rem;
//        rev(n/10);
//    System.out.println(s);
//
//}
//    private static int sod(int n) {
//        if(n==1){
//            return n;
//        }
//        return n%10 *sod(n/10);
//    }


//    private static int pro(int n) {
//        if(n==1){
//           return n;
//        }
//       return n+pro(n-1);
//    }
//
//
//    static int search(int[]arr,int target,int s,int e){
//if(s>e){
//    return -1;
//}
//        int m=s+(e-s)/2;
//        if(target==arr[m]){
//           return m;
//        }else if (target>arr[m]){
//           return search(arr,target,m+1,e);
//        }else{
//           return search(arr,target,s,m-1);}
//
//
//    }
//
//    private static int fibo(int n) {
//        if(n==0){
//            return 86;
//        }
//        if(n==1){
//            return 77;
//        }
//        return fibo(n-1)^fibo(n-2);
//    }


//static void print(int n){
//        if(n==1){
//            System.out.println(n);
//            return;
//        }
//
//        print(n-1);
//    System.out.println(n);
//}

//    private static int len(String unpro) {
//
//        if(unpro.isEmpty()){
//            return 0;
//        }
//
//        return 1+len(unpro.substring(1));
//
//
//    }
//
//    private static char First(String S, int i) {
//
//        if(S.charAt(i)=='\0'){
//            return '0';
//        }
//
//        if(Character.isUpperCase(S.charAt(i))){
//            return S.charAt(i);
//        }
//
//    return  First(S,i+1);
//    }


//    private static int minmaxrecur(int[] arr,int n) {
//        if(n==1)
//            return arr[0];
//
//
//        return Math.min(arr[n-1],minmaxrecur(arr,n-1));
//
//    }

//    private static void triangle_Sum(int[] arr,int n) {
//
//
//
//            if (n < 1){
//                return;
//        }
//        int[]temp=new int[arr.length-1];
//            for (int i = 0; i < arr.length-1; i++) {
//                temp[i]=arr[i]+arr[i+1];
//            }
//            triangle_Sum(temp,n-1);
//        System.out.println(Arrays.toString(arr));
//
//    }

}
