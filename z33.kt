fun main(){
    try {
        println("Введите k")
        val k = readLine()!!.toDouble()
        println("Введите b")
        val b = readLine()!!.toDouble()
        println("Введите радиус")
        val R = readLine()!!.toDouble()

        val discr = Math.pow((2*k*b),2.0) - 4*(1+k*k)*(b*b-R*R)
        println(discr)

        when{
            (discr<0) -> println("нет точек пересечения")
            else-> when{
                (discr == 0.0) ->{
                    val x = -((2*k*b)/2*(1+k*k))
                    val y = k*x +b
                    println("Одна точка пересечения: x - ${x}, y - ${y}")
                }
                else ->{
                    val x1 = (-(2*k*b)+Math.sqrt(discr))/(2*(1+k*k))
                    val y1 = k*x1+b

                    val x2 = (-(2*k*b)-Math.sqrt(discr))/(2*(1+k*k))
                    val y2 = k*x2+b
                    println("Точки пересечения: x1 - ${x1}, y1 - ${y1}; x2 - ${x2}, y2 - ${y2}")
                }
            }
        }
    }
    catch (e: Exception){
        println("неверный формат")
    }
}
