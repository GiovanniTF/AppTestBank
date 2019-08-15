package br.com.giovanni.testebank.Interactor;

public class LoginControlValidation {
    public String getUser;
    public String getPassword;

    public LoginControlValidation (String getUser, String getPassword){
        this.getUser = getUser;
        this.getPassword = getPassword;
    }

    public boolean loginControlValidation (){
        UserControl userControl = new UserControl(getUser);
        PasswordControl passwordControl = new PasswordControl(getPassword);
        if (userControl.emailValidation() && passwordControl.PATTERN_FULL()){

            return true;
        } else {
            return false;
        }
    }

}
