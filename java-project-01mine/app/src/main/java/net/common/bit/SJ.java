package net.common.bit;


public class SJ {

  public int getTotal(String name, int aa, int bb) {
    System.out.println(name + "님의 성적 합계 처리");
    int hap = aa + bb;
    return hap;
  }
  
    public double getMean(int value) {
      double dd = value/2.0;
      return dd;
    }

    //학점을 구하는 메서드 구현 100~90A 80~89B 70~79C 60~69D 0~59F
    //평균점수에 따라서 if 대신 switch 사용
    //리턴값을 어떤 타입으로 둘지, 메서드의 이름은 적절한지 고민하기
    
    public char getGrade(double data) {
      char grade='F';      
      switch ((int)data) {
        case 100:
          grade='A'; break;
        case 90:
          grade='A'; break;
        case 80:
          grade='B'; break;
        case 70:
          grade='C'; break;
        case 60:
          grade='D'; break;
          default:
          grade='F'; break;
      }
      return grade;
    }
  }
