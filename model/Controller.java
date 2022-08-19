public class Controller {
    
    private Turno head;
    private Turno tail;
    private Turno actual;


    public Controller(){}
    
    public void darTurno(){
        if(head == null){
            head = new Turno(1);
            tail = head;
            actual = head;

            head.setPrevious(tail);
            tail.setNext(head);
        }else{
            Turno nuevoTurno = new Turno(tail.getValue() + 1);
            this.tail.setNext(nuevoTurno);
            nuevoTurno.setPrevious(this.tail);

            this.tail = nuevoTurno;
            this.head.setPrevious(this.tail);
            this.tail.setNext(this.head);
        }

    }

    public int mostrarTurnoActual(){
        if(actual == null){
            return -1;
        }else{
            return actual.getValue();
        }
    }

    public void pasarTurno(){

        if(actual.getSaltadas() == 3){
            eliminarTurnoActual();
            System.out.println("entre");
        }else if(head == null){
            return;
        }else{
            actual.setSaltadas(actual.getSaltadas() + 1);
            actual = actual.getNext();
            System.out.println(actual.getNext().getValue());
        }
    }

    //o -> o -> o 


    public void eliminarTurnoActual(){

        if(actual == null){
            return;
        }else if(actual == head && head == tail) {
        	head = null;
        	tail = null;
            actual = null;
        }else if(actual == head){
            head = actual.getNext();

            actual.setNext(null);
            actual.setPrevious(null);

            tail.setNext(head);
            head.setPrevious(tail);

            actual = head;

        }else if(actual == tail){
            tail = actual.getPrevious();

            actual.setNext(null);
            actual.setPrevious(null);

            tail.setNext(head);
            head.setPrevious(tail);
            actual = head;

        }else{
            Turno siguiente = actual.getNext();

            actual.getPrevious().setNext(actual.getNext());
            actual.getNext().setPrevious(actual.getPrevious());

            actual.setNext(null);
            actual.setNext(null);

            actual = siguiente;

        }

        

    }

}
