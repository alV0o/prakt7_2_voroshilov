fun main(){
    try {
        val x = readLine()!!.toDouble()
        val y = readLine()!!.toDouble()
        val e = 2.718

        println("Введите номер координат")
        val answer = readLine()!!.toInt()
        when (answer) {
            1 -> when {
                (y>0) -> when {
                    (x * x + y * y <= 4.0) -> when {
                        (x * x + y * y <= 1.0) -> println("а - не входит")
                        else -> println("а - входит")
                    }

                    else -> println("а - не входит")
                }

                else -> println("а - не входит")
            }

            2 -> when {
                (x * x + y * y <= 1.0 && y <= x / 2.0) -> println("б - входит")
                else -> println("б - не входит")
            }

            3 -> when {
                ((x * x + Math.pow((y - 1), 2.0) <= 1.0) && (y <= Math.pow((1 - x), 2.0))) -> println("в - входит")
                else -> println("в - не входит")
            }

            4 -> when {
                (x * x + y * y <= 1.0) -> when {
                    (x * x + y * y <= 0.3) -> println("г - не входит")
                    else -> println("г - входит")
                }

                else -> println("г - не входит")
            }

            5 -> when {
                (x * x + y * y <= 1.0) -> when {
                    (y >= Math.abs(x)) -> println("д - входит")
                    else -> println("д - не входит")
                }

                else -> println("д - не входит")
            }

            6 -> when {
                (y <= Math.pow(e, x)) -> when {
                    (y <= Math.pow(e, -x)) -> when {
                        (y >= x * x) -> println("е - входит")
                        else -> println("е - не входит")
                    }

                    else -> println("е - не входит")
                }

                else -> println("е - не входит")
            }

            else -> println("Нет такого варианта")

        }
    }
    catch (e:Exception){
        println("неверный формат")
    }
}
