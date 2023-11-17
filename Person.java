class Person implements Nameable {
    protected String Name;

    public Person(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public String correct_name() {
        return Name;
    }
}
