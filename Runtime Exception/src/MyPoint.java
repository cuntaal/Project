public class MyPoint {
int x=0;
int y=0;
public static void main (String [] args){

  MyPoint start = new MyPoint();
  MyPoint end = new MyPoint();
  
  start.x= 10;
  start.y=10;
  end.x=20;
  end.y=30;
  
		System.out.println("Start point is " + start);
		System.out.println("Start point is " + end);
  
MyPoint stray  = new MyPoint();
stray=end;

 System.out.println("Start point is " + stray); 
 System.out.println("Start point is " + end); 
 stray.x=47;

 
 System.out.println("Start point is " + stray); 
 System.out.println("Start point is " + end); 
 System.out.println("Start point is " + start); 
 
}
  public String toString() {
    return ("[" + x + "," + y + "]");
  }
}

