package homeWork.lesson4;

public class HomeTask1Lesson4 {
    public static void main(String[] args) {
        int[] mass = {22, 44, 55, 66, 77, 88};
        int sumNumbers = 0;
        int sumChetnor = 0;
        int sumNechet = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println(mass[i]);


        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(mass[i]);

        }
        for (int i = 0; i <= 5; i++) {
            if (mass[i] % 2 == 0) {
                System.out.println(mass[i]);

            }


        }
        for (int i = 0; i <= 5; i += 2) {
            System.out.println(mass[i]);


        }
        for (int i = 0; i <= 5; i++) {
            sumNumbers = sumNumbers + mass[i];

        }
        System.out.println(sumNumbers);

        for (int i = 0; i <= 5; i++) {
            if (mass[i] % 2 == 0) {
                sumChetnor = sumChetnor + mass[i];
            } else if (mass[i] % 2 != 0) {
                sumNechet = sumNechet + mass[i];
            }
        }
        System.out.println(sumChetnor - sumNechet);
    }

}
