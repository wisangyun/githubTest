package �������̽�����;

import java.util.Scanner;

public class ArithmeticGameMain {
	// ���� Ƚ�� üũ
	// �����ȸ Ƚ�� üũ
	// ����ڷκ��� �� �Է�
	// �޽��� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// GameDummy p1 = new GameDummy();
		PlusGame p1 = new PlusGame();

		int count = 0;
		int chance = 3;
		p1.makeRandom();
		while (true) {
			// 5���� ����
			if (count == 5) {
				System.out.println("���� ����!");
				break;
			}

			// ���� ���� �� �Է�
			System.out.print(p1.getQuizMsg());

			int num = sc.nextInt();

			// ����üũ -> �����̸� �ٽ� ���� �� �ޱ�
			if (p1.checkAnswer(num) == true) {
				System.out.println("�����Դϴ�.\n");
				chance = 3;
				count++;
				p1.makeRandom();
			}
			// �����̸� ���� ���� �ٽ� �ȹ���.
			else if (p1.checkAnswer(num) == false) {
				chance--;
				if (chance == 0) {
					System.out.println("��ȸ ��\n");
					p1.makeRandom();
					count++;
					chance = 3;
				} else {
					System.out.println("�����Դϴ�.\n");
					System.out.println("���� ��ȸ : " + chance);
				}
			}
			
		}
		System.out.println("���䰹��"+count+"���Դϴ�.");
	}
}
