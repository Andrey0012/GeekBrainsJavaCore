package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

public class Dog extends Animal implements Participant {

    private boolean isOnDistance; //прошла дистанцию или нет
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;
    private int resultDog = 0;

    public Dog(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {

        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public Dog(String name, Color color) {
        super(name, color, 0);
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance) { return; }
        if(distance > runDistance){
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Собака %s пробежала кросс длинной %d", getName(), distance));
        resultDog++;
    }


    @Override
    public void jump(int height) {
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Собака %s пругнула на высоту %d", getName(), height));
        resultDog++;
    }

    @Override
    public void swim(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Собака %s проплыла расстояние длинной %d", getName(), distance));
        resultDog++;
    }


    @Override
    public void getResult() {
        System.out.println(String.format("Собака %s %s прошла полосу препятствий",
                getName(), isOnDistance ? "" : " не"));
    }

    @Override
    public String getParticipantName() {
        return getName();
    }

    @Override
    public int getParticipantResult() {
        return resultDog;
    }
    /*@Override
    public String getName() {
        return "Собака" + super.getName();
    } */

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }
}
