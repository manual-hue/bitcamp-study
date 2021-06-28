package net.common.bit;



class CampTest01 {
    private char[] map;

    public CampTest01(String string) {
      System.out.println("cp gw");
      }

    public void  input(  ){ }
      
    public void  output(  ){ }
    
    public void  printAll(String[] args) {
      System.out.println(map);
      }
    
    public void  myExit(String[] args){
      System.exit(5);
      }
    
    public int menu(){
      return 1/2/3/9;
      }

    public static void main(String[] args){
       CampTest01 ct = new CampTest01("삼송 글램핑장");
       ct.input();
    } 
  } //class END