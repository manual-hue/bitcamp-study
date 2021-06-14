package com.eomcs.lang.ex04;

public class Test04 {
  public static void main(String[] args) {
    // 1. 배열 메모리의 시작 주소를 저장할 레퍼런스를 선언한다.
      int[] a;

    // 주소를 넣어 변수 초기화 선언을 하지 않으면 오류가 뜬다. > 2. 레퍼런스 변수에 배열 메모리 주소를 준다.
    a = new int[3];

    a[0] = 100;
    a[1] = 200;
    a[2] = 300;

    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    // System.out.println(a[3]);
    
    int[] b;
    b = a ;

    System.out.println(b[1]);

  }
}
