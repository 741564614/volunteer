package dao.madel;

public class User {
	private String account;
	private String password;
	private String major;
	private String name;
	private String QQ;
	private String tel;
	private String email;
	private String identity;
	private int hours;
	public void setpassword(String password) {
		this.password=password;
	}
	public void setaccount(String account) {
		this.account=account;
	}
	public void setmajor(String major) {
		this.major=major;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setQQ(String QQ) {
		this.QQ=QQ;
	}
	public void settel(String tel) {
		this.tel=tel;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public void setidentity(String identity) {
		this.identity=identity;
	}
	public String getpassword() {
		return password;
	}
	public String getaccount() {
		return account;
	}
	public String getmajor() {
		return major;
	}
	public String getname() {
		return name;
	}
	public String getQQ(){
		
		return QQ;
	}
	public String gettel() {
		return tel;
	}
	public String getemail() {
		return email;
	}
	public String getidentity() {
		return identity;
	}
	public int gethours() {
		return hours;
	}
	public void sethours(int hours) {
		this.hours=hours;
	}
	
}
