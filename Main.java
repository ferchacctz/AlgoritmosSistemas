import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String buscarlibro = scanner.next();
        
        scanner.nextLine();
        
        String[] libros = scanner.nextLine().split(" ");
		System.out.println(libros[1]+"Algebra Lineal");
		System.out.println(libros[2]+"Ingener�a de Software");
		System.out.println(libros[3]+"Base de Datos II");
		System.out.println(libros[4]+"Estad�stica");
		System.out.println(libros[5]+"C�lculo Integral");
        
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (libros[i].equals(buscarlibro)) {
                position = i + 1;
                break;
            }
        }
        
        System.out.println(position);
 
    }
}
