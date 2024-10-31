public class homework_22 {

    //session 1
    public static int powerOfTwo(int n) {

        if (n == 0) {
            return 1;
        }
        return 2 * powerOfTwo(n - 1);
    }


    //session 2
    public static int power(int x, int n) {
        if (n == 0){
            return 1;
        }
        return x * power(x, n - 1);
    }

    //session 3
    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNatural(n - 1);
    }

    //session 4
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return decimalToBinary(n / 2) + (n % 2);
    }

    //session 4
    public static int binaryToDecimal(String binary, int length) {
        if (length == 0) {
            return 0;
        }
        int lastDigit = binary.charAt(length - 1) - '0';
        return (lastDigit * (int) Math.pow(2, binary.length() - length)) + binaryToDecimal(binary, length - 1);
    }

    //session 5
    public static void permute(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
        }
    }


    //session 6
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    //session 7
    public static int sumEven(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        int last = (arr[n - 1] % 2 == 0) ? arr[n - 1] : 0;
        return last + sumEven(arr, n - 1);
    }

    //session 9
//    public static boolean isSymmetric(int[] arr, int start, int end) {
//        if (start >= end)
//            return true;
//
//    }

}
