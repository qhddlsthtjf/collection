package util.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KimYunA {
	public static void main(String[] args) {
		/*
		 Map 은 인터페이스 HashMap은 Map을 구현 (implements)한 클래스 
		 * */
		Map<String,Integer> map = new HashMap<String,Integer>(); 
		//키값이 스트링이고, 밸류가 숫자인 해쉬맵 객체를 생성 
		//List 계열은 추가할때 add
		//Map 계열은 추가가 put
		map.put("김연아", new Integer(98)); //int 타입은 맵에 들어올 수 없다.()안에 new Integer(98)<<는 Integer i = new Integer(98);이거를 준거랑같은거
		map.put("아사다마오", new Integer(60));
		map.put("소트니코바", new Integer(30));
		
		/*
		 디자인 패턴 23가지 중에서 Iterator 패턴을 사용해서 맵의 값을 출력합니다.
		 * */
		//지금까지는 객체를 생성하라고 하면 Set set = new Set();으로 만들었는데
		//Set , Iterator 는 이처럼 생성(생성자를 통한 생성)하지 않고,
		//다른 객체를 통해 리턴받는 방식으로 생성을 하고 
		//이를 팩토리 패턴이라고 한다.
		/*
		 1.키와 밸류를 동시에 출력 
		 * */
		
		Set set = map.entrySet();
		//Iterator는 순환기 라는 의미 =>지하철2호선 
		Iterator it = set.iterator();
		//it.hasNext() 은 밸류(값)가 커서 (이터레이터)다음에 있는지 없는지를 따저서 있으면
		//while 룹을 계속 돌리고 없으면 스톱한다.
		/*
		 1.키와 밸류를 동시에 출력 
		 * */
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("참가자 :" + e.getKey() + ", 점수" + e.getValue());
			
		}
		
		//키만(<K,V>)출력하는 경우 
		set = map.keySet();
		System.out.println("참가자 명단" + set);
		//set 은 toString()이 내부적으로 오버라이딩 되어 있다.
		//따라서 set.toString()하지 않아도 출력 
		//밸류만(<K,V>)출력하는 경우
		Collection values = map.values();
		Iterator it2 = values.iterator();
		int total = 0; //지변이니까 디폴트 값으로 초기화
		while (it2.hasNext()) {
			//맵 내부에서는 int 가 기본형이라 올수 없고 
			//반드시 Integer(=기본형 int 의 Wrapper래퍼 클래스 ) 타입으로 와야한다.
			Integer i = (Integer) it2.next();
			total += i.intValue();//각 선수들의 점수 합계
			
			
		}
		System.out.println("이번 대회 평균점수 :" + total/set.size());
		System.out.println("최고점수 :" + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
		//위쪽에 있는 Collection은 인터페이스 아래쪽에(바로위에있음) 있는 Collections는 클래스 
		//클래스.메소드() 이런 형태로 나오면 이 메소드는 클래스메소드라고 부르고 다른 말로는 static method라고 부른다.
	}
}
