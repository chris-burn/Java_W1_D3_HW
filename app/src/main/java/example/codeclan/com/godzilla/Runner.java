package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Runner {

    public static void main(String[] args){

        Godzilla godzilla = new Godzilla("Zilla", 120, 50);
        Pikachu pikachu = new Pikachu("Pika", 90, 35);
        SkyScraper skyScraper = new SkyScraper("largebuilding", 30);
        Townhall townhall = new Townhall("smallbuilding", 20);

        System.out.println("Zilla enters the City, looks like trouble!");
        System.out.println("Zilla looks pretty healthy with health " + godzilla.getHealthValue());


    }

}
