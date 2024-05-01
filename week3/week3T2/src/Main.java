public class Main {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6,8};
        int sum= sumOfElements( arr);
        System.out.println("sum of elements = " + sum);
        double average= avgOfElements(arr);
        System.out.println("average of elements = " + average);
    }
    public static int sumOfElements(int[] arr){
        int sum=0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }
    public static double avgOfElements(int[] arr){
        int sum = sumOfElements(arr);
        double average = (double) sum / arr.length;
        return average;
    }
}