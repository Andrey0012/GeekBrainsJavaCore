package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.animal.Cat;
import ru.geekbrains.lesson1.animal.Dog;
import ru.geekbrains.lesson1.animal.Human;
import ru.geekbrains.lesson1.animal.Robot;
import ru.geekbrains.lesson1.course.Course;
import ru.geekbrains.lesson1.course.Cross;
import ru.geekbrains.lesson1.course.Wall;
import ru.geekbrains.lesson1.course.Water;
import ru.geekbrains.lesson1.enums.Color;

/**
 * Класс для запуска приложения - симулятор кросса
 */
public class Application {

    public static void main(String[] args) {
        Team team = new Team(
                new Cat("Барсик", Color.BLACK, 1, 100, 50),
                new Cat("Барсук", Color.BLACK, 1, 70, 15),
                new Dog("Бег",Color.BROWN, 2,55,11,6),
                new Dog("Лунтик",Color.BROWN, 5,200,15,3),
                new Human("Иван",Color.WHITE, 25, 70, 20, 32),
                new Robot("Бар",50, 10,55),
                new Robot("Барно",70, 25,4)
        );

        Course course = new Course(
                new Cross(50),
                new Wall(10),
                new Water(5)
        );

        course.doIt(team);
        team.showResults();
    }

}
