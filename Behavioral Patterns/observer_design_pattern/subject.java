package observer;

public interface subject {
	void subscribe(observer o);
	void unsubscribe(observer o);
	void notifyAllSubscribers();

}
