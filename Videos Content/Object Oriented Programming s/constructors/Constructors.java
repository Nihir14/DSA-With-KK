package constructors;

public class Constructors {
     // Main method for testing
     public static void main(String[] args) {
          int[] marksArray = {85, 90, 78, 88, 92}; // Sample marks
//          constructors.Student student1 = new constructors.Student((byte) 20, (short) 2025, 101, 7999382002L,
//                  85.5f, 8.2, 'A', true,
//                  "Nihir Verma", marksArray);
          Student student1 = new Student();
          student1.displayStudentInfo();
     }
}
