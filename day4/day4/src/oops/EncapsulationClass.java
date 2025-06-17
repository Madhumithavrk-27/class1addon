package oops;
import java.util.Date;
public class EncapsulationClass {
	String email;
	String username;
	long mobile;
	Date age;
	char gender;
	boolean graduate;
	
	//setter
		public void setEmail(String email) {
		this.email=email;
		}
		public void setUsername(String username) {
			this.username=username;
		}
		public void setMobile(Long Mobile) {
			this.mobile=mobile;
		}
		public void setAge(Date Age) {
			this.age=age;
		}
		public void setGender(char Gender) {
			this.gender=gender;
		}
		public void setgraduate(boolean Graduate) {
			this.graduate=graduate;
		}
	
	
	
	  //getter
	public String getEmail() {
		  return email;
	}
	public String  getUsername() {
		  return username;
	}
	public Long  getMobile() {
		  return mobile;
	}
	public Date getAge() {
		  return age;
	}
	public char getGender() {
		  return gender;
	}
	public boolean getgraduate() {
		  return graduate;
	}
	
	
	
	
}
