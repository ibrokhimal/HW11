package HW4;

import java.util.Random;
import java.util.Scanner;

public class HW4 {

    static int size;

    final static char dot_empty = '•';
    final static char dot_human = 'x';
    final static char dot_ai = 'o';
    static char[][] map;
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        size = in.nextInt()+1;
        map  = new char[size][size];

        chostMap();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j]);;
            }
            System.out.println();
        }



    }

    private static void chostMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dot_empty;
            }
        }
        map[0][0] = '?';
        for (int i = 1; i < size; i++) {
            map[0][i] = (char)i;
            map[i][0] = (char)i;
        }
    }
}

