package br.sc.senac.urbanwood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private Long id;

	@Column(name="login_user")
	private String login;
	
	@Column(name="password_user")
	private String password;
	
	@OneToOne(mappedBy = "contact")
	private Contact contact;
	
	@OneToOne(mappedBy = "address")
	private Address address;
	
	@OneToOne(mappedBy = "image")
	private Image imagem;

}
