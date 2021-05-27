package com.gdai83.java2.lesson1;

public class Treadmill implements Obstacles {
    private int size;

    public Treadmill(int size) {
        this.size = size;
    }

    @Override
    public void Cross(ActionsMember actionsMember) {
        if (actionsMember.getCount() != 0) {
            if (size <= actionsMember.getMaxRun()) {
                actionsMember.run(true, size);
            } else
                actionsMember.run(false, size);
        }
    }
}
