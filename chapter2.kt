/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
  var myAge=16
    if(myAge<18)
    println("You are underage")
    println("The End")
    
    if(myAge<18){
    println("You are underage")}
    else{
    println("You can watch the movie")}
    
    if (myAge<13)
    { println("You cannot watch the movie")}
	else if(myAge<18)
     { println("You can watch with parent (PG)")}
     else
     { println("You can watch the movie")}
     
     var childAge=17
    var parent=true
    if (childAge<13){
        println("You cannot watch the movie")}
     else if(childAge<18 && parent==false){
         println("You cannot watch the movie")
     }
       else if(childAge<18 && parent==true){
         println("You can watch the movie")
     }
       else
    println("You can watch the movie")
    
    var size=4
    var price=0
    when(size){
        1->price=5
        2->price=7
        3->price=10
        else->println("we dont support other size ")//default
    }
    println("Menaik")
    for (i in 0..5){//dari 0 sehingga 5,keluarkan nilai i
        println("i=$i")}
    println("Menurun")
    for (i in 5 downTo 0){
        println("i=$i")
    }
    println("Menaik tambah 2")
    for (i in 1..5 step 2){
        println("i=$i")}
    println("Menurun turun 2")
    for (i in 5 downTo 1 step 2){
        println("i=$i")}
    
    var languages=arrayOf("Ruby","Kotlin","Python","Java")
    for (item in languages){
        println(item)
    }
    for (i in 0..languages.size-1){
        println("item at index $i is ${languages[i]}")
    }
    var x1=30
    while (x1<5){
        println("x1=$x1")
        x1++
    }
    var x2=30
   do {
        println("x2=$x2")
        x2++
    }while (x2<=5)
   var x3=1
    do{println("x=$x3")
    x3++
    if (x3==4)break
    }while(x3<=5)
    
    var x4=1
    do{
        x4++
        if (x4==3)continue
        println("x4=$x4")
   
    }while(x4<=5)
    
    sayHello()
    sayGoodbye("Wan")
    sayGoodbye("Jhon")
    println(calculateBMI(170.0,70.0))
    
    
}
fun sayHello(){
        println("Hello World")
    }
fun sayGoodbye(name:String){
    println("Goodbye $name")
}
fun calculateBMI(height:Double,weight:Double):Double{
    return weight/((height/100)*(height/100))
}
