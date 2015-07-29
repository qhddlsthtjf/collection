package util.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService {
	Map<String, Member> map = new HashMap<String, Member>();
	Member m = new Member();
	@Override
	
	public void create(String id,Member member) {
		
		map.put(id, member);
	}

	@Override
	public String login(String id1,String pass1) {
		String msg = "";
			
			String loginid = map.get("id").getId();
			String loginpass = map.get("pass").getPass();
			if (id1.equals(loginid) && pass1.equals(loginpass) ) {
				msg = id1+"님 로그인 되셨습니다."; 
				 
			}else{
				msg = "잘못된 아이디 이거나 비밀번호 입니다.";
			}
			
		
		return msg;
	}
	
}
