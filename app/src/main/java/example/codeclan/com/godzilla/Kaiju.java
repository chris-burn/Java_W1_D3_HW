package example.codeclan.com.godzilla;

import static android.R.attr.value;

public abstract class Kaiju {

    public String name;
    public int healthValue;
    public int destructiveForce;

    public Kaiju(String name, int healthValue, int destructiveForce) {
        this.name = name;
        this.healthValue = healthValue;
        this.destructiveForce = destructiveForce;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

    public int getDestructiveForce(){
        return this.destructiveForce;
    }


}