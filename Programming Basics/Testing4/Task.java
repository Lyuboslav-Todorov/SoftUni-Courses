package Testing4;

public class Task {
    public static void main(String[] args) {

        int evenCounter = 0;
        int oddCounter = 0;

        for (int i = 1; i <= 15 ; i+=2) {
            for (int j = 1; j <= 15 ; j+=2) {
                for (int k = 1; k <= 15 ; k+=2) {
                    int sum = i + j + k;
                    if (sum % 2 == 0){
                        evenCounter ++;
                        System.out.printf("%d + %d + %d = %d%n", i, j, k, sum);
                    }else{
                        oddCounter++;
                    }
                }
            }
        }
        System.out.printf("Even numbers = %d%n", evenCounter);
        System.out.printf("Odd numbers = %d", oddCounter);
    }
}
