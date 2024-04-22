package cl.tchile.hexagonaltest.infraestructure.entities;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

import cl.tchile.hexagonaltest.domain.models.User;

@Entity
public class UserEntities implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private String age;
	
	
	public UserEntities(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public static UserEntities fromdDomainByModel(User us) {
		return new UserEntities(us.getId(), us.getName(), us.getAge());
	}
	
	
	public User toDomainModel() {
		return new User(id, name, age);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	

}
