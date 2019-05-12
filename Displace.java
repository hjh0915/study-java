import java.util.*;
public class Displace {
    public static void main(String[] args) {
        int arr[] = new int[] {45, 12, 2, 10};
        Arrays.fill(arr, 1, 3, 8);
        for (int i=0; i<arr.length; i++) {
            System.out.println("第" + i + "个元素是：" + arr[i]);
        }
    }
}