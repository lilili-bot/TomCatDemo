package com.itheima.bean;

import java.util.Objects;

public class Student {
    private String username;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String username, int age, int score) {
        this.username = username;
        this.age = age;
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                getScore() == student.getScore() &&
                Objects.equals(getUsername(), student.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getAge(), getScore());
    }
}
