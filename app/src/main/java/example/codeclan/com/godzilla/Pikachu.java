package example.codeclan.com.godzilla;


/**
 * Created by user on 21/06/2017.
 */

public class Pikachu extends Kaiju implements Attack {

    public Pikachu(String name, int healthValue, int destructiveForce){
        super(name, healthValue, destructiveForce);
    }

//    public String attack(){
//        return "Kablammo!!";
//    }

    public String roar(){
        return "PIKA! PIKA!";
    }
}
