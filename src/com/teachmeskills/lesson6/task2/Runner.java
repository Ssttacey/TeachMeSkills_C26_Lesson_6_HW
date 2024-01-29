package com.teachmeskills.lesson6.task2;

public class Runner {

    public static void main(String[] args) {
        Student st1 = new Student("Name 1", "Surname 1", "MC345678", "C-26");
        Student st2 = new Student("Name 2", "Surname 2", "MR456700", "C-26");
        Student st3 = new Student("Name 3", "Surname 3", "MC583903", "C-26");
        Student st4 = new Student("Name 4", "Surname 4", "KH095394", "C-26");

        Student[] Array = new Student[]{st1, st2, st3, st4};
        for (Student student : Array) {
            System.out.println(student.name + " " + student.surname + " " + student.passportNumber + " " + student.groupNumber);
        }
    }
}
