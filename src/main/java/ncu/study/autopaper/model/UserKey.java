package ncu.study.autopaper.model;

public class UserKey {
    private Integer userId;

    private String userPhone;

    public UserKey(Integer userId, String userPhone) {
        this.userId = userId;
        this.userPhone = userPhone;
    }

    public UserKey() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }
}