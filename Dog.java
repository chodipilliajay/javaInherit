public class Dog extends Animal{

    private String earShape;
    private String tailShape;
    public Dog(){
//        super();  cause animal doesn't have any default constructor
        super("Mutt", "Big", 150);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15? "small": (weight < 35? "medium": "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String earShape, String tailShape) {
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    public void makeNoise(){
        if (type == "Wolf"){  // private can't be accessed
            System.out.println("Ow wooooo");
        }
        bark();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("ajay moves faster than any other animals");
        if (speed.equals("slow")) {
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
    }

    private void bark(){
        System.out.println("Woof!");
    }
    private void run(){
        System.out.println("Dog running");
    }
    private void walk(){
        System.out.println("Dog walking");
    }
    private void wagTail(){
        System.out.println("Tail wagging");
    }
}
