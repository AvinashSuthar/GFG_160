
public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }    
    // User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
   
  
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }


        while (index < n) {
            arr[index] = 0;
            index++;
        }

    }
}
}
