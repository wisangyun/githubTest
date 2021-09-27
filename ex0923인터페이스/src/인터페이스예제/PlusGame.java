package 인터페이스예제;

import java.util.Random;

public class PlusGame implements IGame {

	// 필드
	private Random ran;
	private int num1;
	private int num2;

	@Override
	public void makeRandom() {
		// 난수를 생성하는 기능
		ran = new Random();
		num1 = ran.nextInt(9)+1;
		num2 = ran.nextInt(9)+1;
	}


	@Override
	public String getQuizMsg() {
		// 생성한 난수를 문자열 형태로 되돌려주기
		// 난수1+난수2 =
		String result = num1 +"+"+num2+"=";
		return result;
	}

	@Override
	public boolean checkAnswer(int answer) {
		// 매개변수로 받아온 숫자와 실제 난수1+난수2 일치
		// 정답체크하는 기능

		return num1+num2 == answer;//비교연산자는 결과값으로 boolean 되돌려준다.
	}

	// 알고리즘 담당자

}

