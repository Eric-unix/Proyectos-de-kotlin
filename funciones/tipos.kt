//usando funciones que regresan valores
//y funciones que no regresan valores

fun main(){

    val numero1 = 45;
    val numero2 = 9;
    borde("=", 35);
    var resultado = suma(numero1 ,numero2);
    println(resultado);
    borde("*", 35);


    //Ejemplo 1 de funcion anonima
    val slogan = {r : Int -> println("Tu puedes con $r problemas y mas")};

    //invocar funcion anonima - forma 1
    slogan(resultado);
    
    val resta = {n1: Int, n2:Int -> n1 - n2};
    println("resta: ${resta(12,18)}");

    //completar 
    //funcion anonima que encuentre el mayor de tres numeros 

    val max = {n1: Int, n2:Int, n3:Int -> ~}
    println("valor maximo:");

    //funcion anonima que calcule el promedio de tres numeros

val promedio = {n1: Int, n2:Int, n3:Int -> (n1+n2+n3)/3}
println("Promedio:${promedio(9,9,9)}");
}

fun borde(caracter: String, veces: Int){
    for(i in 1..veces){
        print(caracter)
    }
    println();
}

fun suma(n1:Int, n2: Int):Int{
    return n1 + n2;

}

