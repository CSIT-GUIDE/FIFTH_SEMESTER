
import java.util.Scanner;

/**
 * Created by asim on 4/15/15.
 */
public class Decipher {

    public static void main(String[] args) {

        Scanner stringReader = new Scanner(System.in);

        System.out.println("Enter a plain text: ");
        String cipherText = stringReader.nextLine();

        System.out.println("Enter key: (only alphabets no spaces, comma, fullstops, etc.)");
        String key = stringReader.nextLine();

        key = key.toUpperCase();
        cipherText = cipherText.toUpperCase();

        char plainText[] = new char[cipherText.length()];
        char keyT[] = new char[cipherText.length()];

        //generate a string containing respective key for matching with the plain text
        for(int i = 0, j = 0; i < cipherText.length(); i++, j++){

            if (cipherText.charAt(i) == ' ') {
                keyT[i] = ' ';
                j = -1;
            }
            else
                keyT[i] = key.charAt(j);

            if(j == key.length() - 1) j = -1;
        }

        for(int i = 0; i < cipherText.length(); i++) {

            if (cipherText.charAt(i) == ' ') {

                plainText[i] = ' ';
                continue;
            }
            int value = cipherText.charAt(i) - 65 - (keyT[i] - 65);
            if(value>=0)
                plainText[i] = (char)(value % 26 + 65);
            else
                plainText[i] = (char)( (26 + value)% 26 + 65);
        }

        System.out.println(plainText);
    }
}
