package com.itschool.library.utils.design_patterns.builder;

public class Meal {

    private String mainCourse;
    private String drink;
    private String side;

    private Meal(Builder builder) {
        this.mainCourse = builder.mainCourse;
        this.drink = builder.drink;
        this.side = builder.side;
    }

    public static class Builder {
        private String mainCourse;
        private String drink;
        private String side;

        public Builder mainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}