import java.util.Arrays;
import java.util.Scanner;

/*다음주 배울거 : 더블 반복문 + 조건, 선택문, 배열(무조건 반복문 씀),public static void 쓰는 이유, 닌자..?*/

/*
 * 공부 난이도를 표현한 2차원 배열이 주어진다. (난이도는 1 ~ 10)
 * 이 배열을 편집해서 결과를 출력할 것이다.
 * 
 * 1. 각 공부분야에 대해 모두 입력을 따로 받는다.
 * 2. 공부분야의 난이도의 편집 모드를 먼저 입력받는다. (1:편집, 2:1으로초기화, 3:10으로초기화) -> switch
 * 3. 1을 받은 경우에는 난이도를 몇 점으로 입력받을 것인지 한번 더 입력받는다.
 * 4. 만약에 1~10 이상의 난이도를 입력한 경우 다시 입력받는다.
 */
public class JaeseokProblem {
	public static void main (String[] args) {
		String[][] studyLevels = {
				{"자바", "스프링", "데이터베이스", "알고리즘"},
				{"5", "5", "5", "5"}
		};
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < studyLevels[0].length; i++) {
			System.out.println(studyLevels[0][i] + "의 난이도 편집모드를 선택해주세요.");
			System.out.println("(1:편집, 2:1으로초기화, 3:10으로초기화)");
			int mode = scanner.nextInt();
			
			switch (mode) {
			case 1:
				while (true) {
					System.out.println("편집할 난이도를 입력해주세요.(1~10) >");
					String level = scanner.next();
					
					if (Integer.parseInt(level) > 10) {
						System.out.println("1~10 사이의 숫자로 입력해주세요");
					}
					else {
						studyLevels[1][i] = level;
						break;
					}
				}
				break;
			case 2:
				studyLevels[1][i] = "1";
				break;
			case 3:
				studyLevels[1][i] = "10";
				break;
			}
		}
		
		System.out.println("공부난이도 편집이 끝났습니다!");
		System.out.println("===== 결과 =====");
		System.out.println(Arrays.toString(studyLevels[0]));
		System.out.println(Arrays.toString(studyLevels[1]));

	    scanner.close();
	}
}
