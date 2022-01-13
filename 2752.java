// 동규는 세수를 하다가 정렬이 하고싶어졌다.

// 숫자 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어 졌다.

// 숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && b > c) {
            System.out.println(c + " " + b + " " + a);
        }

        else if (a > c && c > b) {
            System.out.println(b + " " + c + " " + a);
        }

        else if (b > a && a > c) {
            System.out.println(c + " " + a + " " + b);
        }

        else if (b > c && c > a) {
            System.out.println(a + " " + c + " " + b);

        }

        else if (c > a && a > b) {
            System.out.println(b + " " + a + " " + c);
        }

        else
            System.out.println(a + " " + b + " " + c);
            sc.close();
    }
    
}
