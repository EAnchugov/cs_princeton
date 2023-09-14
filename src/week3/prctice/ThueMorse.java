public class ThueMorse {
    public static void main(String[] args) {
        int x = 1;
        int n = Integer.parseInt(args[0]);
        String[] a = new String[n];
        String[] b = new String[n];
        if (n == 1) {
            System.out.println("+  ");
            return;
        }
        for (int k = 0; k < n; k++) {
            if (k == 0) {
                String s1 = "+  ";
                String s2 = "-  ";
                a[0] = s1;
                if (a[0] == s1) { a[1] = s2; }

                for (int i = 2; i < a.length; i = i+2) {
                    String tmp = a[x];
                    x++;
                    a[i] = tmp;
                    if (i+1 < a.length) {
                        if (tmp.equals(s1)) { a[i+1] = s2;
                        }
                        else { a[i+1] = s1;
                        }
                    }
                }

                for (int i = 0; i < a.length; i++) {
                    if (i % n == 0 && i != 0) {
                        System.out.println();
                    }
                    System.out.print(a[i]);
                }
                System.out.println();
            } else {
                String s1 = "+  ";
                String s2 = "-  ";
                b[0] = a[k];
                x = 1;
                if (b[0] == s1) { b[1] = s2; }
                else { b[1] = s1; }

                for (int i = 2; i < a.length; i = i+2) {
                    String tmp = b[x];
                    x++;
                    b[i] = tmp;
                    if (i+1 < a.length) {
                        if (tmp.equals(s1)) { b[i+1] = s2;
                        }
                        else { b[i+1] = s1;
                        }
                    }
                }

                for (int i = 0; i < b.length; i++) {
                    if (i % n == 0 && i != 0) {
                        System.out.println();
                    }
                    System.out.print(b[i]);

                }
                System.out.println();
            }
        }
    }
}


