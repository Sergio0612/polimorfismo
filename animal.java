paquete  sergy ;

        animal de clase  pública {
        cadena  privada nombre ;
        Color de cadena  privado ;
        int  privado edad ;
        Tipo de cadena  privada ;

        animal público ( nombre de la cadena  , color de la cadena , edad interna , tipo de cadena ) {

        }

        animal público () {
        }

        cadena  pública getName () {
        devolver  nombre ;
        }

public  void  setName ( nombre de la cadena  ) {
        esto _ nombre = nombre ;
        }

        Cadena  pública getColor () {
        color de retorno ;
        }

public  void  setColor ( Color de cadena  ) {
        esto _ color = color ;
        }

public  int  obtenerEdad () {
        edad de regreso ;
        }

public  void  setEdad ( edad int  ) {
        esto _ edad = edad ;
        }

        cadena  pública getType () {
        tipo de retorno ;
        }

public  void  setType ( tipo de cadena  ) {
        esto _ tipo = tipo ;
        }

        Cadena  pública a Cadena (){
        volver   "El ánimla"
        + esto _ getName ()+ "de color"
        + esto _ color + "y tiene"
        + esto _ getEdad ()+ " años" ;
        }
        conversación de cadena  pública (){
        String  s = "El animal" + this . getNombre () + "dado:" ;
        devolver  s ;
        }

        }