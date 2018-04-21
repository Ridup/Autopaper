package ncu.study.autopaper.model;

import java.util.Date;

public class User extends UserKey {
    private String userEmail;

    private String userName;

    private String nickName;

    private Integer userSex;

    private Integer userAge;

    private String userType;

    private String userPassword;

    private Date registerTime;

    private String userIcon;

    private Date modifyTime;

    public User(Integer userId, String userPhone, String userEmail, String userName, String nickName, Integer userSex, Integer userAge, String userType, String userPassword, Date registerTime, String userIcon, Date modifyTime) {
        super(userId, userPhone);
        this.userEmail = userEmail;
        this.userName = userName;
        this.nickName = nickName;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userType = userType;
        this.userPassword = userPassword;
        this.registerTime = registerTime;
        this.userIcon = userIcon;
        this.modifyTime = modifyTime;
    }

    public User() {
        super();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon == null ? null : userIcon.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}