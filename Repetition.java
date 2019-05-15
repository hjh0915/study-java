public class Repetition {
    public static void main(String[] args) {
        int arr[] = {7, 10, 1};
        System.out.println("元素分别为：");

        for (int x : arr) { //"x" is not defined. Use "foreach"
            System.out.println(x);
        }
    }
}