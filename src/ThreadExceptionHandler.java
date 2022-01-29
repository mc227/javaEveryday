public class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
    private String handlerId;

    public ThreadExceptionHandler(String handlerId) {
        this.handlerId = handlerId;
    }

    public ThreadExceptionHandler(){}

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "@" + this.hashCode() +
                (handlerId == null || "".equals(handlerId) ? "" :
                        "(\"" + handlerId + "\")");
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(this + " caught Exception in Thread - \"" +
                t.getName() + "\" => " + e);
    }
}
