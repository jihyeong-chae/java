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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("------------------------------------------- ");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				//�ۼ���ġ			
				System.out.println("�л� ��>");
				studentNum = scanner.nextInt();
			} else if(selectNo == 2) {
				//�ۼ���ġ
				scores = new int [studentNum];
				for (int i = 0; i <studentNum; i ++) {
					System.out.println("scores["+i+"]> ");
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3) {
				//�ۼ���ġ
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" +i+ "]>" + scores[i]);
				}
			} else if(selectNo == 4) {
				//�ۼ���ġ
				int max = scores[0];
				double sum = 0;
				for(int i = 0; i < scores.length; i++) {
					if(scores[0] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("�ְ����� : " +max);
				System.out.println("������� : " +(sum/scores.length));
			} else if(selectNo == 5) {
				//�ۼ���ġ
				run = false; //=break;
			}
			
		}
		System.out.println("���α׷� ����");
	}

}
