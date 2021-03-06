package util.vector;

import java.util.Scanner;

public class GradeController {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		//개발과정에서 테스트를 위한 임시값 : 더미값(dumy)
		Grade hong = new Grade("1301","홍길동",100,100,100);
		Grade kim = new Grade("1302","김유신",50,50,50);
		Grade lee = new Grade("1303","이순신",30,30,30);
		
		service.input(hong);//Grade 타입의 인스턴스(객체)인 hong 이 서비스 인터페이스를 구현한 서비스임플 클래스의 input()메소드에 할당된다.
		service.input(kim);
		service.input(lee);
		//전체 학생 성적표를 출력
		
		//지시값을 전달할 스캐너
		Scanner scanner = new Scanner(System.in);
		int input =0, key=0;
		//무한루프 엔진
		while (true) {
			/*메뉴판*/
			System.out.println("1.성적입력 2.성적조회(학번) 3.성적조회(이름) 4.전체성적 5.성적순 6.이름순 0.종료");
			input = scanner.nextInt();
			//입력갑스 체크(밸류데이션)
			key = inputCheck(input, 0, 6);
			if (input != 0) {
				switch (key) {
				case 1: //성적입력
					System.out.println("학번입력");
					String hakbun = scanner.next();
					System.out.println("이름입력");
					String name = scanner.next();
					System.out.println("국어점수입력");
					int kor = scanner.nextInt();
					System.out.println("영어점수입력");
					int eng = scanner.nextInt();
					System.out.println("수학점수입력");
					int math = scanner.nextInt();
					
					Grade grade = new Grade(hakbun, name, kor, eng, math);
					service.input(grade);
					break;
				case 2: //성적조회(학번)
					System.out.println("학번입력");
					
					System.out.println(service.searchGradeByHakbun(scanner.next()));
					break;
				case 3: //성적조회(이름)
					System.out.println("이름입력");
					System.out.println(service.SearchGradeByName(scanner.next())); 
					break;
				case 4: //전체성적
					service.printList();
					break;
				case 5: //성적순
					service.descByTotal();
					break;
				case 6: //이름순
					service.ascByName();
					break;
				default: System.out.println("에러 발생"); break;
				}
				
			} else {
				System.out.println("시스템 종료");
				break;
			}
		}
	}
	private static int inputCheck(int input, int i, int j) {
		if (input < i || input > j) {
			System.out.println("선택메뉴에서 범위값 외의 수를 입력했습니다.");
			return 0;//시스템 종료를 뜻한다... 리턴타입의 디폴트값을 리턴했기 때문
		} else {
			return input;
		}
}
}
/*
 인터페이스를 구현한 객체 와 스캐너 와 인풋변수 장착이 필요하다
 
 while(true){
 	if(input != 0){
 	
 	}else{
 	
 	}
 }
 * */
 