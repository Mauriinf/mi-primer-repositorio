 public class AppPilaEstatica {
static Scanner teclado = new Scanner(System.in);
static final int MAX = 5;
static Object Pila[] = new Object[MAX];
static int tope = -1;


public static void main(String[] args) {
     Object Dato;
     int opc;

    do{
      System.out.println("Menu de pila");
      System.out.println("1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Desplegar Pila");
      System.out.println("4. Salir");
      System.out.println("Teclee la opcion");
      opc = teclado.nextInt();

      switch(opc){
          case 1: 

            System.out.println("Ingrese dato a insertar");
            Dato = teclado.nextInt();

            push(Pila, Dato, tope, MAX);


              break;
          case 2: 

              Dato = pop(Pila, tope);
              if (Dato == null) {
                  System.out.println("El dato que salio es: " + Dato);

              }

              break;
          case 3:

              desplegarPila(Pila, tope);

              break;
          case 4:
              System.out.println("Adios");
          default:
              System.out.println("Error\nOpcion invalida");
      }

    }while(opc!=4);



}

public static boolean pilaVacia(Object Pila[],int tope){
    return tope == -1;

}

public static boolean pilaLlena(Object Pila[], int tope, int MAX){
    return tope == MAX-1;

}
public static void push(Object Pila[],Object Dato,int tope,int MAX){
    if (pilaLlena(Pila, tope, MAX)==true) {
        System.out.println("Overflow");
    } else {
        tope ++;
        Pila[tope] = Dato;
        System.out.println(tope);

    }

}
public static Object pop(Object Pila[],int tope){
    Object Dato = null;
    if (pilaLlena(Pila, tope, MAX) == true) {
        System.out.println("Underflow"); 
    } else {
        Dato = Pila[tope];
        tope --;
    }
    return Dato;
}
public static void desplegarPila(Object Pila[],int tope){

    if (pilaVacia(Pila, tope) == true) {
        System.out.println("-------Pila Vacia--------");
    } else {
        System.out.println("Datos de la pila");
            for (int i = -1; i < tope; i++) {
                System.out.println(Pila[i]);
            }
            System.out.println("---------------------");
    }


}