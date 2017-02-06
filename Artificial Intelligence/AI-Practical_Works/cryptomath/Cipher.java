
import java.util.Scanner;

/**
 * Created by asim on 4/15/15.
 */
public class Cipher {

    public static void main(String[] args) {

        Scanner stringReader = new Scanner(System.in);

        System.out.println("Enter a plain text: ");
        String plainText = stringReader.nextLine();

        System.out.println("Enter key: (only alphabets no spaces, comma, fullstops, etc.)");
        String key = stringReader.nextLine();

        key = key.toUpperCase();
        plainText = plainText.toUpperCase();

        char cipherText[] = new char[plainText.length()];
        char keyT[] = new char[plainText.length()];

        //generate a string containing respective key for matching with the plain text
        for(int i = 0, j = 0; i < plainText.length(); i++, j++){

            if (plainText.charAt(i) == ' ') {
                keyT[i] = ' ';
                j = -1;
            }
            else
                keyT[i] = key.charAt(j);

            if(j == key.length() - 1) j = -1;
        }

        for(int i = 0; i < plainText.length(); i++) {

            if (plainText.charAt(i) == ' ') {

                cipherText[i] = ' ';
                continue;
            }
            cipherText[i] = (char)(((plainText.charAt(i) - 65 + keyT[i] - 65) % 26) + 65);
        }

        System.out.println(cipherText);
    }
}
