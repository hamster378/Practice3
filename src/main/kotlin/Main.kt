import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
   //z1
    val myAge = 18
    val isTeenager = (13<myAge) && (myAge<19)

    //z2
    val theirAge = 30
    val bothTeenagers = isTeenager && ((13<theirAge)&&(19>theirAge))

    //z3
    val reader = "Sofia Oze"
    val author = "Richard Lucas"
    val authorIsReader = reader == author

    //z4
    val  readerBeforeAuthor = reader<author

    //z5
    val myAge2 = 18
    if ((13<myAge2) && (myAge2<19)) {

        println("Задание5: подросток")
    }
    else {

        println("не подросток")
    }

    //z6
    val answer = if ((13<myAge2) && (myAge2<19)) "Задание6:подросток" else "не подросток"
    println(answer)

    //z7
    var counter = 0
    while (counter < 10) {

        var x = counter
        counter+=1

    }
    //z8
    var counter2 = 0
    var roll = 0
    do {

        roll = Random.nextInt(0,5)
        counter2+=1
        println("После $counter2 бросков, roll равен $roll")

    }
    while ( roll !== 0)

    //z9
    val range = 1 .. 10
    var square = 0
    for (i in range){

        square = i*i
        print("квадрат числа = ")
        println(square)

    }

    //z10
    for (i in range){

        square = sqrt(i.toDouble()).toInt()
        print("корень числа = ")
        println(square)

    }

    //z11
    var sum = 0
    for (row in 1 until 8 step 2) {
        for (column in 0 until 8) {

            sum += row * column
            print("сумма =")
            println(sum)
        }
    }


}