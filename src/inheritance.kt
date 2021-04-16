fun main(){
    var b=Car("subaru","KBC 347","bluish",7)
    b.carry(7)
    b.identity()
    println(b.calculateParkingFee(2))
    var d=Bus("Nissan","prado","white",56)
    println(d.maxTripFare(580.00))
}
class Car( make:String,model:String, colour:String, capacity:Int):vihecle (make,model,colour,capacity){}
open class vihecle(var make:String,var model:String,var colur:String,var capacity:Int){
    fun carry(people:Int){
        var x = capacity - people
        if (capacity >= people) {
            println("carry $people passengers")
        }
        else (people >= capacity)
        println("overcapacity by $x passenger")
    }
    fun identity(){
        println("I am a $make $model crush")
    }
    open fun calculateParkingFee(hours:Int):Int{
        var a = hours * 20
        return a
    }
}
class Bus(make:String,model:String,colour:String,capacity:Int):vihecle(make,model,colour,capacity){
    fun maxTripFare(fare:Double):Double{
        var maxi=0
        return maxi+fare
    }
    override fun calculateParkingFee(hours:Int):Int{
        return hours*capacity
    }
}