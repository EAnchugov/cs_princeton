public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
//        int n = 365;
//        int trials = 1000000;
        int[] birthday = new int[n+2];
        for (int i = 0; i < trials; i++) {
            boolean[] birthdays = new boolean[n+1];
            boolean isBirthday = false;
            int peopleInRoom = 0;
            while (!isBirthday) {
                int manBirthday = (int) (Math.random() * n) + 1;
                if (birthdays[manBirthday]) {
                    isBirthday = true;
                } else {
                    birthdays[manBirthday] = true;
                }
                peopleInRoom++;
            }
            birthday[peopleInRoom]++;
        }

        // print
        int i = 1;
        double count = 0;
        while (count/trials < 0.5) {
            count = count + birthday[i];
            double fraction = count/trials;
            System.out.print(i + " " + birthday[i] + " " + fraction);
            System.out.println();
            i++;
        }
    }
}