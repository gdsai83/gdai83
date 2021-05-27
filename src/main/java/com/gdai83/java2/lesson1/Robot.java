package com.gdai83.java2.lesson1;

public class Robot implements ActionsMember {

    private String name;
    private int maxRun;
    private int maxJump;
    private int count=1;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public void run(boolean can, int dist) {
        if (can) {
            System.out.println("робот " + name + " пробежал "+ dist+"м. дорожку");
        } else {
            System.out.println("робот " + name + " не смог пробежать "+ dist+"м. дорожку");
            count=0;
        }
    }

    @Override
    public void jump(boolean can, int dist) {
        if (can) {
            System.out.println("робот " + name + " перепрыгнул "+ dist+"см. стену");
        } else {
            System.out.println("робот " + name + " не смог перепрыгнуть "+ dist+"см. стену");
            count=0;
        }
    }

    public int getCount() {
        return count;
    }
}