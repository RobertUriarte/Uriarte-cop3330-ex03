/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        System.out.print("What is the quote? ");
        Scanner scan = new Scanner(System.in);
        String quote = scan.nextLine();
        System.out.print("Who said it? ");
        String author = scan.nextLine();
        System.out.print(author + " says, \"" + quote + ".\"");
    }
}
