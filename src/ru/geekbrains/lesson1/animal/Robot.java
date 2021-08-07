package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;

/**
 * Робот не является животным, но может учавствовать в соревнованиях
 * так как реализует интерфейс {@link Participant}
 */
public class Robot implements Participant {

    private boolean isOnDistance;
    private String name;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;
    private int resultRobot = 0;

    public Robot(String name, int runDistance, int jumpHeight, int swimDistance) {

        this.name = name;
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
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
        System.out.println(String.format("Робот %s пробежал кросс длинной %d", getName(), distance));
        resultRobot++;
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
        System.out.println(String.format("Робот %s пругнул на высоту %d", getName(), height));
        resultRobot++;
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
        System.out.println(String.format("Робот %s проплыл расстояние длинной %d", getName(), distance));
        resultRobot++;
    }

    @Override
    public String getParticipantName() {
        return name;
    }

    @Override
    public int getParticipantResult() {
        return resultRobot;
    }

  /*  @Override
    public void getResult() {
        System.out.println(String.format("Робот %s %s прошел полосу препятствий",
                name, isOnDistance ? "" : " не"));
    }*/

    public String getName() {
        return name;
    }
}
