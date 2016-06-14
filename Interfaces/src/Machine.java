
public class Machine implements Info, ISartable {
  int id ;

public Machine(int id) {
	this.id = id;
}

@Override
public void showInfo() {
	// TODO Auto-generated method stub
	System.out.println("My Machine is" + id);
}

@Override
public void start() {
	// TODO Auto-generated method stub
	System.out.println("Machine is started");
}

@Override
public void stop() {
	// TODO Auto-generated method stub
	System.out.println("Machine is stop");
	
}
 
}
