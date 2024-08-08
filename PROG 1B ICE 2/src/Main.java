import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        i();
        ii();
        iii();
        iv();
        v();
        vi();
        vii();
        viii();
        ix();
        x();
        bubbleSort();
        insertionSort();
    }

    private static void insertionSort () {

    }
    private static void bubbleSort(){

    }
    private static void x() {
        int[][] intArr = {{0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 2, 3, 4, 5, 6, 7}, {0, 2, 4, 6, 8, 10, 12, 14}, {0, 3, 6, 9, 12, 15, 18, 21}, {0, 4, 8, 12, 16, 20, 24, 28}, {0, 5, 10, 15, 20, 25, 30, 35}};

        for (int i = 0; i < intArr.length; i++) {
            int sum = 0;
            int j;
            for (j = 0; j < intArr[i].length; j++) {
                System.out.println(intArr[i][j] + ", ");
                sum += intArr[i][j];//Calculate sum
            }
            System.out.println(": " + sum);
        }

    }
    private static void ix(){
        int[][] intArr = {{0, 0, 0, 0, 0, 0, 0, 0},{0, 1, 2, 3, 4, 5, 6, 7},{0, 2, 4, 6, 8, 10, 12, 14},{0, 3, 6, 9, 12, 15, 18, 21},{0, 4, 8, 12, 16, 20, 24, 28},{0, 5, 10, 15, 20, 25, 30, 35}};

    }
    private static void viii(){
        int[][] intArr;
        intArr = new int[5][];
        intArr = new int[0][8];
        intArr = new int[1][8];
        intArr = new int[2][8];
        intArr = new int[3][8];
        intArr = new int[4][8];
    }
    private static void vii(){
        int[][] intArr;
        intArr = new int[5][8];
    }
    private static void vi(){
        int[][] intArr = new int[5][8];
    }
    private static void v(){
        Random rand = new Random();
        int[] intArr = new int[50];
        for ( int i = 0; i < intArr.length; i++){
            intArr[i] = rand.nextInt(50);
            if (intArr[i] > intArr[i-1]){
                int temp = intArr[i];
                intArr[i] = intArr[i-1];
                intArr[i-1] = temp;
            }
        }

    }
    private static void iv() {
        String[] strArr = new String[];
        for (int i = strArr.length - 1; i >= 0; i--){
            System.out.println(i + ": " + strArr[i] + "\n");
        }
        }
    private static void iii() {
        int length = 2;
        String[] strArr = new String[length];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "\\";
        }
    }
    private static void ii() {
        String[] strArr;
        strArr = new String[50];
    }
    private static void i(){
        String[] strArr = new String[50];
    }
}


