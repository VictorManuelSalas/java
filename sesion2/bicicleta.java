package sesion2;

//Aqui se define el objeto,aqui se modela un objeto llamada bicicleta y se esta encapsulando.

public class bicicleta {
    /*
    Public se puede acceder de manera universal a las clases, variables y métodos que hemos creado.

    Protected es accesible desde los métodos definidos en las clases que pertenecen al mismo paquete, al igual que hemos visto con private.
    Pero, además es accesible desde cualquier función de cualquier subclase, es decir, de las clases que heredan donde se han definido.

    Private indica que sólo está accesible a los métodos de la misma clase en la que la variable o método se ha declarado.
    */


    //Caracteristicas
    public int pins, rodada;
    public double velocidad;
    public String color;

    //Cuando se usa el public y tipo de datos, la funcion neceista un return.
    //Pero si se pone un void este no necesita retornar nada.

    //Metodos
    public double getVelocidad(){  return velocidad;  }
    public int getPins(){  return pins;  }
    public int getRodada(){  return rodada;  }
    public String getColor(){  return color;  }

    /*
    public void setRodada(int rodada){
        this.rodada = rodada;
    }
    */

    //Se usa el booleano para saber si arroja un true o false este metodo
    public boolean setPins(int pins){
        //El pins gris es el que se obtiene desde otro lado
        if(pins > 0){
            //El this es para dar enfasis a la variable declarada en este archivo
            this.pins = pins;
            return true;
        }else
            return false;
    }

    public boolean setRodada(int rodada){
        if (rodada > 0){
            this.rodada = rodada;
            return true;
        }else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }

    public  boolean setColor(String color){
        //Empty sig cuando esta vacio, pero se usa el ! para decir que si no esta vacio
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return false;
    }
    //asta aqui es un pojo o clase pura

    public String printState(){
        return "pins: " +pins+"/n"+
                "rodada: " +rodada+"/n"+
                "velocidad: " +velocidad+"/n"+
                "color: " +color;
    }
}
