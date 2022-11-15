public class Student extends Person {
    private double contract;

    public Student(double contract, long id, String fullName, int age, char gender) {
        super(contract,id,fullName,age,gender);
        this.contract = contract;
    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    public double period(Group group) {
        return 0;
    }
}
