public class Main {
    public static void main(String[] args){

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Pedro Guadalupe Ramos";
        myDoctor.showName();


        Doctor secondDoctor = new Doctor("Víctor");
        secondDoctor.showName();

        Doctor tercerDoctor = new Doctor("Jose Perez Perez");
        tercerDoctor.showName();

        System.out.println("FIRST DOCTOR ID: " + myDoctor.id);
        System.out.println("Second Doctor ID: " + secondDoctor.id);
        System.out.println("Tercer Doctor ID: " + tercerDoctor.id);
    }
}
