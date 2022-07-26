public class MyClass implements Interface2{
    private Interface1 object;

    public MyClass(Interface1 object) {
        this.object = object;
    }
    // This is where we put the Interface2 methods
    // that call Interface1 methods
}