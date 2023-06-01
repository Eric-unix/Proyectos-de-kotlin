fun main() {
    var nombre: String? = null;
    println ("imprimiendo el valor nulo de nombre:");
    println(nombre);
    // nombre = "Gingeer";
    // println(nombre !!.length);

    // var longitud = nombre?.length ?: 0;
    // println("longitud de nombre:");
    // println(longitud);

    //var longitud = -1;

    println("----------try---------");

    try{
       var longitud = nombre?.length;
       println("longitud: $longitud");
    }catch(error:NullPointerException){
        //hubo un error, no se puede obtener la longitud del nombre
        var longitud = 0;
        println("longitud: $longitud");
    }finally{
        //println("valor de longitud: $longitud");
        println("finally");
    }

    println("Termina la prueba de try")

    // try{
    //     println("nombre: $nombre");
    // }catch( exception: NullPointerException){
    //     println("Ha ocurrio un error");
    //     println(exception);
    // }finally{
    //     println("Lo que este en ffinally se ejeccuta siempre");
    // }
}