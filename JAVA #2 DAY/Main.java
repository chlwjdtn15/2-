// 문제 : 아래와 같이 출력해주세요.
// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.

class Main {
  public static void main(String[] args) {
// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.
    int dan = 8;
    
    int i = 1;
    
    System.out.println(dan + " * " + i + " = " + dan * i);
    i = i + 1; // i 의 값을 1 증가 시킨다.
    System.out.println(dan + " * " + i + " = " + dan * i);
    i += 1; // i 의 값을 1 증가 시킨다.(단축표현)
    System.out.println(dan + " * " + i + " = " + dan * i);
    i++; // i 의 값을 1 증가 시킨다.(단축표현)
    System.out.println(dan + " * " + i + " = " + dan * i);
    i++;
    System.out.println(dan + " * " + i + " = " + dan * i);
    i++;
    System.out.println(dan + " * " + i + " = " + dan * i);
    i++;
    System.out.println(dan + " * " + i + " = " + dan * i);
    i++;
    System.out.println(dan + " * " + i + " = " + dan * i);
    i++;
    System.out.println(dan + " * " + i + " = " + dan * i);
    i++;
    System.out.println("....");
    i = 1000;
    System.out.println(dan + " * " + i + " = " + dan * i);
    
    // 출력
    /*
    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
    ...
    8 * 1000
    */
  }
}