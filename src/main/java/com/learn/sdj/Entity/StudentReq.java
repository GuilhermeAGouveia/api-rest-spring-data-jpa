package com.learn.sdj.Entity;

//A classe Student espera receber o atributo birthday como um elemento do tipo LocalDate, mas
// como a requisição JSON que chega traz em seu RequestBody um elemento brthday do tipo String, foi necessário
// criar essa classe intermediária para atender a requisição e depois convertê-la numa classe Student

public class StudentReq {

    private String firstName;

    private String lastName;

    private String email;

    private String birthday;


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public StudentReq(String firstName, String lastName, String email, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
    }

    public StudentReq(){}

}
