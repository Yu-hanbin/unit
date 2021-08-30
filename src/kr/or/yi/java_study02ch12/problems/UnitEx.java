package kr.or.yi.java_study02ch12.problems;

public class UnitEx<T extends Unit> {
	private T unit;

	public T getUnit() {
		return unit;
	}

	public void setUnit(T unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return String.format("UnitEx [unit=%s]", unit);
	}
	
	public void stop() {
		this.unit.stop();
	}
}
