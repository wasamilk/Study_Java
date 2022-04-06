package ch09_implements_extends;

public interface Queue {

	void enQueue(String title);
	String deQueue();
	
	int getSize();
}