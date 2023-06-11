import java.util.*;
class Stack{
    int top;
    int size;
    char c[];
    Stack(int b){
        top=-1;
        size=b;
        c=new char[b];
    }
    void push(char a){
        top++;
        c[top]=a;
    }
    char pop(){
        char x=c[top];
        top--;
        return x;
        
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
    int precedence(char d){
        if(d=='+'||d=='-'){
            return 1;
        }
        else if(d=='*'||d=='/'){
            return 2;
        }
        else if(d=='^'){
            return 3;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Stack b=new Stack(a.length()); 
        String output="";
        for(int i=0;i<a.length();i++){
            if(Character.isLetter(a.charAt(i))){
                output+=a.charAt(i);
            }
            else if(a.charAt(i)=='('){
                b.push(a.charAt(i));
            }
            else if(a.charAt(i)==')'){
                while(b.peek()!='('){
                    output=output+b.pop();
                }
                b.pop();
            }
            else{
                if(b.isEmpty()){
                b.push(a.charAt(i));
                }
                else if(!b.isEmpty()&&(b.precedence(b.peek())<b.precedence(a.charAt(i))){
                    b.push(a.charAt(i));
                }
                else {
                    while(!b.isEmpty()&&b.precedence(b.peek())>=b.precedence(a.charAt(i))){
                        output=output+b.pop();
                    }
                    b.push(a.charAt(i));
                }
            }
        }
        while(!b.isEmpty()){
            output+=b.pop();
        }
            System.out.print(output);
}
}