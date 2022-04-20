package sesion2;

public class PruebaBicicleta {
    public static void main(String[] args) {
         definir();
    }

    public static void definir() {
    //Aqui se genera la conexion de la clase bicicleta a este archivo
    bicicleta biciMountain = new bicicleta();
    //poniendo el nombre de la nueva estancia y un . estamos dando le acceso a esa estancia a todo lo de la clase bicicleta
        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);
        //Con esto se estan enviando esos datos asia la clase bicicleta mediante las fuhciones set

        //Con esto se estan obteniendo los valoes de las caracteristicas gracias a la funciones get
        String msg = "Soy una bici de montaña con estas caracteristicas: ";
        msg += "\nColor: " +biciMountain.getColor();
        msg += "\nVelocidad: " +biciMountain.getVelocidad();
        msg += "\nPins: " +biciMountain.getPins();
        msg += "\nRodada: " +biciMountain.getRodada();

        System.out.print(msg);

    }
}
