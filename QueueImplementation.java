import java.util.*;

class Queue<T>{

        Deque<T> queue;
        Queue(){
            queue = new ArrayDeque<>();
        }


        void add(T val )
        {
            queue.addLast(val);
        }


        T poll (){
            if(queue.isEmpty()) return null;
            return queue.removeFirst();
        }

        boolean isEmpty(){
            return queue.isEmpty();
        }





}




public class QueueImplementation {
    public static void main(String[] args) {


        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());

    }
}
