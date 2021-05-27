package com.gdai83.java2.lesson1;

public class Wall implements Obstacles {
    private int size;

    public Wall(int size) {
        this.size = size;
    }


    @Override
    public void Cross(ActionsMember actionsMember) {
        if (actionsMember.getCount() != 0) {
            if (size <= actionsMember.getMaxJump()) {
                actionsMember.jump(true, size);
            } else
                actionsMember.jump(false, size);
        }
    }
}
