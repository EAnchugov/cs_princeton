// Write a program DiscreteDistribution.java that takes an integer command-line argument m,
//        followed by a sequence of positive integer command-line arguments a1,a2,…,an
//        , and prints m random indices (separated by whitespace), choosing each index i
//        with probability proportional to ai
//        .
public class DiscreteDistribution {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int[] a = new int[(args.length - 1)];

        for (int m = 1; m < args.length; m++) {
            a[m-1] = Integer.parseInt(args[m]);
        }

        for (int t = 0; t < i; t++) {
            int r = (int) (Math.random() * a.length);
            System.out.print(r + 1 + "  ");
        }
    }
}
