public abstract class Direction {
    private String name;
    private int age;
    private char gender;
    private String email;

    public Direction(String name, int age, char gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public Direction() {
    }
}
