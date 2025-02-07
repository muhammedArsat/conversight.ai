import java.util.*;
public class NextSmallestElement {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int min = 1;
        for(int i = 0; i < size; i++){
            if(arr[i] == min) min++;
        }

        System.out.println(min);
        sc.close();

    }
}
