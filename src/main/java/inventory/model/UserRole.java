package inventory.model;
// Generated Jul 18, 2022, 11:57:22 PM by Hibernate Tools 5.6.7.Final

import java.util.Date;

/**
 * UserRole generated by hbm2java
 */
public class UserRole implements java.io.Serializable {

	private Integer id;
	private Role role;
	private Users users;
	private int activeFlag;
	private Date createDate;
	private Date updateDate;

	public UserRole() {
	} 

	public UserRole(Role role, Users users, int activeFlag, Date createDate, Date updateDate) {
		this.role = role;
		this.users = users;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
