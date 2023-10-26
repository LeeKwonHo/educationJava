package numberbassball;

public class Main {

	public static void main(String[] args) {
		  System.out.println("숫자야구 게임을 시작합니다. 컴퓨터가 3자리 숫자를 생성했습니다.");
		  
	        BassBall game = new BassBall();

	        int attempts = 0;
	        while (true) {
	            int[] playerGuess = game.getPlayerGuess();
	            int[] result = game.calculateResult(playerGuess);
	            int strikes = result[0];
	            int balls = result[1];

	            System.out.println("스트라이크: " + strikes + ", 볼: " + balls);
	            
	            if (strikes == 3) {
	                System.out.println("축하합니다! 정답을 맞췄습니다!");
	                break;
	            }else if(strikes == 1) {
	            	System.out.println("까비~");
	            }else if(strikes == 2){
	            	System.out.println("까까비~");
	            }
	            
	            attempts++;
	            System.out.println( attempts + "회 시도");
	            if (attempts == 10) {
	                System.out.println("게임 종료. 시도 횟수를 모두 사용했습니다.");
	                break;
	            }
	        }
	    }

	}

