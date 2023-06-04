//Listas
fun main(){
    //Lista inmutable
    val readOnly : List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");

    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}");
    println("Elemento en la posicion 3: ${readOnly.get(3)}");
    println("Primer elemento de la lista: ${readOnly.first()}");
    println("Primer elemento de la lista: ${readOnly.last()}");

    //mostrar los elemento de la lista usando estructura for
    println("Elementos de readOnly");
    for(elemento in readOnly){
        println(elemento);
    }
    //mostrar los elementos de la lista usando el metodo forEach
    println("Elementos de readOnly usando forEach:")
    readOnly.forEach{
        println(it)
    }

    //Lista mutable
    var mutableList : MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles");
    println("Lista mutable: $mutableList")
    mutableList.add("Jueves");
    println("Lista mutable: $mutableList")

    //trabajando con listas mutables vacias
    var emptyList : MutableList<String> = mutableListOf();
    println("La lista esta vacia: ${emptyList.none()}");
    println("primer elemento de emptyList: ${emptyList.firstOrNull()}");
    println("primer elemento de emptyList: ${emptyList.lastOrNull()}");
    println("primer elemento de emptyList: ${emptyList.elementAtOrNull(2)}");

    //agregando elementos a emptylist
    readOnly.forEach{
        emptyList.add(it);
    }
    println("La lista que estaba vacia: $emptyList");

    //ordenar una lista
    val numerosdeloteria = listOf(11, 2,44,33,56,78,66);
    println("Numeros de loteria : $numerosdeloteria");
    val numerosOrdenados = numerosdeloteria.sorted();
    println("Numeros ordenados: $numerosOrdenados");
    val numerosDescendentes = numerosdeloteria.sortedDescending();
    println("Numeros ordenados en forma descendente: $numerosDescendentes");
    val numerosPares = numerosdeloteria.filter{num -> num % 2 ==0};
    println("Numeros pares: $numerosPares");
    

}