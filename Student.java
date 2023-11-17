class Student extends Person {
    private String classroom;

    public Student(String name, String classroom) {
        super(name);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = String.valueOf(classroom);
        classroom.getStudents().add(this);
    }
}
