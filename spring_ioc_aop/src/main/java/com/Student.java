package com;

/**
 * @author ：炜哥
 * @description：TODO
 * @date ：2021/4/10 16:23
 */
public class Student {

    //学员姓名
    private String name;

    //学员分数
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
