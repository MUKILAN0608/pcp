import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=10;
        int K=sc.nextInt();
        if(K<N && 1<=K && K<=5) {
            N=N-K;
            System.out.println(N);


        }
        else{
            System.out.println("INVALID INPUT");
        }

     sc.close();
    }
}
