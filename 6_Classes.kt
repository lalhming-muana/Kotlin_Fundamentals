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

/**
 * class properties emaw class variables siamdan leh hman dan
 * 
 */

 class SmartDevice{
  val name ="Android Tv"
  val category = "Entertainment"
  var statusCode = "Online"

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
    println("THe name of the TV is ${smartTv.name}")
    smartTv.turnOn()
    smartTv.turnOff()
}

/**
 * In the setter function, if you want a certain variable between
 * 
 * 0 and 100 you use the following code
 * 
 **/

 var speakerVolume = 2
    set(value) {
        if (value in 0..100) {
            field = value
        }
    }
