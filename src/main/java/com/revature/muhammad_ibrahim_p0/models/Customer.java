package com.revature.muhammad_ibrahim_p0.models;
/**
 * 5/5/21
 * This POJO is for creating what the user of this application would look like.
 * In the class, we declare private fields that have items of the HumanUsers.
 * We create two constructors, one empty, one with the declared fields.
 * We use getters and setters to access the private fields of the HumanUsers object.
 * Just an encapsulation of fields
 */
public class Customer {

    private int id;
    private String username;
    private String password;
    private String email;
    private String first_name;
    private String last_name;
    private String phone_number;

    public Customer(){

    }

    public Customer(String username, String password, String email,
                    String first_name, String last_name, String phone_number){
        System.out.println("HumanUsers");
        this.username = username;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    // allows to pass newuser into dao for register screen
    public String toFileString(){
        return String.format("%s;%s;%s;%s;%s;%s", username,password,email,first_name,last_name,phone_number);
    }

    // allows to pass existing user into dao from login screen check
    public String toFile(){
        return String.format("%s;%s",username,password);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HumanUsers{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", first_name='").append(first_name).append('\'');
        sb.append(", last_name='").append(last_name).append('\'');
        sb.append(", phone_number='").append(phone_number).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /*   @Override
    public String toString() {
        return "HumanUsers{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }*/
}
