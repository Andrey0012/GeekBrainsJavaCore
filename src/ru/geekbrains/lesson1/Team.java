package ru.geekbrains.lesson1;

/**
 * Класс - комманда участников соревнований
 */
public class Team {

    private Participant[] participants;

    // здесь используется конструктор с переменным числом параметров
    public Team(Participant... participants) {
        // внутри метода переменное число параметров интерпретируется как массив
        this.participants = participants;
    }

    public Participant[] getParticipants() {
        return participants;
    }

 /*   public void getResults() {
        for (Participant part : participants) {
            part.getResult();
        }*/
    public void showResults () {
        for (Participant part : participants) {
            System.out.println(part.getParticipantName() + " прошёл успешно " + part.getParticipantResult() + " испытаний");
            }

        }
    }
