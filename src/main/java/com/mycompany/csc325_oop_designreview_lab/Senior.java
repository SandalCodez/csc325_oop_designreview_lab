package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

    // Credits field to store the senior's credit hours
    private int credits;
    // Minimum credits required for senior status
    private static final int MIN_CREDITS = 85;


    public Senior(String name, short age, int credits) {
        // Call the parent class (Student) constructor
        super(name, age);
        if (credits < MIN_CREDITS) {
            throw new IllegalArgumentException("Senior must have at least " + MIN_CREDITS + " credits");
        }
        this.credits = credits;
    }

    public Senior(String name, short age, int credits, double gpa) {
        // Call the parent class (Student) constructor
        super(name, age, gpa);
        if (credits < MIN_CREDITS) {
            throw new IllegalArgumentException("Senior must have at least " + MIN_CREDITS + " credits");
        }
        this.credits = credits;
    }


    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits < MIN_CREDITS) {
            throw new IllegalArgumentException("Senior must have at least " + MIN_CREDITS + " credits");
        }
        this.credits = credits;
    }

    public static int getMinCredits() {
        return MIN_CREDITS;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + getGpa() +
                ", credits=" + credits +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
