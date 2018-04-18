package com.company;
/*
*https://www.hackerrank.com/challenges/strong-password/problem
 */
public class StrongPassword {
    String password;
    public boolean isStrongPassword(String password){
        password=password.trim();
        if(password.matches(".*(((?=.*[A-Z]){1,})((?=.*[a-z]){1,})((?=.*[0-9]){1,})((?=.*[!@#$%^&*()-+]){1,})){6,}.*"))
            return true;
        else
            return false;
    }

}
