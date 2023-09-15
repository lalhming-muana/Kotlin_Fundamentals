fun main(){
  println("Starting a new server on port: 3030")
}

/**---------------------------------------------------
 * 
 * Class define dawn hian curly brace hman tur ani
 * 
 * ---------------------------------------------------
**/
class SmartDevice{
//	  
}

fun main() {
    println("Hello, world!")
    val smartTv = SmartDevice() 
}

/**-----------------------------------------------------
 * 
 *   Class member functions and how to define and use them
 * 
 * -----------------------------------------------------
 **/

 class SmartDevice{
	  fun turnOn(){
          println("Turning on device in 2 seconds")
      }
      
      fun turnOff(){
          println("Turning off device in 2 seconds")
      }
}


fun main() {
    println("Hello, world!")
    val smartTv = SmartDevice() 
    smartTv.turnOn()
    smartTv.turnOff()
}