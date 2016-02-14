
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 * colección de alumnos, que serán mostrados por pantalla emparejados de forma
 * aleatoria.
 */
public class Pareja
{
    //creamos una colección de alumnos que vamos a emparejar.
    private ArrayList<String> parejas;

    /**
     * Constructor for objects of class Pareja
     */
    public Pareja()
    {
       parejas = new ArrayList<>();
       parejas.add("Adeva Tranche, Adrián");
       parejas.add("Aller González, Francisco Javier");
       parejas.add("Álvarez Prieto, Noelia");
       parejas.add("Bóveda del Río, José Antonio");
       parejas.add("Bóveda del Río, José Antonio");
       parejas.add("de la Viuda Crespo, Ignacio");
       parejas.add("Encina Maestro, David”");
       parejas.add("Felix Nañez, Kevin");
       parejas.add("Fernández Diez, Daniel");
       parejas.add("Fernández Diez, Daniel");
       parejas.add("Fernández González, Javier");
       parejas.add("Fernández Rincón, Jesús");
       parejas.add("Fuentes Álvarez, Francisco José");
        parejas.add("García Juárez, David");
       parejas.add("García Serrano, Rubén");
       parejas.add("González Álvarez, David");
       parejas.add("López Beltrán, Víctor");
       parejas.add("Lora García, Sandra");               parejas.add("Prieto Mediavilla, Gabriel");
       parejas.add("Melcón Diez, Víctor");               parejas.add("Robles González, Miguel Ángel");
       parejas.add("Menéndez Pouso, Francisco José");    parejas.add("Sánchez Manzano, Adán");
       parejas.add("Pérez Bayón, Álvaro");               parejas.add("Serrano García, Verónica");
       parejas.add("Pradera San José, Daniel");          parejas.add("Tascón González, Anibal");

    }

    /**
    * hacemos una copia de la colección parejas para facilitar el emparejamiento.
    */
    public void dos(){
      ArrayList<String> copia = new ArrayList<>();
      copia = (ArrayList)parejas.clone();//
      Collections.shuffle(copia); // agitamos los elementos de la colección para que queden sesordenados.
      Iterator<String> it = copia.iterator();
       
       String nombre = "";
       int index = 0;
       while(it.hasNext()){
          
          
          if(index == 0){
              System.out.println(" ");
            System.out.println("Nombres de la pareja;");
          }
          nombre = it.next();
          it.remove();
          
          System.out.println(nombre);
          index ++;
          if(index == 2 && copia.size() > 1){
            index = 0;
          }
       }
            
    }
   
   
}


















