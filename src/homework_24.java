import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class homework_24 {

    static class homework1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            if (k == 0) {
                if (a[0] > 1) {
                    System.out.println(a[0] - 1);
                } else {
                    System.out.println("-1");
                }
            } else {
                int x = a[k - 1];
                if (k < n && a[k] == x) {
                    System.out.println("-1");
                } else {
                    System.out.println(x);
                }
            }
            sc.close();
        }
    }

    static class homework2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] bills = new int[n];
            for (int i = 0; i < n; i++) {
                bills[i] = sc.nextInt();
            }
            int count25 = 0, count50 = 0;
            for (int bill : bills) {
                if (bill == 25) {
                    count25++;
                } else if (bill == 50) {
                    if (count25 > 0) {
                        count25--;
                        count50++;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                } else if (bill == 100) {
                    if (count50 > 0 && count25 > 0) {
                        count50--;
                        count25--;
                    } else if (count25 >= 3) {
                        count25 -= 3;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                }
            }
            System.out.println("YES");
            sc.close();
        }
    }

    static class homework3 {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] t = new int[n];
                for (int i = 0; i < n; i++) {
                    t[i] = sc.nextInt();
                }
                int left = 0, right = n - 1;
                int timeHaley = 0, timeLeviz = 0;
                int countHaley = 0, countLeviz = 0;
                while (left <= right) {
                    if (timeHaley <= timeLeviz) {
                        timeHaley += t[left];
                        left++;
                        countHaley++;
                    } else {
                        timeLeviz += t[right];
                        right--;
                        countLeviz++;
                    }
                }
                System.out.println(countHaley + " " + countLeviz);
                sc.close();
            }
        }

    static class homework4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            long countOnes = 0;
            long result = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '1') {
                    countOnes++;
                } else if (ch == '2') {
                    result += countOnes;
                }
            }
            System.out.println(result);
        }
    }

    static class homework5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of input: ");
            int n = scanner.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter input:");
                a[i] = scanner.nextInt();
            }


        }
    }

    static class homework6 {

        private static int remove0(int number) {
            String withoutZeros = Integer.toString(number).replace("0", "");
            return Integer.parseInt(withoutZeros);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a + b;
            int aChar = remove0(a);
            int bChar = remove0(b);
            int cChar = remove0(c);
            if (aChar + bChar == cChar) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            scanner.close();
        }
    }

    static class homework7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[][] people = new int[N][2];

            for (int i = 0; i < N; i++) {
                people[i][0] = scanner.nextInt();
                people[i][1] = scanner.nextInt();
            }
            Arrays.sort(people, Comparator.comparingInt(a -> a[0]));
            int totalTime = 0;
            int currentTime = 0;
            for (int i = 0; i < N; i++) {
                currentTime += people[i][0];
                totalTime = Math.max(totalTime, currentTime + people[i][1]);
            }
            System.out.println(totalTime);
            scanner.close();
        }
    }

    static class homework8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < T; i++) {
                String K = scanner.nextLine();

                int len = K.length();
                int last2digits = len >= 2 ? Integer.parseInt(K.substring(0, 2)) : Integer.parseInt(K);
                boolean divisibleBy4 = last2digits % 4 == 0;

                int sumofDigits = 0;
                for (int j = 0; j < len; j++) {
                    sumofDigits += K.charAt(j) - '0';
                }

                boolean divisibleBy9 = last2digits % 9 == 0;


                if (divisibleBy4 && divisibleBy9) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            scanner.close();
        }
    }
}
