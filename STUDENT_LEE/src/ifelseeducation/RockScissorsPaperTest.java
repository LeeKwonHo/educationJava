package ifelseeducation;

public class RockScissorsPaperTest {

	public static void main(String[] args) {
		RockScissorsPaperInfo rsp = new RockScissorsPaperInfo();

		System.out.println("가위 바위 보");

		rsp.setUserNumber();
		rsp.printNumber();
		rsp.resultGame();

	}

}
