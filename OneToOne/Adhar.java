package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	private int id;
	private String adharnum;
	private String address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdharnum() {
		return adharnum;
	}
	public void setAdharnum(String adharnum) {
		this.adharnum = adharnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
