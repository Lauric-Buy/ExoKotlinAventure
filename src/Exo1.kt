fun calculDefenseTotal(defperso:Int ,typearmur:Int,rarete:Int ):Int
{
    var resultat:Int = 0
    resultat = resultat + defperso + typearmur + rarete
    return resultat
}

fun main()
{
    println(calculDefenseTotal(3,2,1))
}