public class HelloWorld {
     String name = "";

       public HelloWorld() {
        this.name = "John";
   }


      public HelloWorld(String name) {
        this.name = name;
   }


   public void displayInfo(){
    System.out.println(name);
   }



    public static void main(String[] args) {
        System.out.println("Student Grade Calculator");
        System.out.println("Learning Java For Tech Upgrade required for company projects");
        System.out.println("Milestone J-0");

        HelloWorld p1 = new HelloWorld( "Test");
        HelloWorld p2 = new HelloWorld();

        p1.displayInfo();
        p2.displayInfo();

    }
}
