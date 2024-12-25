public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Cow wagyu = new Cow();
        Duck donald = new Duck("โดนัลด์");
        Duck daisy = new Duck("เดซี่");
        Pig burin = new Pig();
        Owl hedwig = new Owl();
        PekingDuck fourseasons = new PekingDuck("4ss");

        //wagyu.sound();
        //burin.sound();
        //hedwig.sound();
        //donald.sound();
        donald.clean(wagyu);
        daisy.clean(donald);
        fourseasons.clean(daisy);
        fourseasons.fly();
        Duck jiatongheng = new PekingDuck("jth");
        jiatongheng.clean(daisy);
        jiatongheng.fly();
        donald.clean(new Cow());
    }
}