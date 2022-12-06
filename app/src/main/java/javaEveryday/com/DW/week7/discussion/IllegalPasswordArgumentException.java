package javaEveryday.com.DW.week7.discussion;

public class IllegalPasswordArgumentException extends IllegalArgumentException{
    private String msg;

    public IllegalPasswordArgumentException(String password) {
        if(password == null) {
            msg = "Password cannot be null";
        } else if(password.isBlank()) {
            msg = "Password cannot be blank";
        } else if(password.isEmpty()){
            msg = "Password cannot be empty";
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + msg;
    }
}
