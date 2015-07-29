package util.hashmap;

public class Member {
	private String id ,pass , name , adr;
	private int   age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String id ,String pass ,String name , int age , String adr) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.age = age;
		this.adr = adr;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAdr() {
		return adr;
	}

	public String getPass() {
		return pass;
	}

	public int getAge() {
		return age;
	}

	
}
