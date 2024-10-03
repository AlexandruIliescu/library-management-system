package com.itschool.library.utils.solid;

public class ISP {
}

//Before: violating ISP
interface Worker {
    void eat();
}

class HumanWorker implements Worker {
    @Override
    public void eat() {
        System.out.println("Human eating");
    }
}

class RobotWorker implements Worker {
    @Override
    public void eat() {
       throw new UnsupportedOperationException("Robots don't eat");
    }
}

//After: following ISP
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker2 implements Workable, Eatable {
    @Override
    public void work() {
        //define implementation
    }

    @Override
    public void eat() {
        //define implementation
    }
}

class RobotWorker2 implements Workable {
    @Override
    public void work() {
        //define implementation
    }
}