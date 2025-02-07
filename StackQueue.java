import java.util.*;
class Stack<T>{

    List<T> arrayList;

    Stack(){
        arrayList = new ArrayList<>();
    }

    void push(T val){
        arrayList.add(val);
    };

    void pop(){
        if(arrayList.isEmpty())
        {
            System.out.println("Stack is Empty");
            return;
        }

        T lastElement = arrayList.get(arrayList.size()-1);
        arrayList.removeLast();
        System.out.println(lastElement);
    }


    boolean isEmpty(){
        return arrayList.isEmpty();
    }


    T top (){
        if(arrayList.isEmpty()){
            return null;
        }

        return arrayList.getLast();
    }

    // void print(){
    //     for(int i : arrayList){
    //         System.out.print(i + " ");
    //     }
    // }
}



public class StackQueue {


    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("arsath");
        stack.push("Hamsa");
        stack.push("same");

        System.out.println("Top of the stack : " + stack.top());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty()); 


    }
}
