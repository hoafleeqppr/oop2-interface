package bth2.peopleStudentOfficer;

class StudentImpl extends People implements Student {


    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }


    @Override
    public void eat() {
        System.out.println("an bun cha");
    }


    @Override
    public void sleep() {
        // lệnh thực thi
        System.out.println("di ngu luc 11h");
    }


    @Override
    public void registerCourse(String course) {
        // lệnh thực thi
        System.out.println();
    }


    @Override
    public void attendClass() {
        // lệnh thực thi
    }
}


