import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        ArrayList<String> b=new ArrayList<String>();
        for(int i=0;i<a;i++){
            b.add(sc.nextLine());
        }
        System.out.print(b);
    }
}