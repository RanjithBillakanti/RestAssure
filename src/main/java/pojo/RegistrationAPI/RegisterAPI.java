package pojo.RegistrationAPI;

public class RegisterAPI {

    private String nameEnglish;
    private String userName;
    private String email;
    private String password;
    private double mobileNumber;
    private double emiratesID;
    private String captchaResponse;

	public String getNameEnglish() {
		return this.nameEnglish;
	}

	public void setNameEnglish(String nameEnglish) {
		this.nameEnglish = nameEnglish;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getEmiratesID() {
		return this.emiratesID;
	}

	public void setEmiratesID(double emiratesID) {
		this.emiratesID = emiratesID;
	}

	public String getCaptchaResponse() {
		return this.captchaResponse;
	}

	public void setCaptchaResponse(String captchaResponse) {
		this.captchaResponse = captchaResponse;
	}

}