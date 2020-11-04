
import java.util.ArrayList;


public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 2;
        int[][] matrix = new int[rows][columns];
        matrix[0][0] = 1;
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][1] = 33;
//        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
        System.out.println(sumsOfColumns(matrix));

    }

    public static String arrayAsString(int[][] array) {
        StringBuilder myBuider = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                myBuider.append(array[i][j]);
            }
            myBuider.append("\n");
        }
        return myBuider.toString();

    }
    
    public static ArrayList<Integer> sumsOfColumns(int[][] square) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < square.length; i++) {
            if (i == 0) {
                for (int j = 0; j < square[i].length; j++) {
                    myList.add(square[i][j]);
                    System.out.println("square[i][j] = " + square[i][j]);
                }
            } else {
                int sum = 0;
                for (int j = 0; j < square[i].length; j++) {
//                    sum += square[i][j];
                    int nr = myList.get(j);
                    nr += square[i][j];
                    myList.set(j, nr);
                    System.out.println("nr = " + nr);

                }
            }
        }

        return myList;
    }    
}
