import java.util.Objects;

//Minesweeper. Minesweeper - это видеоигра 1960-х годов, которая играется на сетке размером m-на-n ячеек. Цель игры - выяснить, в каких ячейках находятся скрытые мины, используя подсказки о количестве мин в соседних ячейках. Напишите программу Minesweeper.java, которая принимает три целых числа через командную строку m, n и k, и выводит сетку размером m-на-n ячеек с k минами, используя звездочки для обозначения мин и целые числа для подсчета количества соседних мин (с двумя пробелами между каждой ячейкой). Для этого:
//
//        Создайте сетку размером m-на-n ячеек, в которой ровно k из mn ячеек содержат мины, равномерно на случайной основе.
//
//        Для каждой ячейки, не содержащей мину, подсчитайте количество соседних мин (вверх, вниз, влево, вправо или по диагонали).
public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

//        int m = 10;
//        int n = 10;
//        int k = 7;


        // поле
        String[][] field = new String[(m+2)][(n+2)];

        //Равномерно разместите k мин среди mn ячеек.
        int mineNumber = 0;
        while (mineNumber < k){
            int row = (int) (Math.random()*m);
            int column = (int) (Math.random()*n);
            if (field[row + 1][column + 1] ==null) {
                field[row + 1][column + 1] = "*";
                mineNumber++;
            }
        }
        //Убираем null

        for (int i = 0; i < m + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                if (field[i][j] == null) {
                    field[i][j] = "0";
                }
            }
            System.out.println();
        }
//                Подсчитайте количество соседних шахт.
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                //1
                if ((Objects.equals(field[i][j], "*"))) {
                    if ((!Objects.equals(field[i - 1][j - 1], "*"))) {
                            field[i - 1][j - 1] = String.valueOf(Integer.parseInt(field[i - 1][j - 1]) + 1);
                    }
                    // 2
                        if (!(Objects.equals(field[i][j - 1], "*"))) {
                                field[i][j - 1] = String.valueOf(Integer.parseInt(field[i][j - 1]) + 1);
                        }
                    //3
                        if (!(Objects.equals(field[i + 1][j - 1], "*"))) {
                                field[i + 1][j - 1] = String.valueOf(Integer.parseInt(field[i + 1][j - 1]) + 1);
                        }
                    //4
                        if (!(Objects.equals(field[i - 1][j], "*"))) {
                                field[i - 1][j] = String.valueOf(Integer.parseInt(field[i - 1][j]) + 1);
                        }

                    // 5
                        if (!(Objects.equals(field[i - 1][j + 1], "*"))) {
                                field[i - 1][j + 1] = String.valueOf(Integer.parseInt(field[i - 1][j + 1]) + 1);
                        }
                    //6

                        if (!(Objects.equals(field[i + 1][j + 1], "*"))) {
                                field[i + 1][j + 1] = String.valueOf(Integer.parseInt(field[i + 1][j + 1]) + 1);
                        }
                    //7
                        if (!(Objects.equals(field[i][j + 1], "*"))) {
                                field[i][j + 1] = String.valueOf(Integer.parseInt(field[i][j + 1]) + 1);
                        }
                    //8
                    if (!(Objects.equals(field[i + 1][j], "*"))) {
                            field[i + 1][j] = String.valueOf(Integer.parseInt(field[i + 1][j]) + 1);
                    }
                }
            }
        }




//                Распечатайте результаты.
        for (int i = 1; i < m + 1; i++) {
             for (int j = 1; j < n + 1; j++) {
                    System.out.print(field[i][j] + "  ");
             }
            System.out.println();
        }
    }
}
