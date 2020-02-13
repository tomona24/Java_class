package basics;

import java.util.Scanner;

// IO stands for "Input" and "Output"
public class IOexample {
    public static void main(String[] args) {
        // Write a program to say hello in each language
        // "en" - English
        // "br" - Portuguese (brazilian)
        // "es" - Spanish
        // "sk" - Slovak
        // "jp" - Japanese

        Scanner in = new Scanner(System.in);  // input the pass of the file you want to read
        System.out.println("Choose the language (en, br, es, sk, jp)");
        String countryCode = in.nextLine();
        switch (countryCode) {
            case "en":
                System.out.println("Hello");
                break;
            case "br":
                System.out.println("Oi");
                break;
            case "es":
                System.out.println("Hola");
                break;
            case "sk":
                System.out.println("Ahoi");
                break;
            case "jp":
                System.out.println("Konnichiwa");
                break;
            default:
                break;
        }

    }

}
