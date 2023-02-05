public class Main {
    public static void main(String[] args) {

        int[] wastes = {1650,4562,13052,4869,4562,1204,5100,623,4852,9506,3241,5862,4013,6205,4520,10425,3602,9800,40500,7400,625,9001,4502,3520,4156,826,950,1456,325,845,612};
        int sum = 0;
        for (int element : wastes) {
            sum = sum + element;
        }
        System.out.println(sum);
        System.out.println("task2");
        int maximum = wastes [0];
        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] > maximum) {
                maximum = wastes[i];
            }
        }
        System.out.println(maximum);
        System.out.println("task2");
        int minimum = wastes[0];
        for(int i = 0; i < wastes.length; i++) {
            if (wastes[i]< minimum) {
                minimum = wastes[i];
            }
            System.out.println(minimum);
        }
        System.out.println("task3");
        System.out.println("Средняя сумма трат за месяц составила " + sum / wastes.length);
        System.out.println("task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseFullName[0] = 'n';
        int f = reverseFullName[0];
        System.out.println(f);
        reverseFullName[1] = 'a';
        int fF = reverseFullName[1];
        System.out.println(fF);
        reverseFullName[2] = 'v';
        int fFF = reverseFullName[2];
        System.out.println(fFF);
        reverseFullName[3] = 'I';
        int fFFF = reverseFullName[3];
        System.out.println(fFFF);
        reverseFullName[4] = ' ';
        int fFFFF = reverseFullName[4];
        System.out.println(fFFFF);
        reverseFullName[5] = 'v';
        int fFFFFF = reverseFullName[5];
        System.out.println(fFFFFF);
        reverseFullName [6] = 'o';
        int g = reverseFullName[6];
        System.out.println(g);
        reverseFullName[7] = 'n';
        int gG = reverseFullName[7];
        System.out.println(gG);
        reverseFullName[8] = 'a';
        int gGG = reverseFullName[8];
        System.out.println(gGG);
        reverseFullName [9] = 'v';
        int gGGG = reverseFullName[9];
        System.out.println(gGGG);
        reverseFullName[10] = 'I';
        int gGGGG = reverseFullName[10];
        System.out.println(gGGGG);
        for (int i = 0; i < reverseFullName.length; i++){
            int result = reverseFullName[i];
            System.out.println(result);
            }
        }


    }
