public class Mentor extends Instructor {
    public Mentor(double salary, long id, String fullName, int age, char gender) {
        super(salary, id, fullName, age, gender);
    }


    @Override
    public double period(Group group) {
        return getSalary();
    }
}

