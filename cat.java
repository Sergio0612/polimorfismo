paquete  sergy ;

        gato de clase  pública extiende animal {

        Gato público (){

        }
        gato público ( nombre de la cadena  , color de la cadena , edad interna , tipo de cadena ) {

        super ( nombre , color , edad , tipo );
        }
@ anular

public  String  talk (){ return  "El animal " + super . getNombre ()+ "dice miau" ;}

        Cadena  pública a Cadena (){
        volver  "El animal" + super . obtenerNombre ()+
        "de color" + súper . obtenerColor ()+
        "tiene" + súper . obtenerEdad ()+
        "y dados" + esto . hablar ();
        }

        }