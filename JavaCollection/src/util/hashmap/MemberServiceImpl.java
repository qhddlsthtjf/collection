package util.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MemberServiceImpl implements MemberService {
	Map<String, Member> map = new HashMap<String, Member>();
	Member m = new Member();
	@Override
	
	public void create(String id,Member member) {
		
		map.put(id, member);
		
	}

	@Override
	public String login(String id1,String pass1) {
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
	        System.out.println("ID :" + e.getKey() + ", 회원객체" + e.getValue());
	/*		
		}
		String msg = "";
			
			String loginid = map.get("id").getId();
			String loginpass = map.get("pass").getPass();
			if (id1.equals(loginid) && pass1.equals(loginpass) ) {
				msg = id1+"님 로그인 되셨습니다."; 
				 
			}else{
				msg = "잘못된 아이디 이거나 비밀번호 입니다.";
			}*/
			
		
		return  
	}
	
}
