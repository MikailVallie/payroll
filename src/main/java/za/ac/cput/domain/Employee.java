package za.ac.cput.domain;

public class Employee {
    private int employeeNumber;
    private String firstName;
    private String surName;

    private Employee(){

    }

    private Employee(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.surName = builder.surName;
    }



    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    public static class Builder{
        private int employeeNumber;
        private String firstName;
        private String surName;

        public Builder setEmployeeNumber(int employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder setSurName(String surName){
            this.surName = surName;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}