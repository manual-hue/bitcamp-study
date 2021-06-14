package com.eomcs.lang.ex03;
    
class Test03 {
    
    public static void main(String[] args) {
        System.out.println(2.127f);
        System.out.println(1.1f + 1.027f);
        System.out.println(2.0f + 0.127f);
        System.out.println(1.123f + 1.004f);
        System.out.println((2.0f + 0.127f) == 2.127f ); // 같냐는 질문으로 인식되어 t/f의 답이 출력된다.
        System.out.println((1.123f + 1.004f) == 2.127f ); // 2진수 변환시 딱 떨어지지 않아 false 값으로 출력된다.
        //f를 붙이면 32bit에 저장되고 d 또는 붙이지 않을 경우 8byte 메모리에 저장된다.
    }
}
