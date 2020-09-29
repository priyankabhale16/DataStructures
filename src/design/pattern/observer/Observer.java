package design.pattern.observer;

public interface Observer {
	public void update(String stockSymbol, Float stockValue, Integer stockUnits);
}
