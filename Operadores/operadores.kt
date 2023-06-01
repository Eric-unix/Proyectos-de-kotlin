fun main(){
    
    val a = 10; //inmutable
    val b = 5; //inmutable
    var c = 0; //mutable (su valor va a cambiar)

    println("Operadores");
    //suma
    c = a.plus(b);
    println("$c= $a + $b");0

    //resta
    c = a.minus(b);
    println("$c= $a - $b");

    //comparaciones
    println(a.compareTo(b)>0);
    println("$a>$b =" + (a>b));
    println("$a>$b =" + (a<b));

    // a == b
    println("a == b:");
    println(a.equals(b));

    //a != b
    println("a != b:");
    println(!(a.equals(b)));

}