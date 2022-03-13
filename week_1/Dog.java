public class Dog {
    public int weightInPounds;
    public static String binomen = "Canis familiaris";      // same property across dogs

    // One integer constructor
    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("Yip!");
        } else if (weightInPounds < 30) {
            System.out.println("Bark.");
        } else {
            System.out.println("WOOF");
        }
    }

    // If you need to invoke method using class name, static. Not specific to any instance, general to whole class
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

    // Non-static cant be accessed using class name, instead use a specific instance
    public Dog maxDog(Dog d2) {
        if (weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;

    }

}
