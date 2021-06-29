package net.common.bit;

public class SJUser {

  public static void main(String[] args) {
    SJ sj = new SJ();
    
    String id = "gilbert";
    int first = 90;
    int second = 85;
    int total = sj.getTotal(id, first, second);
    double avg = sj.getMean(total);
    char grade = sj.getGrade(avg);
    
    System.out.println("합계" + total);
    System.out.println("평균" + avg);
    System.out.println("학점" + grade);
    //setTitle, getTitle
    }
  }