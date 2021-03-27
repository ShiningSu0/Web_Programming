package kr.or.connect.jdbcexam.dto;

public class Role {
	private String Name;
	private String HeadOfState;

	public Role() {

	}

	public Role(String Name, String HeadOfState) {
		super();
		this.Name = Name;
		this.HeadOfState = HeadOfState;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getHeadOfState() {
		return HeadOfState;
	}

	public void setHeadOfState(String HeadOfState) {
		this.HeadOfState = HeadOfState;
	}

	@Override
	public String toString() {
		return " [Name=" + Name + ", HeadOfState=" + HeadOfState + "]";
	}
}