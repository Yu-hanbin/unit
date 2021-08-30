package kr.or.yi.java_study02ch12.problems;

class Marine extends Unit { // 보병
	int x, y; // 현재 위치

	void move(int x, int y) {
		System.out.printf("Marine이 지정된 위치(%s, %s)로 이동합니다.", x, y);
	}

	public void stop() {
		System.out.println("Marine이 현재 위치에 멈춥니다.");
	}

	void stimPack() {
		System.out.println("Marine이 스팀팩을 사용합니다.");
	}

	@Override
	public void move() {

	}
	

	@Override
	public String toString() {
		return String.format("Marine [x=%s, y=%s]", x, y);
	}

}