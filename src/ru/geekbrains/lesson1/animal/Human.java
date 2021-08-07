package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

public class Human extends Animal implements Participant {

    private boolean isOnDistance; //прошла дистанцию или нет
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;
    private int resultHuman = 0;

    public Human(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {

        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public Human(String name, Color color) {
        super(name, color, 0);
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s пробежал кросс длинной %d", getName(), distance));
        resultHuman++;
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
        System.out.println(String.format("Человек %s пругнул на высоту %d", getName(), height));
        resultHuman++;
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
        System.out.println(String.format("Человек %s проплыл расстояние длинной %d", getName(), distance));
        resultHuman++;
    }

    @Override
    public void getResult() {
        System.out.println(String.format("Человек %s %s прошла полосу препятствий",
                getName(), isOnDistance ? "" : " не"));

    }

    @Override
    public String getParticipantName() {
        return getName();
    }

    @Override
    public int getParticipantResult() {
        return resultHuman;
    }

    @Override
    public void voice() {
        System.out.println("Привет");
    }

   /* @Override
    public void getResult() {
        System.out.println(String.format("Человек %s %s прошел полосу препятствий",
                getName(), isOnDistance ? "" : " не"));
    }*/
}
