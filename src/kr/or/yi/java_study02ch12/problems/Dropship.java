package kr.or.yi.java_study02ch12.problems;

class Dropship extends Unit { // 수송선
	int x, y; // 현재 위치

	void move(int x, int y) {
		System.out.printf("Dropship이 지정된 위치(%s, %s)로 이동합니다.", x, y);
	}

	void stop() {
		System.out.println("Dropship이 현재 위치에 멈춥니다.");
	}

	void load() {
		System.out.println("Dropship에 선택된 대상을 태웁니다.");
	}

	void unload() {
		System.out.println("Dropship에서 선택된 대상을 내립니다.");
	}

	@Override
	public void move() {

	}

	@Override
	public String toString() {
		return String.format("Dropship [x=%s, y=%s]", x, y);
	}
}
