package loose.oose.fis.lab.student.manager.model;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;

    public Student(String firstName, String lastName, int age, double meanGrade) {
        //assignments
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.meanGrade=meanGrade;
    }

    @Override
    public String toString() {
        //toString generated implementation
        return firstName + lastName;
    }

    @Override
    public boolean equals(Object o) {
        //equals generated implementation
        return true;
    }

    @Override
    public int hashCode() {
        //hashCode generated implementation
        return 0;
    }

    //generated getters and setters for all fields


    public double getMeanGrade() {
        return meanGrade;
    }

    public void setMeanGrade(double meanGrade) {
        this.meanGrade = meanGrade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
