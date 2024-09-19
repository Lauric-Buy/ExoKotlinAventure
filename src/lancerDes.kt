import kotlin.random.Random


fun lancerDes(nbdes: Int, nbfaces: Int): Int {
    return Random.nextInt(nbdes, nbfaces * nbdes)
}