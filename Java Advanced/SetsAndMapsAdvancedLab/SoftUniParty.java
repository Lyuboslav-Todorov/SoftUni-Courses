package SetsAndMapsAdvancedLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guestWhoDidNotCome = new TreeSet<>();

        String invitedGuests = scanner.nextLine();
        while (!invitedGuests.equals("PARTY")){
            guestWhoDidNotCome.add(invitedGuests);
            invitedGuests= scanner.nextLine();
        }

        String guestsWhoCame = scanner.nextLine();

        while (!guestsWhoCame.equals("END")){
            guestWhoDidNotCome.remove(guestsWhoCame);
            guestsWhoCame = scanner.nextLine();
        }

        System.out.println(guestWhoDidNotCome.size());
        System.out.println(String.join(System.lineSeparator(), guestWhoDidNotCome));
    }
}
