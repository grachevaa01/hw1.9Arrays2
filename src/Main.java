public class Main {
    public static void main(String[] args) {

        int[] wastes = {1650,4562,13052,4869,4562,1204,5100,623,4852,9506,3241,5862,4013,6205,4520,10425,3602,9800,40500,7400,625,9001,4502,3520,4156,826,950,1456,325,845,612};
        int sum = 0;
        for (int element : wastes) {
            sum = sum + element;
        }
        System.out.println(sum);
        System.out.println("task2");
        int maximum = -1;
        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] > maximum) {
                maximum = wastes[i];
            }
        }
        System.out.println(maximum);
        System.out.println("task2");
        int minimum = wastes[0] + 1;
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
        for (int i = 0; i< reverseFullName.length; i++){
            System.out.println(reverseFullName[i]);
            System.out.println();
            int conditional = -1;
            for (final int current : reverseFullName) {
                if (current > conditional) {
                    conditional = current;
                }
            }
            System.out.println(conditional);
            }
        }


    }
