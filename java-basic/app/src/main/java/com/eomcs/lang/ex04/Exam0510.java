package com.eomcs.lang.ex04;

//# 배열 - 배열을 선언하는 방법 
// 배열?
// - 같은 종류의 메모리를 쉽게 만드는 방법
//
// - 문법
//        메모리종류[] 메모리이름 = new 메모리종류[개수]
//        데이터타입[] 변수명 = new 데이터타입[개수];
//        ex) int[] arr = new int[5];
//
// - C언어 스타일 
//        데이터타입 변수명[] = new 데이터타입[개수];
//        ex) int arr[] = new int[5];
//
// 배열의 개수는 int 타입의 최대 값과 같다.
// 즉 2147483647 개 이다. 약 21억개
//
public class Exam0510 {
  public static void main(String[] args) {
    // 배열 사용 전
    int i1, i2, i3, i4, i5;

    // 배열 선언
    int[] arr1 = new int[5]; // OK!
    int arr2[] = new int[5]; // OK! C-style.

    // 배열의 크기는 int 타입의 최대 값이다.
    // int[] arr3 = new int[2147483647]; // 실행 오류 => VM의 배열 크기 제한 초과
  
    int[] arr3 = new int[2147483645]; // OK!
    // int[] arr4 = new int[Integer.MAX_VALUE - 2]; // OK!

    // 실행 오류 발생!
    // => Exception in thread "main" java.lang.OutOfMemoryError : Java heap space
    // => JVM이 OS로부터 사용허가를 받은 메모리 크기를 벗어나서 발생하는 오류.

    // 해결책?
    // => JVM 실행시 힙(heap) 메모리의 초기 크기를 늘려라.
    // => JVM 실행 옵션에 다음을 추가하라!
    //        -Xmx 메모리 크기
    //     예) $ java -Xmx20000m ...
    //     예) java -Xmx10g -cp app/bin/main com.eomcs.lang.ex04.Exam0510
  }
}


