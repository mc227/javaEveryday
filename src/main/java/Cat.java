import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Cat {
    public String name;
    public int age;
    public int weight;

    public void save(PrintWriter writer) throws Exception {
        writer.println(name);
        writer.println(age);
        writer.println(weight);
        writer.flush();
    }

    public void load(BufferedReader reader) throws Exception {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        weight = Integer.parseInt(reader.readLine());
    }

    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        PrintWriter writer = new PrintWriter("cat.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        cat.load(reader);
        cat.save(writer);
    }
}