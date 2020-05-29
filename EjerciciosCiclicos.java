import java.util.Scanner;
import java.math.BigInteger;
//creado por jhobany ticona gonzalo
//algoritmo para clacular factoriales
public class EjerciciosCiclicos{
  static Scanner teclado=new Scanner(System.in);
  public static void CacularFactorialNum(){
    int numero,contador=1;
    BigInteger resultado=BigInteger.valueOf(1);
    //datos de entrada
    System.out.println("Ingrese el numero que desea su factorial");
    numero=teclado.nextInt();
    if(numero>0){
     while(contador<numero){
      contador++;
      System.out.println("ver:"+resultado);
      resultado=resultado.multiply(BigInteger.valueOf(contador));
      

     }
  }
  //salida
 System.out.println("El factorial de" +numero+ " Es:" +resultado);
 }


 public static void main(String[] args){
  System.out.println("espero te haya ayudado de mucho Gracias");
  CacularFactorialNum();
}
}