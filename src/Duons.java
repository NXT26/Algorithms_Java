import java.util.Scanner;
public class Duons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int duon[] = new int[8];
        for (int i = 0; i < duon.length; i++) {
            duon[i] = in.nextInt();
        }
        if ((duon[0] + duon[2] + duon[5] + duon[7]) != (duon[1] + duon[3] + duon[4] + duon[6])) {
            System.out.println("IMPOSSIBLE");
        } else {
            for (int i = 0; i < 100; i++) {
                if (duon[0] > 0 && duon[1] > 0) {
                    duon[0] -= 1;
                    duon[1] -= 1;
                    System.out.println("AB-");
                }
                if (duon[0] > 0 && duon[4] > 0) {
                    duon[0] -= 1;
                    duon[4] -= 1;
                    System.out.println("AE-");
                }
                if (duon[0] > 0 && duon[3] > 0) {
                    duon[0] -= 1;
                    duon[3] -= 1;
                    System.out.println("AD-");
                }
                if (duon[1] > 0 && duon[2] > 0) {
                    duon[1] -= 1;
                    duon[2] -= 1;
                    System.out.println("BC-");
                }
                if (duon[1] > 0 && duon[5] > 0) {
                    duon[1] -= 1;
                    duon[5] -= 1;
                    System.out.println("BF-");
                }
                if (duon[2] > 0 && duon[3] > 0) {
                    duon[2] -= 1;
                    duon[3] -= 1;
                    System.out.println("CD-");
                }
                if (duon[2] > 0 && duon[6] > 0) {
                    duon[2] -= 1;
                    duon[6] -= 1;
                    System.out.println("CG-");
                }
                if (duon[3] > 0 && duon[7] > 0) {
                    duon[3] -= 1;
                    duon[7] -= 1;
                    System.out.println("DH-");
                }
                if (duon[4] > 0 && duon[5] > 0) {
                    duon[4] -= 1;
                    duon[5] -= 1;
                    System.out.println("EF-");
                }
                if (duon[4] > 0 && duon[7] > 0) {
                    duon[4] -= 1;
                    duon[7] -= 1;
                    System.out.println("EH-");
                }
                if (duon[5] > 0 && duon[6] > 0) {
                    duon[5] -= 1;
                    duon[6] -= 1;
                    System.out.println("FG-");
                }
                if (duon[6] > 0 && duon[7] > 0) {
                    duon[6] -= 1;
                    duon[7] -= 1;
                    System.out.println("GH-");
                }
                if (duon[0] > 0 && duon[6] > 0) {
                    duon[4] += 1;
                    duon[5] += 1;
                    System.out.println("EF+");
                    duon[5] -= 1;
                    duon[6] -= 1;
                    System.out.println("FG-");
                    duon[0] -= 1;
                    duon[4] -= 1;
                    System.out.println("AE-");
                }
                if (duon[1] > 0 && duon[7] > 0) {
                    duon[0] += 1;
                    duon[3] += 1;
                    System.out.println("AD+");
                    duon[3] -= 1;
                    duon[7] -= 1;
                    System.out.println("DH-");
                    duon[0] -= 1;
                    duon[1] -= 1;
                    System.out.println("AB-");
                }
                if (duon[2] > 0 && duon[4] > 0) {
                    duon[0] += 1;
                    duon[1] += 1;
                    System.out.println("AB+");
                    duon[4] -= 1;
                    duon[0] -= 1;
                    System.out.println("AE-");
                    duon[1] -= 1;
                    duon[2] -= 1;
                    System.out.println("BC-");
                }
                if (duon[3] > 0 && duon[5] > 0) {
                    duon[0] += 1;
                    duon[1] += 1;
                    System.out.println("AB+");
                    duon[1] -= 1;
                    duon[5] -= 1;
                    System.out.println("BF-");
                    duon[0] -= 1;
                    duon[3] -= 1;
                    System.out.println("AD-");
                }
            }
        }
    }
}
