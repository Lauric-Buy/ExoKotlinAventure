import kotlin.random.Random

fun lanceDes(nbdes:Int, nbmax:Int):Int
{
    val result =  Random.nextInt(nbdes, nbmax * nbdes)
return result
}

fun main()
{
    println(lanceDes(3,6,))
}