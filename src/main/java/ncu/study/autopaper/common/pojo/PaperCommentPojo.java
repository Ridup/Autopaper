package ncu.study.autopaper.common.pojo;

import ncu.study.autopaper.model.PaperComment;

import java.util.Date;

/**
 * @author Ridup
 * @version FleName:  PaperCommentPojo .java  v0.1  2018/5/25 13:44 Exp $
 */
public class PaperCommentPojo extends PaperComment {
    private String paperCommentTimeStr;
    private String userEmail;

    private String userName;

    private String nickName;

    private Integer userSex;

    private Integer userAge;

    private String userType;

    private String getUserTypeStr;

    private String userPassword;

    private Date registerTime;

    private String userIcon;

    private Date modifyTime;

    public String getPaperCommentTimeStr() {
        return paperCommentTimeStr;
    }

    public void setPaperCommentTimeStr(String paperCommentTimeStr) {
        this.paperCommentTimeStr = paperCommentTimeStr;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
        this.userType = userType;
    }

    public String getGetUserTypeStr() {
        return getUserTypeStr;
    }

    public void setGetUserTypeStr(String getUserTypeStr) {
        this.getUserTypeStr = getUserTypeStr;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
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
        this.userIcon = userIcon;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
