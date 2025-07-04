package com.mycompany.csc325_oop_designreview_lab;

    public class Freshman extends Student {

        // Credits field to store the freshman's credit hours
        private int credits;

        public Freshman(String name, short age, int credits) {
            // Call the parent class (Student) constructor
            super(name, age);
            this.credits = credits;
        }

        public Freshman(String name, short age, int credits, double gpa) {
            // Call the parent class (Student) constructor
            super(name, age, gpa);
            this.credits = credits;
        }

        public int getCredits() {
            return credits;
        }

        public void setCredits(int credits) {
            this.credits = credits;
        }

        @Override
        public String toString() {
            return "Freshman{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", gpa=" + getGpa() +
                    ", credits=" + credits +
                    ", address='" + getAddress() + '\'' +
                    '}';
        }
    }
