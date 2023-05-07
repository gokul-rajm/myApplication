package myApplication.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import myApplication.Entity2.Entity2;

@Entity
@Table(name = "Application")
public class EntityClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;	
	private int mobileNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

//	@OneToOne(cascade = CascadeType.ALL)
//	private Entity2 entity2;
//
//	public Entity2 getEntity2() {
//		return entity2;
//	}
//	public void setEntity2(Entity2 entity2) {
//		this.entity2 = entity2;
//	}
	
	@OneToMany(targetEntity = Entity2.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "id",referencedColumnName = "id")
	public List<Entity2>entity2 = new ArrayList<>();

	public List<Entity2> getEntity2() {
		return entity2;
	}
	public void setEntity2(List<Entity2> entity2) {
		this.entity2 = entity2;
	}
	
	
	
}

