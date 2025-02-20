fun main(){
    try {
        println("Введите x")
        var x = readLine()!!.toDouble()
        println("Введите y")
        var y = readLine()!!.toDouble()
        println("Введите z")
        var z = readLine()!!.toDouble()

        val max: Double
        val min: Double
        val l: Double
        when {
            (x >= z) -> max = x
            else -> max = z
        }

        when {
            (x <= y && x <= z) -> min = x
            (y <= x && y <= z) -> min = y
            else -> min = z
        }

        l = 2 * max - 3 * min
        println(l)
    }
    catch (e:Exception){
        println("неверный формат")
    }
}
