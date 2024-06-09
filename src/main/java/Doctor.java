public class Doctor {
    static int global_id = 0;
    int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("----- Building a Doctor -----");
        asignarId();
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
        this.name = name;
        asignarId();
    }

    public void showName(){
        System.out.println(name);
    }

    private void asignarId(){
        this.id = global_id;
        global_id++;
    }
}
