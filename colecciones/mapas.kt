fun main(){
    val ladas: Map<Int, String> = mapOf(
        1 to "USA",
        34 to "España",
        52 to "Mexico",
        67 to "Colombia",
        70 to "Argentina"
    );    
    println(ladas)
    println(ladas[1])
    println()

    
    ladas.forEach(action = {(key, value) -> println("La clave lada de $value es $key")})
    println()

    println("La lada de Colombia es ${ladas.filter { it.value == "Colombia" }.keys}")
    println()

    println("Tamaño: ${ladas.size}")
    println()

    println("Claves: ${ladas.keys}")
    println("Valores: ${ladas.values}")
    println("Entradas: ${ladas.entries}")
    println("Valor de la lada 48: ${ladas.getOrDefault(48, "Pais Desconocido")}");
    println("Mapa vacio : ${ladas.isEmpty()}");
    //comprobar si existe una clave especifica en el mapa
    println("Existe la clave lada: ${86 in ladas}");
    //comprobar si existe un valor especifico en el mapa
    println("Existe el valor de Mexico en el mapa:${"Mexico" in ladas.values}");

    ladas.forEach{ (k, v) -> println("$k -> $v/")}

    //mapa mutable 
    var nums = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4
    );
    println("mapa de numeros: $nums");

    //eliminar valores del mapa
    nums.remove("two");
    
    //agregando par al mapa 
    // nums["six"] = 6
    // println("Agregar 6: $nums");
    // var sortedNums = nums.toSortedMaP();
    // println("Mapa  ordenado: $sortedNums");

    //Reto:
    //crear un diccionario español ingles usando un mapa
    //1. funcion para crear o cargar el diccionario
    //2. funcion para consulta, reciba una palabra en español
    // y que regrese su traduccion, sino existe traduccion, un valor por default
    //3. imprimir todo el diccionario

    var diccionario = mutableMapOf(
         "gato" to "cat",
         "conocer" to "know",
         "union" to "united",
         "confianza" to "trust",
         "casado" to "married",
         "amor" to "love",
         "phone" to "celular",
         "lenguaje" to "lenguage",
         "programador" to "programmer",
         "compromiso" to "commitment"
     );
     println(diccionario);
     

}                   