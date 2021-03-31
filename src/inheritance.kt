fun main() {
    var gari = Car("subaru", "legacy", "white", 25)
    gari.carry(30)
    println(gari.calculateParkingFees(5))
    var basi = Bus("toyota", "premio", "black", 54)
    println(basi.maxTripFare(200.toDouble() * basi.capacity))
    println(basi.calculate(8))
    basi.identity()
}
open class Vehicle(var make:String,var model:String,var colour:String,var capacity:Int ){
    fun carry(people: Int) {
        var x = people - capacity
        println(x)
        if (people == capacity) {
            println("carrying $people passengers")
        } else {
            println("over capacity by $x passengers")
        }
    }
        fun identity(){
            println("iam $colour $make $model")
        }
        open fun calculateParkingFees(hours: Int): Int {
            return hours * 20


    }
}

class Car( make:String, model:String, colour:String, capacity:Int):Vehicle(make,model,colour,capacity) {

    }

    class Bus( make: String,  model: String, colour: String, capacity: Int) :Vehicle(make,model,colour,capacity){
        fun maxTripFare(fare: Double): Double {
            var x = 0
            return x + fare

        }

         fun calculate(hours: Int): Int {
            return hours * capacity
        }

    }










