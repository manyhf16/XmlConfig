package zpark.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {

    private String username;

    private String password;

    private int type; // 1表示管理员，0 表示普通用户

    private String realname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=******" + ", type=" + type + ", realname=" + realname + "]";
    }
}
