package ua.org.oa.kraspu;

/**
 * ﻿Создать java-программу, удовлетворяющую следующим требованиям:
 *
 * 1. Создать класс, описывающий заданный объект. В каждом классе:
 *
 * Определить минимум 5 полей трех различных типов характеризующих заданный предмет;
 * Создать метод, выполняющий вычисление параметров на основании значений полей объекта;
 * Определить метод для вывода информации об объекте на экран.
 *
 * 2. Каждый класс, поле, метод должен иметь название, отражающее его суть и коментарии, описывающие их предназначение.
 *
 * 3. На этапе составления программы должны быть использованы соглашения из java code convention.
 *
 * 4. Протестировать созданный вами класс, создав несколько экземпляров класса (в методе main()), описывающего предмет, провести инициализацию переменных-атрибутов каждого экземпляра и вызвать его методы.
 *
 * 5. Имя пакета в котором создается класс/классы должно иметь формат ua.org.oa.<Jira Login>.
 *
 * Объект:
 *
 * Поезд в расписании
 *
 */
public class Train {

    String fromCity;    //город отправления
    String toCity;      //город прибытия
    double distance;    //расстояние между пунктами, км
    int vagons;         //кол-во вагонов
    double fromTime;    //время отправленияб ч
    double toTime;      //время прибытия, ч
    double time;        //время в пути, ч

    public Train(String fromCity, String toCity, double distance, int vagons,
                 double fromTime, double toTime, double time) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
        this.vagons = vagons;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.time = time;
    }

    double averageSpeed (double distance, double fromTime, double toTime) {
        if (toTime > fromTime) {
            return this.distance / (this.toTime - this.fromTime);
        }
        else return -1;
    }

    double timeLeft(double Time, double fromTime, double toTime) {
        return (this.toTime - this.fromTime - this.time);
    }

    info ()
}
