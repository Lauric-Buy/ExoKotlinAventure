import kotlin.random.Random

fun calculDegatArme(nbdes : Int, nbfaces : Int, qualarm : Int, activcc : Int, mltcc : Int ): Int
{
    var rsltlancer : Int =  Random.nextInt(nbdes, nbfaces * nbdes)
    if (rsltlancer == activcc)
    {
         rsltlancer = rsltlancer * mltcc
    }
   rsltlancer += qualarm
    if (rsltlancer < 0)
    {
        rsltlancer = 0
    }
    return rsltlancer

}
fun main ()
{
    println(calculDegatArme(1,6,2,6,2))
}