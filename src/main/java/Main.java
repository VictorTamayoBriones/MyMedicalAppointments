public class Main {
    public static void main(String[] args){

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Pedro Guadalupe Ramos";
        myDoctor.showName();


        Doctor secondDoctor = new Doctor("Víctor");
        secondDoctor.showName();
    }
}
