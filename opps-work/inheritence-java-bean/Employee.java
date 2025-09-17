import java.io.Serializable;

public class Employee implements Serializable {
    // Private data members
    private int id;
    private String name;

    // No-argument constructor
    public Employee() {
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Main method to test
    public static void main(String[] args) {
        Employee e1 = new Employee();   // Creating bean object
        e1.setId(101);                  // Setting values
        e1.setName("Ravi");

        // Getting values
        System.out.println("Employee ID: " + e1.getId());
        System.out.println("Employee Name: " + e1.getName());
    }
}
