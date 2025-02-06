public class MyEducationSystem {
  public static void main(String[] args) {
      Learner learner1 = new Learner("Rajveer", 101);
      Subject subject1 = new Subject("Machine Learning", 501);
      
      learner1.showDetails();
      subject1.showCourseDetails();
  }
  
  static class Learner {
      private String fullName;
      private int studentId;
      
      public Learner(String fullName, int studentId) {
          this.fullName = fullName;
          this.studentId = studentId;
      }
      
      void showDetails() {
          System.out.println("Student Name: " + fullName);
          System.out.println("Student ID: " + studentId);
      }
  }
  
  static class Subject {
      private String subjectName;
      private int subjectCode;
      
      public Subject(String subjectName, int subjectCode) {
          this.subjectName = subjectName;
          this.subjectCode = subjectCode;
      }
      
      void showCourseDetails() {
          System.out.println("Subject: " + subjectName);
          System.out.println("Subject Code: " + subjectCode);
      }
  }
}