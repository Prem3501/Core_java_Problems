// You are using Java
import java.util.*;
class Stack{
    int top;
    int size;
    int d[];
    Stack(int c){
        d=new int[c];
        size=c;
        top=-1;
    }
    void push(int e){
        top++;
        d[top]=e;
    }
    void pop(){
        top--;
    }
    void display(){
        for(int i=top;i>=0;i--)
        System.out.print(d[i]+" ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Stack b=new Stack(a);
        for(int i=0;i<a;i++){
            b.push(sc.nextInt());
        }
        b.display();
        b.pop();
        b.pop();
        System.out.println();
        b.display();
    }
}