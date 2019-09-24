package com.furnish.domain.security;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.furnish.domain.User;

@Entity
public class PasswordResetToken {
	
	private static final int EXPIRATION= 60*24;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String Token;
	
	@OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable=false,name="user_id")
	private User user;
	
	private Date expiryDate;
	
public PasswordResetToken(){}
	
	public PasswordResetToken(final String token, final User user) {
		super ();
		
		this.Token = token;
		this.user = user;
		this.expiryDate = calculateExpiryDate(EXPIRATION);
	}
	
	private Date calculateExpiryDate (final int expiryTimeInMinutes) {
		final Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(new Date().getTime());
		cal.add(Calendar.MINUTE, expiryTimeInMinutes);
		return new Date(cal.getTime().getTime());
	}
	
	public void updateToken(final String token) {
		this.Token = token;
		this.expiryDate = calculateExpiryDate(EXPIRATION);
	}
}
