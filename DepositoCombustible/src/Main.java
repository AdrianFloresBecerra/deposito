/**
 * Main class of the Java program. 
 * 
 * @author IES Severo Ochoa team
 * @since 2018-01
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        // create the tank
        DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
        // La capacidad del dep�sito
        System.out.println("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
        // El nivel del dep�sito
        System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
        // Est� vac�o el dep�sito?
		System.out.println("El dep�sito est� vacio? " + tank.estaVacio());
		// Est� por la mitad el dep�sito?
		System.out.println("Est� por la mitad el dep�sito? " + tank.estaPorLaMitad());
		// Llenar dep�sito con par�metros del m�todo
		tank.fill(30.9);
	    System.out.println("Cu�ntos litros hemos llenado? " + tank.getDepositoNivel() + " liters.");
	    // Consumir con par�metros del m�todo
	 	tank.consumir(26.9);
	 	System.out.println("Cu�nto queda de dep�sito despu�s del consumo? " + tank.getDepositoNivel() + " liters.");
    }
}