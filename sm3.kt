fun main(){
    try{
        println("Введите возраст первого друга")
        var x= readLine()!!.toInt()
        println("Введите возраст второго друга")
        var y= readLine()!!.toInt()
        when(x){
            in 7..16 -> println("У первого друга школьный возраст")
            else -> println("У первого друга не школьный возраст")
        }
        when(y){
            in 7..16 -> println("У второго друга школьный возраст")
            else -> println("У второго друга не школьный возраст")
        }
    }catch (e:Exception){println("Что то не то")}
}