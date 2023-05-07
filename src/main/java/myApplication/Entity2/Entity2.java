package myApplication.Entity2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import myApplication.Entity.EntityClass;

@Entity
@Table(name = "Entity2")
public class Entity2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id2;
	private String name2;
	private String email;
	
	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private EntityClass entityClass;

	public EntityClass getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(EntityClass entityClass) {
		this.entityClass = entityClass;
	}
	
	
}

