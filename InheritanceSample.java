public class InheritanceSample {
    public static void main(String[] args){

        Person p1 = new Person("Rafaela De Roxas", "Salong");
        System.out.println(p1.Name);
        System.out.println(p1.Address);


        Student student1 = new Student("Mary Rose Julongbayan", "Brgy. Salong", "BSIT", 2);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());


        System.out.println();

        

        Staff staff1 = new Staff("Trisha Macalindong", "Balayan", "BSU-Balayan", 26000.00);

        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff Program: " + staff1.getSchool());
        System.out.println("Staff Year: " + staff1.getSalary());


        System.out.println(p1.toString());
        System.out.println();

        System.out.println(student1.toString());
        System.out.println();

        System.out.println(staff1.toString());


    }
}