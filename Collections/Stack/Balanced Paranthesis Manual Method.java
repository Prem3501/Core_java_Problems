import java.util.*;
class Stack{
    int top;
    char c[];
    Stack(int d){
        top=-1;
        c=new char[d];
    }
    void push(char e){
        top++;
        c[top]=e;
    }
    void pop(){
        top--;
    }
    char peek(){
        return c[top];
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a);
        Stack b = new Stack(a.length());
        int flag=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='('||a.charAt(i)=='{'||a.charAt(i)=='['){
                count1++;
            }
            else if(a.charAt(i)==')'||a.charAt(i)=='}'||a.charAt(i)==']'){
                count2++;
            }
        }
        if(count1!=count2){
            System.out.println("NOT BALANCED");
        }
        else{
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='('||a.charAt(i)=='{'||a.charAt(i)=='['){
                b.push(a.charAt(i));
            }
            else{
                if(a.charAt(i)==')'&&b.peek()=='('&&!b.isEmpty()){
                    b.pop();
                }
                else if(a.charAt(i)=='}'&&b.peek()=='{'&&!b.isEmpty()){
                    b.pop();
                }
                else if(a.charAt(i)==']'&&b.peek()=='['&&!b.isEmpty()){
                    b.pop();
                }
                        }
        }
        if(!b.isEmpty()){
            flag=1;
        }
        if(flag==0){
            System.out.print("BALANCED");
        }
        else{
            System.out.print("NOT BALANCED");
        }
    }
        
    }
    
}