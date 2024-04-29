import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String srcPath = "fileinput.txt";
        String destPath = "usernames.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(srcPath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destPath)))
        {
            String line;
            while((line = br.readLine()) != null) {
                // split text
                String[] words = line.split(" ");
                // combine and manipulate strings into username
                String username = words[0].substring(0,3) + words[1] + words[2].substring(2);
                // conver to lowercase and store as line
                line = username.toLowerCase() + "\n";
                // write line to output file
                bw.write(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("Error reading from file");
        }
    }
}
