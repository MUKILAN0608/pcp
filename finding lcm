import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER:");
        int n1=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        int n2=sc.nextInt();
        int big=n1>n2?n1:n2;
        int res=big;
        while(true){
            if(res%n1==0 && res%n2==0){
                break;
            }
            else{
                res=res+big;
            }
        }
    System.out.println("THE LCM IS: "+res);
    }
}
