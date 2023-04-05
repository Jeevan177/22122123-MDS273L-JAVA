import java.util.*;
import java.util.Arrays;

public class Lab3{
    static int meanfunction(int arr1[]) {
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        int mean = (int) (sum / arr1.length);
        return mean;
    }

    static int medianfunction(int arr1[], int n) {
        for(int j = 0; j < arr1.length - 1; j++){
            if(arr1[j] > arr1[j + 1]){
                int temp = arr1[j];
                arr1[j] = arr1[j +1];
                arr1[j + 1] = temp;
                j = -1;
                for(int i = 0; i<arr1.length; i++){
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        if (n % 2 != 0)
            return arr1[n / 2];
        return (arr1[(n - 1) / 2] + arr1[n / 2]) / 2;
    }

    static int modefunction(int[] arr1, int n) {
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < n; ++i) {
            int count = 0;
            for (j = 0; j < n; ++j) {
                if (arr1[j] == arr1[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = arr1[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int mean;
        int median;
        int mode;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int number = Integer.parseInt(scan.nextLine());
        int[] arr1 = new int[number];
        int n = arr1.length;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for array:");
            arr1[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Options to perform");
        System.out.println("1.Mean");
        System.out.println("2.Median");
        System.out.println("3.Mode");
        int Option;
        Option = Integer.parseInt(scan.nextLine());
        switch (Option) {
                mean = meanfunction(arr1);
                System.out.println("Mean is: " + mean);
                break;
            case 2:
                median = medianfunction(arr1, n);
                System.out.println("Median is: " + median);
                break;
            case 3:
                mode = modefunction(arr1, n);
                System.out.println("Mode is: " + mode);
                break;
        
        }

    }



}
