import java.util.*;

public class Hanoi {
  private statc void move(int n,int x,int y,int z){
    if(n==1){
      System.out.printf("%c-->%c\n",x,z);
    }else{
      move(n-1,x,z,y);
      System.out.printf("%c-->%c\n",x,z);
      move(n-1,y,x,z);
    }
  }

  public static void main(String[] args){
    int h;
    Scanner s = new Scanner(System.in);
    System.out.printf("输入数字：");
    h = s.nextInt();
    System.out.printf("移动%d个圆盘的步骤：",h);
    move(h,'a','b','c');
  }
}
