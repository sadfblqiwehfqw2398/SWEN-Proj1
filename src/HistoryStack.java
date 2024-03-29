/**
 * Project 2 SWEN20003: Object Oriented Software Development 2017
 * by Hardaya Singh
 */
import java.util.ArrayList;

public class HistoryStack {
	
	public ArrayList<Float> xStack, yStack;
	
	public float getLastX() {
		return xStack.get(xStack.size()-1);
	}
	
	public float getLastY() {
		return yStack.get(yStack.size()-1);
	}
	
	public float getSecondLastX() {
		return xStack.get(xStack.size()-2);
	}
	
	public float getSecodLastY() {
		return yStack.get(yStack.size()-2);
	}

	public HistoryStack() {
		xStack = new ArrayList<Float>();
		yStack = new ArrayList<Float>();
	}
	
	

	public void push(float x, float y) {
		xStack.add(x); 
		yStack.add(y);
	}
	
	public void pop() {
		xStack.remove(xStack.size() - 1);
		yStack.remove(yStack.size() - 1);
		
	}
	
	public boolean isEmpty() {
		return xStack.size() == 0;
	}
}
