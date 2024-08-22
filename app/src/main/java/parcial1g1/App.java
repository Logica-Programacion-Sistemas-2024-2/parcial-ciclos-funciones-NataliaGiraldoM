
package parcial1g1;

public class App {

 public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Favor ingresar la cantidad de vehiculos: ");
            int cantidadVehiculos = sc.nextInt();
            sc.nextLine();

            float metrosVehiculo = 0f;
            float kmRecorrido = 0f;
            String consumoVehiculo = "";
            float cantidadCombustible = 0f;
            float totalCombustible = 0f; 


            for (int i = 1; i <= cantidadVehiculos; i++){

                System.out.println("Ingrese los metros recorridos por el vehiculo: " + i);
                metrosVehiculo = sc.nextFloat();

                if (metrosVehiculo < 0){
                    System.out.println("Valor inválido, favor ingresar un número correcto: ");
                }

                else { 

                kmRecorrido = metrosVehiculo / 1000;

                cantidadCombustible = calcularConsumoGasolina(kmRecorrido);

                consumoVehiculo = "\nVehículo " + i +  ": " + kmRecorrido + " km";

                System.out.println(consumoVehiculo + " ---> " + cantidadCombustible + " litros de gasolina");

                totalCombustible += cantidadCombustible;

                }

            }

            System.out.println("\nLa cantidad total de combustible fue: " + totalCombustible + " litros");
            
        } catch (Exception e) {
           System.out.println("Error");
        }
        
    }

    public static float calcularConsumoGasolina(float kmRecorrido){

        try {
            return ((kmRecorrido * 55) / 750); 

        } catch (Exception e) {
            return -1;
        }
      
    }

}
