package main.model.users;

public class ActorUser {
    private String username;
    private String password;

    public ActorUser(String usr, String password) {
        this.username = usr;
        this.password = password;
    }

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
}
