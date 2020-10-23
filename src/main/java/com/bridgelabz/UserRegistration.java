package com.bridgelabz;

public class UserRegistration {
    private static final String NAME ="^[A-Z][a-z]{2,}$";
    private static final String EMAIL = "^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    private static final String PHONE = "^[0-9]{2}[0-9]{10}";
    private static final String PASSWORD = "(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,40}";

    public boolean validateFirstName(String firstName){
        return firstName.matches(NAME);
    }
    public boolean validateLastName(String lastName){
        return lastName.matches(NAME);
    }
    public boolean validateEmail(String email){
        return email.matches(EMAIL);
    }
    public boolean validatePhone(String phone){
        return phone.matches(PHONE);
    }
    public boolean validatePassword(String password){
        return password.matches(PASSWORD);
    }
}
