import java.util.LinkedList;
import java.util.Scanner;

class LinkedlistCodigo
{
	public static void main(String[] args){
        String palabra= "loco";
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un carácter: ");
        char letra = scanner.next().charAt(0);
        letra=Character.toLowerCase(letra);
        LinkedList<Integer> ocurrencias= new LinkedList<>();

        for (int i=0; i<palabra.length(); i++){
            if (palabra.charAt(i)==letra){
                ocurrencias.add(i);
            }
        }
        if (!ocurrencias.isEmpty()){
            System.out.println("Contando 0 como primer posicion\nLa posicion de la primera ocurrencia de '"+letra+"' es "+ocurrencias.getFirst());
            System.out.println("La posicion de la ultima ocurrencia de '"+letra+"' es "+ocurrencias.getLast());
        }else{
            System.out.println("La letra no se encuentra en la palabra");
        }
        scanner.close();
    }
}