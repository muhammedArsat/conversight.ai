import java.util.*;
public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int search[] = new int[size];

        for(int i = 0; i < size; i++){
            search[i] = sc.nextInt();
        }

        int initial = 0;
        int end = size - 1;

        while(initial <= end){

            int mid = initial + (end - initial) / 2;

            if(search[mid] == target){
                System.out.println(target+" is found in "+ mid+" Index");
                return;
            }
            //traverse left part of the mid
            else if(search[mid] > target){
                end = mid - 1;
            }
            //traverse right part of the mid
            else{
                initial = mid+1;
            }

        }

        System.out.println(target + " is not found in the array");
        sc.close();
    }

}
