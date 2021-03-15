import java.util.Scanner;

public class wordpalidrom {
    public static void main(String[] args) {
        Scanner enteredword = new Scanner(System.in);
        System.out.print("enter a word: ");

        String word =enteredword.nextLine();
        String newword = "";

        for (int i = (word.length() - 1); i >= 0; i--) {
            newword += word.charAt(i);
        }
        if (newword.equals(word)) {
            System.out.println("this word is  palidrom.");
        } else {
            System.out.println("this word is  not palidrom.");
        }
    }
    }

