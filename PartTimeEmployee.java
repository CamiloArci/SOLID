public class PartTimeEmployee implements Employee {

    String name;
    String departament;

    public PartTimeEmployee(String name, String department) {
        this.name = name;
        this.departament = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartament() {
        return departament;
    }
}