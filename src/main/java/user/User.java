package user;

public class User {
	private int ID;
	private String name;
	private String mobile;
	private String password;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		if ("admin".equals(name) && "123456".equals(password)) {  
            return "success";  
        } else {  
            return "login";  
        }  
		


	}
}
