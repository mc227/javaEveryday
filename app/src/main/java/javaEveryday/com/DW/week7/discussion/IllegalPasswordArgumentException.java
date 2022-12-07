package javaEveryday.com.DW.week7.discussion;

/**
 * This user defined exception is very similar to the custom defined
 * IllegalPetNameArgumentException shown in this week's exercise
 */
public class IllegalPasswordArgumentException extends IllegalArgumentException{
    private String msg;

    public IllegalPasswordArgumentException(String password) {
        if(password == null) {
            msg = "Password cannot be null";
        }
//        else if(password.isBlank()) {
//            msg = "Password cannot be blank";
//        } else if(password.isEmpty()){
//            msg = "Password cannot be empty";
//        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + msg;
    }
}
