public class NewInstanceObj {
    public static void main(String[] args) {
        try {
            
            NewInstanceObj outerClass = new NewInstanceObj();

            Class<?> c = Class.forName("NewInstanceObj$Student");

            
            Student s = (Student) c.getDeclaredConstructor(NewInstanceObj.class).newInstance(outerClass);

           
            s.name = "Rajveer";
            s.roll_no = 21;

            System.out.println("Student Details:");
            s.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    class Student {
        String name;
        int roll_no;

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + roll_no);
        }
    }
}
