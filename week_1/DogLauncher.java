public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(51);
        d.makeNoise();

        Dog d2 = new Dog(100);

        // Static - Impartial judge comparing dogs
//        Dog bigger = Dog.maxDog(d, d2);

//        d.makeNoise();

        // Non static - Am I bigger than the other dog?
        Dog bigger = d.maxDog(d2);
        bigger.makeNoise();
    }
}
