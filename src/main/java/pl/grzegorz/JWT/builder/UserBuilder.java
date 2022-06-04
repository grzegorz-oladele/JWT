package pl.grzegorz.JWT.builder;

import pl.grzegorz.JWT.model.User;

public class UserBuilder {

    private String name;
    private String username;
    private String password;
    private String email;

    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }
    
    public UserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        return user;
    }
}
