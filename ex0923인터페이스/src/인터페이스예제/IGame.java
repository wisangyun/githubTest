package 인터페이스예제;

public interface IGame {

	//작업 설계도
	//랜덤한 수를 생성하는 기능
	public void makeRandom();
	
	// 퀴즈를 생성하는 기능
	public String getQuizMsg();
	
	
	//정답 체크
	public boolean checkAnswer(int answer);

	
}
