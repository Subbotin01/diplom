package model;

/**
 * Created by Павел on 04.03.2017.
 */
public class User {
    private String username;
    private String password;
    private String enabledUser;

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

    public String getEnabledUser() {
        return enabledUser;
    }

    public void setEnabledUser(String enabledUser) {
        this.enabledUser = enabledUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (enabledUser != null ? !enabledUser.equals(user.enabledUser) : user.enabledUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (enabledUser != null ? enabledUser.hashCode() : 0);
        return result;
    }
}
