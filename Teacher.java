//this is teacher class
class Teacher extends Person {
    private String specialization;

    public Teacher(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}