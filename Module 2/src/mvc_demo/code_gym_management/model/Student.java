package mvc_demo.code_gym_management.model;

public class Student {
    private int id;
    private String name;
    private String className;
    private String subject;

    public Student(int id, String name, String className, String subject) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public static Student covertToLine(String convert){
        String[] parts = convert.split(",");
        return new Student(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3]);
    }

    @Override
    public String toString() {
        return String.format("%-5d %-15s %-15s %-15s", id, name, className, subject);
    }
}

