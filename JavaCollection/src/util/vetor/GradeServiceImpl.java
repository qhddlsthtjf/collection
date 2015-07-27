package util.vetor;

import java.util.Vector;
/*
 프로그램을 코딩하다 보면 자료구조를 다루는 데 있어서
 CRUD 액션의 반복을 경험하게 됩니다.
 Create : 입력,생산
 Read :출력, 조회
 Update : 수정 ->저장된 값을 수정 DB
 Delete : 삭제 -> 완전삭제 DB, null값으로 바꾸는 삭제가 있다
 * */
public class GradeServiceImpl implements GradeService{
	//필드에 아래 메소드들이 공유할 자료구조를 뭘 쓸까 고민해야한다.
	//1.ArrayList 2.Vector 3.Stack 4.HashMap
	//순서가 있어야하고 , 중복도 있어야하고
	private Vector<Grade> vec = new Vector<Grade>();
	Grade grade = new Grade();//디폴트 생성자가 있어서 에러 제거 
	@Override
	public void input(Grade grade) {
		//성적표 입력 
		//만약 자료구조로 배열을 사용했다면 vec[0] = hong;
		vec.add(grade);
	}

	@Override
	public void printList() {
		//전체 출력
		System.out.println(vec.toString());
	}

	@Override
	public String searchGradeByHakbun(String hakbun) {
		//학번으로 검색
		String msg ="";
		Grade grade = null;//지변으로 인스턴스를 선언했기때문에 초기화 해야함.
		for (int i = 0; i < vec.size(); i++) {
			//만약  vec 가 배열이라면 vec.get(i)	
			//객체.메소드.메소드.메소드.메소드 이런
			//패턴은 반드시  return 값이 있는 메소드들 끼리 연결시에만 가능하다.
			//이런 방식을 메소드 체인이라고 한다.
			String searchHakbun = vec.elementAt(i).getHakbun();
			if (hakbun.equalsIgnoreCase(searchHakbun)) {
				String name = vec.elementAt(i).getName();
				int kor = vec.elementAt(i).getKor();
				int eng = vec.elementAt(i).getEng();
				int math = vec.elementAt(i).getMath();
				grade = new Grade(searchHakbun,name,kor,eng,math);
				msg = grade.toString();
				break;//중간에 
			} else {
				msg= "조회 하는 학번이 없습니다.";
			}
			
		}
		return msg;
	}

	@Override
	public void ascGradeTotal() {
		//성적 정렬
		
	}

}
