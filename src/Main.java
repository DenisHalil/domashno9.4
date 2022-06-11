public class Main {
    public static void main(String[] args) {
        int[][] numbers = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        int sumRow1 = numbers[0][0] + numbers[0][1] + numbers[0][2] + numbers[0][3] + numbers[0][4] + numbers[0][5];
        int sumRow2 = numbers[1][0] + numbers[1][1] + numbers[1][2] + numbers[1][3] + numbers[1][4] + numbers[1][5];
        int sumRow3 = numbers[2][0] + numbers[2][1] + numbers[2][2] + numbers[2][3] + numbers[2][4] + numbers[2][5];
        int sumRow4 = numbers[3][0] + numbers[3][1] + numbers[3][2] + numbers[3][3] + numbers[3][4] + numbers[3][5];
        int sumRow5 = numbers[4][0] + numbers[4][1] + numbers[4][2] + numbers[4][3] + numbers[4][4] + numbers[4][5];
        int sumRow6 = numbers[5][0] + numbers[5][1] + numbers[5][2] + numbers[5][3] + numbers[5][4] + numbers[5][5];
        System.out.println();
        System.out.println("11, 21, 31, 41, 51, 61");
        System.out.println("The sum of the elements is: " + sumRow1 + ", " + sumRow2 + ", " + sumRow3 + ", " + sumRow4 + ", " + sumRow5 + ", " + sumRow6);
    }
}