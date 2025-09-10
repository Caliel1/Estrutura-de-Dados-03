
import java.util.LinkedList;


public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> cliente= new LinkedList<String>();
        cliente.add("Paulo");
        cliente.add("Heitor");
        cliente.addLast("Caliel");
        cliente.add("Bruna");
        cliente.removeFirst();

        System.out.println(cliente);
    }
}
