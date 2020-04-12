// 문제 : 아래와 같이 출력해주세요.
// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.

class Main {
  public static void main(String[] args) {
// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.
    
    /*
    1st Try

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
    */


  /*
   int dan = 8;
    
    int i = 1;
    

    // if 와 while을 배우다.
    // ++ 의 개념도 배우다. 더하기나 빼기 하고싶은면 (a + b) 식으로 가로안에 넣어야됨 (곱하기 나누기는 상관없음).

    while ( i <=2 ){
      System.out.println(i); // 1, 2
      i++;
    }
    System.out.println(i); // 3

    i = 0;

    while ( i <= 1000 ){
      System.out.println(dan + " * " + i + " = " + dan * i);
      i++;
    }
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

  // 문제 : 아래와 같이 출력해주세요.
  // 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.
/*
    int dan = 8;
    
    int i = 1;

    while ( i <= 1000 ){
      System.out.println(dan + " * " + i + " = " + dan * i);
      i++;
    }

    while ( i >= -500){
      System.out.println(dan + " * " + i + " = " + dan * i);
      i--;
    }
  */
    int sum = 0;
    int i = 1;
    // 1 부터 5까지 더하기. += && -= 배우기 
    while (i <= 5)
    {
      sum = sum += i;
      
      i ++;
    }
    System.out.println(sum);
    // 출력
    /*
    8 * 1000 = 8000
    ...
    8 * -500 = -4000
    */
  }
}

/*
변수(선언, 사용)
함수 printl
반복문
*/