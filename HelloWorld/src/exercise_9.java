import java.util.Scanner;

public class exercise_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------- ");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------- ");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				//작성위치			
				System.out.println("학생 수>");
				studentNum = scanner.nextInt();
			} else if(selectNo == 2) {
				//작성위치
				scores = new int [studentNum];
				for (int i = 0; i <studentNum; i ++) {
					System.out.println("scores["+i+"]> ");
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3) {
				//작성위치
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" +i+ "]>" + scores[i]);
				}
			} else if(selectNo == 4) {
				//작성위치
				int max = scores[0];
				double sum = 0;
				for(int i = 0; i < scores.length; i++) {
					if(scores[0] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고점수 : " +max);
				System.out.println("평균점수 : " +(sum/scores.length));
			} else if(selectNo == 5) {
				//작성위치
				run = false; //=break;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
