package com.gdai83.java2.lesson1;

public interface ActionsMember {

    void run(boolean can, int dist);

    void jump(boolean can, int dist);

    int getMaxRun();

    int getMaxJump();

    int getCount();

}
