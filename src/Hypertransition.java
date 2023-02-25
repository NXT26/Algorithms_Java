import java.util.Scanner;
public class Hypertransition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Count = in.nextInt();
        int Sum = 0;
        int Max = 0;
        for (int i = 0; i < Count; i++) {
            int Num = in.nextInt();
            if (Sum + Num < 0) {
                Sum = 0;
            } else {
                Sum += Num;
                if (Sum > Max) {
                    Max = Sum;
                }
            }
        }
        System.out.println(Max);
    }
}
