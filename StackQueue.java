import java.util.*;
class Stack{

    List<Integer> arrayList;

    Stack(){
        arrayList = new ArrayList<>();
    }

    void push(int val){
        arrayList.add(val);
    };

    void pop(){
        if(arrayList.isEmpty())
        {
            System.out.println("Stack is Empty");
            return;
        }

        int lastElement = arrayList.get(arrayList.size()-1);
        arrayList.removeLast();
        System.out.println(lastElement);
    }


    boolean isEmpty(){
        return arrayList.isEmpty();
    }


    int top (){
        if(arrayList.isEmpty()){
            return -1;
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
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top of the stack : " + stack.top());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());


    }
}
