
    public class Agentur {
    private Queue<Statist> statisten; 
    public Agentur() {
        statisten = new Queue<Statist>(); 
    }
    public void neuerStatist(String name, char geschlecht) {
        statisten.enqueue(new Statist(name, geschlecht));

    }
    public Statist statistVeritteln(char geschlecht) {
    Queue<Statist> hilf = new Queue<Statist>();
    Statist gefunden = null;
    boolean statistGefunden = false; 
    while(!statisten.isEmpty() || statistGefunden){
        if(statisten.front().getGeschlecht() == geschlecht){
            gefunden = statisten.front(); 
        }else{
            hilf.enqueue(statisten.front()); 
        }
        statisten.dequeue();
    }
    while(!statisten.isEmpty()){
        hilf.enqueue(statisten.front());
        statisten.dequeue();
    }
    statisten = hilf; 
    
    return gefunden; 
    }
}

}
