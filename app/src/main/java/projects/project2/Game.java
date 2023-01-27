package projects.project2;

public class Game {
    public static void main(String[] args) {
        // create three startups (cabista, poniez, hacqi)
        GameHelper helper = new GameHelper();
        StartUp first = new StartUp();
        StartUp second = new StartUp();
        StartUp third = new StartUp();
        first.setName("cabista");
        first.setLocation(helper.placeStartup(3));
        second.setName("poniez");
        second.setLocation(helper.placeStartup(3));
        third.setName("hacqi");
        third.setLocation(helper.placeStartup(3));
        System.out.println(first.getLocation());
        System.out.println(second.getLocation());
        System.out.println(third.getLocation());

        // give them all names
        // assign locations
    }
}
