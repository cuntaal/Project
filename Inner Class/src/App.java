
public class App {
	
	public static void main (String[] args) {
	
	Robot robot = new Robot(8);
	robot.play();
	System.out.println("-----------");
	Robot.Brain brain = robot.new Brain ();
	brain.think();
}
}