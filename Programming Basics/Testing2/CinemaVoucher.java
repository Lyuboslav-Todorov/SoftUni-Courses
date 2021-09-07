package Testing2;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherValue = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int tickets = 0;
        int others = 0;
        int price = 0;

        while (!command.equals("End")){
            if (command.length() > 8){
                price += command.charAt(0) + command.charAt(1);
                if (price <= voucherValue){
                    tickets++;
                }else{
                    break;
                }
            }else{
                price += command.charAt(0);
                if(price <= voucherValue){
                    others++;
                }else{
                    break;
                }
            }
            command = scanner.nextLine();
        }

        System.out.println(tickets);
        System.out.println(others);
    }
}
