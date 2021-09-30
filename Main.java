import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
//import java.util.*;

public class Main {

    public static void RandomFile(int N) throws IOException {
        
        //Create file containing N random numbers.
        File newFile = new File("Random.txt");
        //FileWriter filewriter = null;

        try (FileWriter filewriter = new FileWriter(newFile);
            BufferedWriter buffwriter = new BufferedWriter(filewriter);) {
            
            int lineNumber;
            Random rand = new Random();
            while (N > 0) {
                lineNumber = rand.nextInt(N);
                buffwriter.write(lineNumber + "\n");
                N--;
            }
            
        }

        
    }

    public static void main (String[] args) throws IOException {
        System.out.println("Enter number ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        RandomFile(i);
        scan.close();
    }
}