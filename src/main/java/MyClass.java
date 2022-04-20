//public class MyClass {
//    private String name1 = "Ally";
//    private String name2 = "Lena";
//    public void swap()
//    {
//        String s = name1;
//        name1 = name2;
//        name2 = s;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

//public class MyClass
//{
//    private String name1 = "Ally";
//    private String name2 = "Lena";
//
//    public void swap()
//    {
//        synchronized (this)
//        {
//            String s = name1;
//            name1 = name2;
//            name2 = s;
//        }
//    }
//
//    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        myClass.swap();
//        System.out.printf("name1: %s",myClass.name1);
//        System.out.println();
//        System.out.printf("name2: %s",myClass.name2);
//    }
//}

class MyClass
{
    private String name1 = "Ally";
    private String name2 = "Lena";

    public void swap()
    {
        synchronized (this)
        {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }

    public void swap2()
    {
        synchronized (this)
        {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }
}