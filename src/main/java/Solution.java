import java.util.Optional;

public class Solution {
    public static void main(String[] args) {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt);
    }
    public String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }
}
