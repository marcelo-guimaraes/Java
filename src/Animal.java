public class Animal {
    //attributes
    private float weight;
    public String colour;
    public String name;

    public Animal(float weight, String colour, String name) {
        this.weight = weight;
        this.colour = colour;
        this.name = name;
    }

    //methods
    private void eat() {
        System.out.println("Eating...");
        weight++;
    }

    private void run() {
        System.out.println("Running...");
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
}
