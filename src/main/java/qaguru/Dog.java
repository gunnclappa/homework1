package qaguru;

public class Dog {
    String name;
    int age;
    int paws;
    final int oldAge = 10;
    final int youngAge = 3;
    final int normalPaws = 4;

    public Dog(String name, int age, int paws) {
        this.name = name;
        this.age = age;
        this.paws = paws;
    }

    public void isDogOldOrYoung() {
        if (age >= oldAge) {
            System.out.println("The dog is old");
        } else if (age <= youngAge) {
            System.out.println("The dog is young");
        }
        else {
            System.out.println("The dog is adult");
        }
    }

    public void countingPaws() {
        if (paws > 0 && paws == normalPaws) {
            System.out.println("The dog has 4 paws");
        } else {
            System.out.println("The dog is handicapped :(");
        }
    }

    public void bark() {
        System.out.println("Bark-bark!");
    }
}
