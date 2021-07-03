package com.eomcs.lang.ex06;

public class Test01 {
  
  static int countEvenNumbers(int value) {
    int count = 0;
    
    // 이 메서드는 파라미터(value)로 주어진 값을 분석하여
    // 짝수 개수를 리턴하는 메서드이다.
    // 코드를 완성하시오!
    // ex) value = 4567034 --> 리턴 값 = 4
    // ex) value = 8088753 --> 리턴 값 = 4    
    
    int n = value;
    while (n != 0) { // n이 0이 아닌 동안에만 반복한다
      if ((n % 2) == 0) //n 값을 10으로 나눈 나머지가 0일 경우==짝수
        count++; // if가 맞을 경우 하나씩 증가시킨다
      n = n / 10; // 10으로 나눈 나머지 값을 n에 저장한다
    }
    
    return count;
  }
  
  public static void main(String[] args) {
    
    int result = countEvenNumbers(19940315); //짝수 개수 출력
    System.out.println(result);
    
    result = countEvenNumbers(8088753);
    System.out.println(result); //4
  }
}
