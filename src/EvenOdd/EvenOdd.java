package EvenOdd;

import java.util.Scanner;

public class EvenOdd {

        public static void main(String[] args)
        {
            Scanner reader = new Scanner(System.in);
            System.out.println("Įveskite  skaiciu: ");
            int skaicius = reader.nextInt();

            if (skaicius % 2 == 0)  {
                System.out.println("Skaičius lyginis: "+ skaicius);
            }  else {
                System.out.println("Skaičius nelyginis: "+ skaicius);
            }
        }
}