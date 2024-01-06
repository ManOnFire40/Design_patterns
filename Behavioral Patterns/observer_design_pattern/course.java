package observer;

import java.util.ArrayList;
import java.util.List;

public class course implements subject{
	private String name; 
	private String availability; 
	private List<observer> observerList;
	public course (String name) {
		this.name=name;
		this.observerList=new ArrayList<>();
	}
	@Override
	public void subscribe(observer o) {
		// TODO Auto-generated method stub
		observerList.add(o);
		
	}

	@Override
	public void unsubscribe(observer o) {
		// TODO Auto-generated method stub
		observerList.remove(o);

		
	}

	@Override
	public void notifyAllSubscribers() {
		// TODO Auto-generated method stub
		for(observer o: this.observerList)
		o.update(availability);
		
	}
	public void setAvailability(boolean isavaliable) {
		this.availability= this.name+(isavaliable? " avaliable":" Not avaliable");
		notifyAllSubscribers();
	} 
	
}
