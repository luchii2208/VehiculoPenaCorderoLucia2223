
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoPeñaCorderoLucia2223 miVehiculoPeñaCorderoLucia2223;
        int stockActual = operativaVehiculoPeñaCorderoLucia223(50);
        System.out.println("El stock actual es"+ stockActual );
    }

    private static int operativaVehiculoPeñaCorderoLucia223(int cantidad) {
        VehiculoPeñaCorderoLucia2223 miVehiculoPeñaCorderoLucia2223;
        int stockActual;
        miVehiculoPeñaCorderoLucia2223 = new VehiculoPeñaCorderoLucia2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoPeñaCorderoLucia2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoPeñaCorderoLucia2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoPeñaCorderoLucia2223.obtenerStock();
        return stockActual;
    }

}
    
