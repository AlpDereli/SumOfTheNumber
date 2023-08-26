import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String s = take.nextLine();
        int sum = 0;
        for(int i = 0; i <s.length();i++)
        {
            int num = s.charAt(i)-'0';
            sum+=num;
        }
        System.out.println("Sum: " + sum);
    }
}
