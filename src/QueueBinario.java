import java.util.ArrayList;

public class QueueBinario {
    ArrayList<String> arr;
    public QueueBinario() {
        arr = new ArrayList<String>();
    }

    public void establecerNumero(int numero){
        for (int i = 1; i <= numero; i++) {
            arr.add( deNumeroABinario(i));
        }    
    }

    private String deNumeroABinario(int numero){
        int numeroTemporal = numero;
        StringBuilder binario = new StringBuilder();
        while(numeroTemporal >= 1){
            if(numeroTemporal % 2 == 0){
                binario.append("0");
                numeroTemporal /= 2;
            }else {
                binario.append("1");
                numeroTemporal = (numeroTemporal -1) / 2;
            }
        }
       return binario.reverse().toString();
    }

    public void enqueue(String binario) {
        arr.add(binario);
    }

   public String dequeue() {
        if (arr.size() == 0) {
            System.out.println("underflow");
            return "-1";
        }
        return arr.remove(0);
    }

    void display() {
        while(arr.size() != 0)
            System.out.println(dequeue());
    }

    public static void main(String[] args) {
        QueueBinario queueBinario = new QueueBinario();
        queueBinario.establecerNumero(16);
        queueBinario.display();
        queueBinario.dequeue();
    }
}
