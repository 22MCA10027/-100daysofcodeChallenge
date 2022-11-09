class ArrayAddition
 {
    public static void main(String[] arg) {

        int[][] a = {
                { 11,22,33 },
                { 44,55,66},
                { 77,88,99},
        };
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + a[i][j];
            }
            int x = 0;
            x = i + 1;
            System.out.println("Sum of row " + x + " is " + sum);
        }
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + a[j][i];
            }
            int x = 0;
            x = i + 1;
            System.out.println("Sum of Coloum " + x + " is " + sum);
        }
        sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + a[i][j];
            }
        }
        System.out.println("Sum of elements of the Array is " + sum);
    }

}
