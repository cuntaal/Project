
public class Robot {
  int id;
 class Brain{
	 public void think(){
		 System.out.println("Robot "+ id + "is thinking.....");
	 }
 }
public Robot(int id) {
	this.id = id;
}
 public void play() {
	 Brain brain= new Brain();
	 brain.think();
	 System.out.println("Finished");
	 class Temp{
		 
	 public void doSomething(){
		  System.out.println("");
	 }
	 }
	 Temp temp = new Temp();
	 temp.doSomething();
 }
}
