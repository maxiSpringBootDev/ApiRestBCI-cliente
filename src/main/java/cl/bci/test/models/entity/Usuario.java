package cl.bci.test.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 60)
	private String name;
	
	@Column(length = 60,unique = true)
	private String email;
	
	@Column(length = 60)
	private String password;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "created")
	private Date created;
	
	@PrePersist
	public void prePersistCreated() {
		created = new Date();
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "modified")
	private Date modified;
	
	@PrePersist
	public void prePersistModified() {
		modified = new Date();
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "last_login")
	private Date last_login;
	
	@PrePersist
	public void prePersisLastLogin() {
		last_login = new Date();
	}
	
	@Column(length = 150)
	private String token;
	
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getIsactive() {
		return isactive;
	}

	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}

	@Column(length = 1)
	private int isactive;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name = "user_id")
	private List<Telefonos> telefonos;	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Telefonos> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefonos> telefonos) {
		this.telefonos = telefonos;
	}
	
	
}
