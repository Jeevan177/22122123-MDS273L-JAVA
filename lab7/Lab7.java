import java.io.*;
import java.util.*;

public class Lab7 {
    public static void main(String[] args) {

        try {
            File newfile = new File("./Output/output.txt");
            newfile.createNewFile();
            FileWriter write = new FileWriter(newfile);
            write.write("THE SUMMARY STATISTICS FOR EACH SPECIES OF IRIS FLOWER");
            // READ THE FILE
            readFile();
            // SEPAL LENGTH
            sepalLen(write);
            // SEPAL WIDTH
            sepalWidth(write);
            // PETAL LENGTH
            petalLen(write);
            // PETAL WIDTH
            petalWidth(write);
            write.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // **********************************************************************************//
    static int readFile() {
        int length = 0;
        try {
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            // read the file
            while (read.hasNextLine()) {
                String line[] = read.nextLine().split(",");
                length = length+1;
            }
            read.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return length;
    }
    // **********************************************************************************//
    static void sepalLen(FileWriter write) {
        int length = readFile();
        float sepallength[] = new float[length - 1];
        try {
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            // SEPAL LENGTH
            int count = 0;
            while (read.hasNextLine()) {
                String line[] = read.nextLine().split(",");
                if (line[1].matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$")) {
                    sepallength[count] = Float.parseFloat(line[1]);
                    count++;
                }
            }
            read.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // TO PRINT THE SEPAL LENGTH ARRAY
        // for(int i = 0;i<sepallength.length;i++){
        // System.out.println(sepallength[i]);
        // }
        try {
            write.write("\n ");
            write.write("\n" + "SEPAL LENGTH ");
            write.write("\n" + "************");
            write.write("\n" + "");
            write.write("\n" + "SUMMARY");
            write.write("\n" + "*******");
            write.write("\n" + "MIN: " + min(sepallength));
            write.write("\n" + "MAX: " + max(sepallength));
            write.write("\n" + "MEAN: " + mean(sepallength));
            write.write("\n" + "MEDIAN: " + median(sepallength));
            write.write("\n" + "MODE: " + mode(sepallength));
            write.write("\n" + "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // **********************************************************************************//
    static void sepalWidth(FileWriter write) {
        int length = readFile();
        float sepalwidth[] = new float[length - 1];
        try {
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            // SEPAL LENGTH
            int count = 0;
            while (read.hasNextLine()) {
                String line[] = read.nextLine().split(",");

                if (line[2].matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$")) {
                    sepalwidth[count] = Float.parseFloat(line[2]);
                    count++;
                }
            }
            read.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // TO PRINT THE SEPAL LENGTH ARRAY
        // for(int i = 0;i<sepallength.length;i++){
        // System.out.println(sepallength[i]);
        // }
        try {
            write.write(" ");
            write.write("\n" + "SEPAL WIDTH ");
            write.write("\n" + "************");
            write.write("\n" + "");
            write.write("\n" + "SUMMARY");
            write.write("\n" + "*******");
            write.write("\n" + "MIN: " + min(sepalwidth));
            write.write("\n" + "MAX: " + max(sepalwidth));
            write.write("\n" + "MEAN: " + mean(sepalwidth));
            write.write("\n" + "MEDIAN: " + median(sepalwidth));
            write.write("\n" + "MODE: " + mode(sepalwidth));
            write.write("\n" + "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // **********************************************************************************//
    static void petalLen(FileWriter write) {
        int length = readFile();
        float petallength[] = new float[length - 1];
        try {
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            // SEPAL LENGTH
            int count = 0;
            while (read.hasNextLine()) {
                String line[] = read.nextLine().split(",");

                if (line[3].matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$")) {
                    petallength[count] = Float.parseFloat(line[3]);
                    count++;
                }
            }
            read.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            write.write(" ");
            write.write("\n" + "PETAL LENGTH ");
            write.write("\n" + "************");
            write.write("\n" + "");
            write.write("\n" + "SUMMARY");
            write.write("\n" + "*******");
            write.write("\n" + "MIN: " + min(petallength));
            write.write("\n" + "MAX: " + max(petallength));
            write.write("\n" + "MEAN: " + mean(petallength));
            write.write("\n" + "MEDIAN: " + median(petallength));
            write.write("\n" + "MODE: " + mode(petallength));
            write.write("\n" + "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // **********************************************************************************//
    static void petalWidth(FileWriter write) {
        int length = readFile();
        float petalwidth[] = new float[length - 1];
        try {
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            // SEPAL LENGTH
            int count = 0;
            while (read.hasNextLine()) {
                String line[] = read.nextLine().split(",");

                if (line[4].matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$")) {
                    petalwidth[count] = Float.parseFloat(line[4]);
                    count++;
                }
            }
            read.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            write.write(" ");
            write.write("\n" + "PETAL WIDTH ");
            write.write("\n" + "************");
            write.write("\n" + "");
            write.write("\n" + "SUMMARY");
            write.write("\n" + "*******");
            write.write("\n" + "MIN: " + min(petalwidth));
            write.write("\n" + "MAX: " + max(petalwidth));
            write.write("\n" + "MEAN: " + mean(petalwidth));
            write.write("\n" + "MEDIAN: " + median(petalwidth));
            write.write("\n" + "MODE: " + mode(petalwidth));
            write.write("\n" + "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }

    // **********************************************************************************//
    static float mean(float arr[]) {
        float meanvalue;
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return meanvalue = sum / arr.length;
    }

    // **********************************************************************************//
    static float median(float arr[]) {
        float medianvalue = 0;
        int l = arr.length;
        int index;
        // Sorting the array
        for (int i = 0; i < l; i++) {
            index = i;
            for (int j = i; j <= l - 1; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            float temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        // To check the sorted array
        // for(int i =0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }
        // Finding median
        if (l % 2 != 0) {
            medianvalue = arr[l / 2];
        } else {
            medianvalue = (arr[(l / 2) - 1] + arr[(l / 2)]) / 2;
        }

        return medianvalue;
    }

    // **********************************************************************************//
    static float mode(float arr[]) {
        float modevalue = 0;
        int maxcount = 0;
        float maxvalue = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                maxvalue = arr[i];
            }
        }
        modevalue = maxvalue;
        return modevalue;
    }

    // **********************************************************************************//
    static float min(float arr[]) {
        float minvalue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minvalue) {
                minvalue = arr[i];
            }
        }
        return minvalue;
    }

    // **********************************************************************************//
    static float max(float arr[]) {
        float maxvalue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

}