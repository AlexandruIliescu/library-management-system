package com.itschool.library.unit_tests.test_mock_injection;

public class MyServiceClass {

    private DependencyOne dependencyOne;
    private DependencyTwo dependencyTwo;

    public MyServiceClass(DependencyOne dependencyOne, DependencyTwo dependencyTwo) {
        this.dependencyOne = dependencyOne;
        this.dependencyTwo = dependencyTwo;
    }

    public String useDependencies() {
        return dependencyOne.doSomething() + " " + dependencyTwo.doSomething();
    }
}