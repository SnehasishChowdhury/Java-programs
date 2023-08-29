public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[4];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        
        int sum = arr[0] + arr[1] + arr[2] + arr[3];
        double avg = (double)sum / 4;
        
        System.out.println("The average of the four numbers is: " + avg);
    }
}