package Q2;
// Create a Student JavaBean class with the following fields:
//        name: String, marks: Integer
//        b. Create a Main class and perform the following operation in it’s main method:
//        Get the number of students from the user and store the students in some data
//        structure.
public class StudentJavaBean {
    private String name;
    private Integer marks;

    public StudentJavaBean(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentJavaBean{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public StudentJavaBean() {
    }
}
