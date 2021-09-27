package 인터페이스예제;

import java.util.Scanner;

public class ArithmeticGameMain {
	// 게임 횟수 체크
	// 정답기회 횟수 체크
	// 사용자로부터 값 입력
	// 메시지 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// GameDummy p1 = new GameDummy();
		PlusGame p1 = new PlusGame();

		int count = 0;
		int chance = 3;
		p1.makeRandom();
		while (true) {
			// 5번의 게임
			if (count == 5) {
				System.out.println("게임 종료!");
				break;
			}

			// 퀴즈 생성 후 입력
			System.out.print(p1.getQuizMsg());

			int num = sc.nextInt();

			// 정답체크 -> 정답이면 다시 랜덤 값 받기
			if (p1.checkAnswer(num) == true) {
				System.out.println("정답입니다.\n");
				chance = 3;
				count++;
				p1.makeRandom();
			}
			// 오답이면 랜덤 값을 다시 안받음.
			else if (p1.checkAnswer(num) == false) {
				chance--;
				if (chance == 0) {
					System.out.println("기회 끝\n");
					p1.makeRandom();
					count++;
					chance = 3;
				} else {
					System.out.println("오답입니다.\n");
					System.out.println("남은 기회 : " + chance);
				}
			}
			
		}
		System.out.println("정답갯수"+count+"개입니다.");
	}
}
