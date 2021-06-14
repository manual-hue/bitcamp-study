package com.eomcs.lang.ex04;

public class prac210614 {
  public static void main(String[] args) {
    int a = 20 ;
    char c;

    c = 0x0041; // Unicode상의 A(65)를 16진수로 표현

    System.out.println('됇');
    System.out.println(c);

    System.out.println(a);
    System.out.println("안녕하세요" + ((char)65) );
    
    System.out.println(2.2049184f);
    System.out.println(2.103920391039f); //float은 7자리 부동소수점까지 가능하다

    byte b = 100 ;
    short s = 100 ; 
    int i = 100 ;
    long l = 100 ;

    

    int v = 0x21; // 33 16진수

    for (int i = 0; i<10; i++) {
      System.out.println( (v+i) );

      }

  }
}