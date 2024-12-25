public class Duck extends Animal implements Flyable{
    String name;
    public Duck(String name){
        this.name = name;
    }
    public String toString(){
        return "เป็ด"+this.name;
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb(พรึ่บ พรึ่บ)");
    }

    @Override
    public void glide() {
        System.out.println("hi-yahh!");
    }

    @Override
    void sound() {
        System.out.println("quack quack(ก้าบ ก้าบ)");
    }

    void clean(Animal animal){
        System.out.println(this+" is cleaning "+animal);
    }
}