import java.util.Scanner;

public class Main {
    
    private Scanner sc;
    private Controller controller;
    
    public Main(){
        sc = new Scanner(System.in);
        controller = new Controller();
    }

    public static void main(String[] args) {
        
        Main app = new Main();

        int option = 0;


        while(option != 5){
            app.printMenu();
            option = app.getOption();
            app.executeOption(option);
        }


    }

    public void executeOption(int option) {

        switch (option) {
            case 1:
                controller.darTurno();
                break;
        
            case 2:
                int turno = controller.mostrarTurnoActual();

                if(turno == -1){
                    System.out.println("NO hay turnos");
                }else{
                    System.out.println("turno actual: " + turno);
                }

                break;
            case 3:
                controller.pasarTurno();
                break;

            case 4:
                controller.eliminarTurnoActual();
                break;

            case 5:
                System.out.println("bye .)");
                break;
            
        }

    }

    public void printMenu() {

        System.out.println("1. Dar turno \n" + 
                            "2. Mostrar turno actual \n" + 
                            "3. Pasar turno \n" + 
                            "4. Eliminar turno actual y seguir \n" + 
                            "5. Salir");

    }

    public int getOption(){
        int option = sc.nextInt();
        sc.nextLine();

        return option;

    }


}
