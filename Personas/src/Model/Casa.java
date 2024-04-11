package Model;
import java.util.*;

/**
 Representa una casa del mundo real
 
 */
public class Casa {

	   private String Direccion;
	    private int numHabitaciones;
	    private int metrosCuadrados;
    public Casa() {
    }

    /**
     * 
     */
 

    /**
     * Constructor que recibe como parametros la direccion, el numero de habitaciones y los metros cuadrados
     * @param direccion    						La direccion de la casa
     * @param numHabitaciones   			El numero de habitacione de la casa
     * @param metrosCuadrados			Los metros cuadrados de la casa
     */
    public  Casa(String direccion, int numHabitaciones, int metrosCuadrados) {
        this.Direccion= direccion;
        this.numHabitaciones = numHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
    }

    /**
     * @return obtener direccion
     */
    public String getDireccion() {
       
        return this.Direccion;
    }

    /**
     * @return  obtener num de habitaciones de la casa
     */
    public int getNumHabitaciones() {
        
        return this.numHabitaciones;
    }

    /**
     * @return los metros cuadrados de la casa
     */
    public int getMetrosCuadrados() {
        
        return this.metrosCuadrados;
    }

    /**
     *  direccion de la casa
     */
    public void setDireccion(String direccion) {
        this.Direccion=direccion;
    }

    /**
     * @param numHabitaciones  El numero de habitaciones de la casa
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones=numHabitaciones;
    }

    /**
     * @param metrosCuadrados obtener los metros cuadrados de la casa
     */
    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados=metrosCuadrados;
    }

    /**
     * @return una cadena con la direccion, el numero de habitaciones y los m cuadrado de la casa
     */
    public String toString() {
        return Direccion + " " + numHabitaciones + " " + metrosCuadrados;
    }

}