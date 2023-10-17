package dbeducation;

import java.sql.Date;

public class DataBassBoard {

	private String USER_ID;
	private String USER_PASSWORD;
	private String USER_NAME;
	private String USER_AGE;
	private String USER_GENDER;
	private String USER_PHONENUMBER;
	private Date CREATE_DATE;
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_PASSWORD() {
		return USER_PASSWORD;
	}
	public void setUSER_PASSWORD(String uSER_PASSWORD) {
		USER_PASSWORD = uSER_PASSWORD;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_AGE() {
		return USER_AGE;
	}
	public void setUSER_AGE(String uSER_AGE) {
		USER_AGE = uSER_AGE;
	}
	public String getUSER_GENDER() {
		return USER_GENDER;
	}
	public void setUSER_GENDER(String uSER_GENDER) {
		USER_GENDER = uSER_GENDER;
	}
	public String getUSER_PHONENUMBER() {
		return USER_PHONENUMBER;
	}
	public void setUSER_PHONENUMBER(String uSER_PHONENUMBER) {
		USER_PHONENUMBER = uSER_PHONENUMBER;
	}
	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(Date date) {
		CREATE_DATE = date;
	}

}
