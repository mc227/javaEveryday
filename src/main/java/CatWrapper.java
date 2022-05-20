public class CatWrapper extends Cat
{
    private Cat original;
    public CatWrapper (Cat cat)
    {
        super(cat.getName());
        this.original = cat;
    }

    public String getName()
    {
        return "A cat named " + original.getName();
    }

    public void setName(String name)
    {
        original.setName(name);
    }

    public static void main(String[] args)
    {
        Cat cat = new Cat("Oscar");
        Cat catWrap = new CatWrapper (cat);
        printName(catWrap);
    }

    public static void printName(Cat named)
    {
        System.out.println(named.getName());
    }
}