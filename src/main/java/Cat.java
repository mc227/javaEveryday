import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cat {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        logger.info("inside setName function");
        this.name = name;
    }

    public static void printName(Cat cat) {
        System.out.println(cat.getName());
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Oscar");
        printName(cat);
    }


}