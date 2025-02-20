fun main(){
    try {
        println("Введите k")
        val k = readLine()!!.toDouble()
        println("Введите b")
        val b = readLine()!!.toDouble()
        println("Введите a")
        val a = readLine()!!.toDouble()
        println("Введите l")
        val l = readLine()!!.toDouble()

        val discr = Math.pow((-k),2.0) - 4*a*(-b)
        println(discr)
        when{
            (discr<0) -> println("нет точек пересечения")
            else-> when{
                (discr == 0.0)->{
                    val x = k/(2*a)
                    val y = k*x+b
                    println("Точка пересечения: x - ${x}, y - ${y}")
                    when{
                        (x>=-l && x<=l && y>=-l && y<=l)-> println("Входят в квадрат")
                        else-> println("Не входят в квадрат")
                    }
                }
                else->{
                    val x1 = (k+Math.sqrt(discr))/(2*a)
                    val y1 = k*x1+b
                    println("1 точка пересечения: x1 - ${x1}, y1 - ${y1}")
                    when{
                        (x1>=-l && x1<=l && y1>=-l && y1<=l)-> println("1 точка входит в квадрат")
                        else-> println("1 точка не входит в квадрат")
                    }

                    val x2 = (k-Math.sqrt(discr))/(2*a)
                    val y2 = k*x2+b
                    println("1 точка пересечения: x1 - ${x2}, y1 - ${y2}")
                    when{
                        (x2>=-l && x2<=l && y2>=-l && y2<=l)-> println("2 точка входит в квадрат")
                        else-> println("2 точка не входит в квадрат")
                    }
                }
            }
        }
    }
    catch (e: Exception){
        println("неверный формат")
    }
}