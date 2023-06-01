//primer programa en kotlin
//fun main() {
 //   println("Hola mundo Kotlin");
//}

fun main(){
    //un val es un valor inmutable
    val veces= 35;
    val border ="*~*"; 

    printBorder(1, 30);
    println("Hola mundo Kotlin");
    printBorder(5, 30 );
    println();
    println("En este programa, el caracter de borde es: ${border}");
    println("Y se imprime ${veces} veces");
}

// fun printBorder(numero: Int, caracter: String){
//     repeat(numero){
//         print(caracter);
//     }
//     println();
// }

fun printBorder(tipocaracter: Int, numero: Int){
    when( tipocaracter){
    1->
        repeat(numero){
            print('*');
        }
    2 ->
        repeat(numero){
            print('_')
        }
    3-> 
        repeat(numero){
            print('&')
        }
        else -> repeat(numero){
            print('#')
        }
    }
    println();
}
