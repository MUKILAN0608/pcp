import java.util.*;
class main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int[] a ={10,34,3,23,53,23,52,13,51};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }

        }
      Arrays.sort(a);
        System.out.println("THE MAXIMUM IS: "+(max));
        System.out.println(Arrays.toString(a));

    }
}
