fun main(){
    try {
        println("Введите двузначное число")
        var a= readLine()!!.toInt()
        when(a)
        {
            in 10..99 -> {
                if (a % 10 == 8 || a / 10 == 8)
                {
                    println("Цифра 8 присутствует")
                } else {
                    println("В числе нет 8")
                }
            } else -> println("Число не двузначное")
        }
    } catch (e:Exception) { println("Что то не то")}
}