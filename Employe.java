class Employe {
    int id;
    int age;
    String name;

    // Constructor 1 - no parameters
    Employe() {
        id = 0;
        age = 0;
        name = "Unknown";
    }

    // Constructor 2 - one parameter
    Employe(int id) {
        this.id = id;
        age = 0;
        name = "Unknown";
    }

    // Constructor 3 - two parameters
    Employe(int id, String name) {
        this.id = id;
        this.name = name;
        age = 0;
    }

    // Constructor 4 - three parameters
    Employe(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        Employe e1 = new Employe();
        Employe e2 = new Employe(101);
        Employe e3 = new Employe(102, "Rahul");
        Employe e4 = new Employe(103, "Madhusudhan", 21);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}