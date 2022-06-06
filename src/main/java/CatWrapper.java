public class CatWrapper extends Cat {
    // 1) Create our own wrapper class and inherit from the same class/interface as the object to be wrapped.
/*
* */
    private Cat original;

    public CatWrapper(Cat cat) {
        // 2) Pass the object to be wrapped to our class's constructor.
        super(cat.getName());
        this.original = cat;
    }

    @Override
    // 3) Override all methods in our new class. Invoke the wrapped object's methods inside each of the overridden methods.
    public String getName() {
        // 4) Make whatever changes you want: change what the method calls do, change their parameters, and/or do something else.
        return "A cat named " + original.getName();
    }

    @Override
    public void setName(String name) {
        original.setName(name);
    }

    public static void printName(Cat named) {
        System.out.println(named.getName());
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Oscar");
        Cat catWrap = new CatWrapper(cat);
        printName(catWrap);
    }
}