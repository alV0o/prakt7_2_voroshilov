fun main(){
    try {
        println("Введите координаты точки")
        val x0 = readLine()!!.toDouble()
        val y0 = readLine()!!.toDouble()

        println("Введите координаты малого круга")
        val x1 = readLine()!!.toDouble()
        val y1 = readLine()!!.toDouble()
        val r = Math.sqrt(x1 * x1 + y1 * y1)

        println("Введите координаты большого круга")
        val x2 = readLine()!!.toDouble()
        val y2 = readLine()!!.toDouble()
        val r2 = Math.sqrt(x2 * x2 + y2 * y2)

        when {
            (r < r2) -> when {
                (x0 * x0 + y0 * y0 <= r * r) -> println("Попал")
                else -> println("Не попал")
            }

            else -> println("Неправильное кольцо")
        }
    }
    catch (e: Exception){
        println("неверный формат")
    }
}
