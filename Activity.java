public class Activity{
    public static void main(String[] args){

        Dog puppy = new Dog();

        puppy.setName("puppies");

        System.out.println(puppy.showName());

        puppy.bark();

        puppy.listofpuppies = new String[] {"Casinao", "Gili", "CPP", "Camil", "Aragon", "Balancar", "Mayuga"};

        int shownumber = puppy.show_numofpuppies();

        System.out.println("Number of puppies: " + shownumber);

        puppy.show_numofpuppies();

        puppy.showpuppies();
    }
}



