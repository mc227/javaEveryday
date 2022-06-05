import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Sample {
    private final Logger logger = LoggerFactory.getLogger(Sample.class);
    public void abc() {
        logger.debug("I am a debug message");
        logger.info("I am an info message");
        logger.error("I am an error message");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.abc();
    }
}
