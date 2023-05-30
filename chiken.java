paquete  sergy ;

        Gallo de clase  pública extiende animal {
        Gallo publico (){
        súper ();
        }
        Gallo público ( nombre de cadena  , color de cadena , edad interna , tipo de cadena ) {

        super ( nombre , color , edad , tipo );}
@ anular
public  String  talk (){ return "El animal " + super . getName ()+ "dado kikiki" ;}
        Cadena  pública a Cadena (){
        volver  "El animal" + super . obtenerNombre ()+
        "de color" + súper . obtenerColor ()+
        "tiene" + súper . obtenerEdad ()+
        "y dados" + esto . hablar ();
        }
        }