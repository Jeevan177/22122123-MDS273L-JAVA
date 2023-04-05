import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab6 {
    static int acount, ecount, icount, ocount, ucount = 0;

    static void Vowelcount() {

        try {
            File file = new File("text.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == 'a' || c == 'A') {
                        acount++;
                    }
                    if (c == 'e' || c == 'E') {
                        ecount++;
                    }
                    if (c == 'i' || c == 'I') {
                        icount++;
                    }
                    if (c == 'o' || c == 'O') {
                        ocount++;
                    }
                    if (c == 'u' || c == 'U') {
                        ucount++;
                    }
                }
            }
            scan.close();
            
            System.out.println("a count:" + acount);
            System.out.println("e count:" + ecount);
            System.out.println("i count:" + icount);
            System.out.println("o count:" + ocount);
            System.out.println("u count:" + ucount);

        } catch (FileNotFoundException e) {
            System.out.println("error occurred");
            e.printStackTrace();
        }
    }

    static void DigitCount() {
        try {
            File file = new File("text.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                int[] digitcount = new int[10];
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == '0') {
                        digitcount[0]++;
                    }
                    if (c == '1') {
                        digitcount[1]++;
                    }
                    if (c == '2') {
                        digitcount[2]++;
                    }
                    if (c == '3') {
                        digitcount[3]++;
                    }
                    if (c == '4') {
                        digitcount[4]++;
                    }
                    if (c == '5') {
                        digitcount[5]++;
                    }
                    if (c == '6') {
                        digitcount[6]++;
                    }
                    if (c == '7') {
                        digitcount[7]++;
                    }
                    if (c == '8') {
                        digitcount[8]++;
                    }
                    if (c == '9') {
                        digitcount[9]++;
                    }
                }
                
                System.out.println("0 count:" + digitcount[0]);
                System.out.println("1 count:" + digitcount[1]);
                System.out.println("2 count:" + digitcount[2]);
                System.out.println("3 count:" + digitcount[3]);
                System.out.println("4 count:" + digitcount[4]);
                System.out.println("5 count:" + digitcount[5]);
                System.out.println("6 count:" + digitcount[6]);
                System.out.println("7 count:" + digitcount[7]);
                System.out.println("8 count:" + digitcount[8]);
                System.out.println("9 count:" + digitcount[9]);
                break;
            }
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("error occurred");
            e.printStackTrace();
        }
    }

    static void TopwordCount() {
        Map<String, Integer> wordCounts = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> topWords = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue));

        try {
            File file = new File("text.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            topWords.offer(entry);
            if (topWords.size() > 5) {
                topWords.poll();
            }
        }

        
        while (!topWords.isEmpty()) {
            Map.Entry<String, Integer> entry = topWords.poll();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    static void Leastwordscount() {
        Map<String, Integer> wordCounts = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> leastWords = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue));

        try {
            File file = new File("text.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int numleastwords = 5;
        int mincount = Integer.MAX_VALUE;
        for (int count : wordCounts.values()) {
            if (count < mincount) {
                mincount = count;
            }
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() == mincount) {
                leastWords.offer(entry);
            }
        }

        
        for (int i = 0; i < numleastwords && !leastWords.isEmpty(); i++) {
            Map.Entry<String, Integer> entry = leastWords.poll();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static void TopChar(){
        int[] charCounts = new int[256];

        try (Scanner scanner = new Scanner(new File("text.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (char c : line.toCharArray()) {
                    charCounts[c]++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.exit(1);
        }

        int numTopChars = 5;
        for (int i = 0; i < numTopChars; i++) {
            int topCount = Integer.MIN_VALUE;
            char topChar = 0;
            for (int j = 0; j < charCounts.length; j++) {
                if (charCounts[j] > topCount) {
                    topCount = charCounts[j];
                    topChar = (char) j;
                }
            }
            System.out.println(topChar + ": " + topCount);
            charCounts[topChar] = 0;
        }
    }
    
    static void Leastchar(){
        int[] charCounts = new int[256];

        try (Scanner scanner = new Scanner(new File("text.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (char c : line.toCharArray()) {
                    charCounts[c]++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.exit(1);
        }

        int numLeastChars = 5;
        for (int i = 0; i < numLeastChars; i++) {
            int leastCount = Integer.MAX_VALUE;
            char leastChar = 0;
            for (int j = 0; j < charCounts.length; j++) {
                if (charCounts[j] > 0 && charCounts[j] < leastCount) {
                    leastCount = charCounts[j];
                    leastChar = (char) j;
                }
            }
            if (leastCount == Integer.MAX_VALUE) {
                break;
            }
            System.out.println(leastChar + ": " + leastCount);
            charCounts[leastChar] = 0;
        }
    
    }
    public static void main(String[] args) {
        System.out.println("Text File Exercise");
        System.out.println("Number of Vowels:");
        Vowelcount();
        System.out.println("\n");
        System.out.println("Number of Digits:");
        DigitCount();
        System.out.println("\n");
        System.out.println("Count of Top 5 words used:");
        TopwordCount();
        System.out.println("\n");
        System.out.println("Count of least 5 words used:");
        Leastwordscount();
        System.out.println("\n");
        System.out.println("Count of Top Characters used:");
        TopChar();
        System.out.println("\n");
        System.out.println("Count of Least Characters used:");
        Leastchar();

        System.out.println("\n");
        System.out.println("Optional Question - Top categories");
        

        String filename1 = "htmlFile.txt";
        String startTag = "<div class=\"trending-head\">Top Categories</div>";
        String endTag = "</ul>			</div>";
        try (BufferedReader br = new BufferedReader(new FileReader(filename1))) {
            FileWriter writer = new FileWriter("display.txt", true);
            String[] contentLines = new String[20];
            int lineCount = 0;
            String line;
            boolean insideDiv = false;
            while ((line = br.readLine()) != null) {

                if (line.contains(startTag)) {
                    insideDiv = true;
                } else if (line.contains(endTag)) {
                    insideDiv = false;
                    break;
                } else if (insideDiv) {
                    contentLines[lineCount++] = line;
                }
            }
            System.out.println("--------------------------------------------------------------------");
            System.out.println("The top categories are: ");
            for (int j = 0; j < lineCount; j++) {
                Pattern pattern = Pattern.compile("<a[^>]*>(.*?)</a>");
                Matcher matcher = pattern.matcher(contentLines[j]);
                if (matcher.find()) {
                    String menuText = matcher.group(1);
                    System.out.println((j + 1) + ". " + menuText);
                    writer.write((j + 1) + ". " + menuText + "\n");
                }
            }
            System.out.println("--------------------------------------------------------------------");
            writer.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

