package util.hashmap;

public interface MemberService {
	public void create(String id,Member member);
	
	public String login(String id , String pass);
}
