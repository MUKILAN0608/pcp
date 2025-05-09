import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10,2,3,56,99,6,77,59,13};
        int swap;
        for (int i = 0; i < (a.length-1); i++) {
           for(int j=0;j<(a.length-1);j++){
               if(a[j]>a[j+1]){
                   swap=a[j];
                   a[j]=a[j+1];
                   a[j+1]=swap;
               }
           }


        }
        System.out.println(Arrays.toString(a));
    }
}
