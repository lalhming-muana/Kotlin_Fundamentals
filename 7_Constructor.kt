/**
 * 
 Default constructor
 
 A default constructor is a constructor without parameters. You can define a default constructor as shown in this code snippet:
 * 
 */

class SmartDevice constructor() {
   // code goes here
}

/**
 Kotlin aims to be concise, so you can remove the constructor keyword if there are no annotations or visibility modifiers, which you learn about soon, on the constructor. You can also remove the parentheses if the constructor has no parameters as shown in this code snippet:
 */

class SmartDevice {
    // some code here
}



/**
  parameterized constructor
  
  example is shown below

 */
class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
   
}



fun main(){
    val smartTvDevice = SmartDevice("Android phone", "Entertainment",0)
    println("Device name is: ${smartTvDevice.name}")
    println("Device category is: ${smartTvDevice.category}")
    println("Device Status is: ${smartTvDevice.deviceStatus}")
    
}
/**
 * 
 * 
 */