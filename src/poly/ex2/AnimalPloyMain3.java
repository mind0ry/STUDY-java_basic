package poly.ex2;

public class AnimalPloyMain2 {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Animal[] AnimalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : AnimalArr) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
