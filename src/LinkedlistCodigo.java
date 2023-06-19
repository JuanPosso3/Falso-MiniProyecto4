import java.util.*;
class texto
{
    LinkedList<Integer> letras = new LinkedList<>();

    public static String palabra;
    public static char letra;
    
    int letraEvaluadaConvertida=Character.codePointAt(Character.toString(letra), 0);
    int numeroLetras=palabra.length();

	texto(int numeroLetras)
	{
		this.numeroLetras=numeroLetras;
        
        for (int i = 0; i < numeroLetras; i++) {
            int letraConvertida=Character.codePointAt(Character.toString(palabra.charAt(i)), 0);
            letras.add(letraConvertida);
        }
        
}
    void busqueda(){
        LinkedList<Integer> posciones = new LinkedList<Integer>();
        ListIterator<Integer> iterator = letras.listIterator();

        int i=0;
        int j=0;
        while(iterator.hasNext()){
            if (iterator.next()==letraEvaluadaConvertida){
                posciones.add(i);
            }
            i++;

        }
        int tamaño = posciones.size();
        if (posciones.isEmpty()){
            System.out.println("La letra no fue encontrada en el texto o palabra proporcionado");
        }
        while(!posciones.isEmpty())
		{
            j++;
			int x=posciones.poll();
            if (j==1){
                System.out.println("Contando normalmente las posiciones empezando desde 1 como primera posicion");
                System.out.println("La primera ocurrencia de la letra '"+letra+"' esta en la posicion ["+(x+1)+"]");
            }else if (j==tamaño){
                System.out.println("La ultima ocurrencia de la letra '"+letra+"' esta en la posicion ["+(x+1)+"]");
            }
		}
    }   

	public static void main(String[] args)
		{


            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese una cadena de caracteres: ");
            palabra = scanner.nextLine();
            palabra=palabra.toLowerCase();

            System.out.print("Ingrese un carácter: ");
            String input = scanner.nextLine();
            letra = input.charAt(0);
            letra=Character.toLowerCase(letra);
            

            int numeroLetras=palabra.length();
			texto g=new texto(numeroLetras);
            g.busqueda();
            scanner.close();

		}
}