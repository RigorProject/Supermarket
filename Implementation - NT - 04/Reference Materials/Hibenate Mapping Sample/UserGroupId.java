package net.codejava.hibernate;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class UserGroupId implements Serializable {	
	private User user;
	private Group group;

	@ManyToOne(cascade = CascadeType.ALL)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}
