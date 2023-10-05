package exceptionedu;

public class Starbucks {

	int coffe;

	public Starbucks(int coffe) {
		this.coffe = coffe;
	}

	// 스타벅스가 커피를 가지고 손님이 올떄마다 하나씩 판매하다 200잔이 넘어가면 예외메세지를 넘긴다
	void sellCoffe(int guest) throws CoffeSoldOutException {

		for (int i = 0; i < guest; i++) {
			System.out.println("커피를 판매했습니다. 총 판매수량:" + i);

			if (i >= coffe) {
				throw new CoffeSoldOutException("커피가 매진 되었습니다.");
			}
		}

	}

}
