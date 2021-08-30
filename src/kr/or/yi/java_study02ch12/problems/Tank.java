package kr.or.yi.java_study02ch12.problems;

class Tank extends Unit { // 탱크
	int x, y; // 현재 위치

	void move(int x, int y) {
		System.out.printf("Tank가 지정된 위치(%s, %s)로 이동합니다.", x, y);
	}

	void stop() {
		System.out.println("Tank가 현재 위치에 멈춥니다.");
	}

	void changeMode() {
		System.out.println("Tank가 공격모드로 전환합니다.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return String.format("Tank [x=%s, y=%s]", x, y);
	}

}