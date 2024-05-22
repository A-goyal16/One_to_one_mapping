package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrimeMinister
{
	@Id
	int pid;
	String name;
	int age;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
