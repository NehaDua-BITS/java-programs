public class superclass
{
    superclass()
    {
        System.out.println("superclass constructor");
    }
    
    public void displayResult() {
    System.out.println("Printing from superclass");
    }

        public static void main(String args[]) {
            Subclass obj= new superclass().new Subclass();
            obj.displayResult();
    }

    class Subclass extends superclass {

        Subclass()
        {
            System.out.println("subclass constructor");
        }

        public void displayResult() {
            System.out.println("Displaying from subClass");
            super.displayResult();
        }
    }
}