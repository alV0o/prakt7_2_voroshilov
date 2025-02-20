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
                    when{
                        (x>0 && y>0) -> println("Точка пересечения в 1 координатной четверти")
                        else -> println("Точек пересечения в 1 координатной четверти нет")
                    }
                }
                else ->{
                    var count = 0
                    val x1 = (-(2*k*b)+Math.sqrt(discr))/(2*(1+k*k))
                    val y1 = k*x1+b
                    when{
                        (x1>0 && y1>0)->count++
                    }
                    val x2 = (-(2*k*b)-Math.sqrt(discr))/(2*(1+k*k))
                    val y2 = k*x2+b
                    when{
                        (x2>0 && y2>0)->count++
                    }
                    println("Точки пересечения: x1 - ${x1}, y1 - ${y1}; x2 - ${x2}, y2 - ${y2}")
                    println("Точек пересечения в 1 координатной четверти - ${count}")
                }
            }
        }
    }
    catch (e: Exception){
        println("неверный формат")
    }
}
