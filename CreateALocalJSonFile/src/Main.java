import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner userInput = new Scanner(System.in);
        String Directory = "C:\\Users\\aless\\GameTextFile\\gamesFile.json";
        File file = new File(Directory);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File successfully created: " + file.getName());
        } else {
            System.out.println("File already exists");
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String fileToCheckIfEmpty = reader.readLine();
        reader.close();

        if (fileToCheckIfEmpty == null) {
            System.out.println("Please enter a game you'd like to add: ");
            String textToAdd = userInput.nextLine();
            System.out.println("Please enter the name of first player: ");
            String player1 = userInput.nextLine();
            System.out.println("Please enter the name of second player: ");
            String player2 = userInput.nextLine();
            System.out.println(player1 + " " + player2);

            try {
                FileWriter writer = new FileWriter(file, true);
                writer.append(textToAdd);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }








    }
}
