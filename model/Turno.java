public class Turno {
    
    private Turno next;
    private Turno previous;
    private int value;
    private int saltadas;

    public Turno(int value){
        this.value = value;
        this.saltadas = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Turno getNext() {
        return next;
    }

    public void setNext(Turno next) {
        this.next = next;
    }

    public Turno getPrevious() {
        return previous;
    }

    public void setPrevious(Turno previous) {
        this.previous = previous;
    }

    public int getSaltadas() {
        return saltadas;
    }

    public void setSaltadas(int saltadas) {
        this.saltadas = saltadas;
    }


}
