import kotlin.random.Random

// I lost the rest of the coding we did during class when I tried to transfer this file to Github. I remade the two functions below.

fun main (args: Array<String>){
    val index = arrayOf(1, 3, 4, 2)
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    var x = 0
    var y: Int
    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1
    }
}

fun main () {
    val adjective = arrayOf("attractive", "bald", "beautiful", "chubby", "clean", "dazzling", "drab", "elegant", "fancy", "fit")
    val noun = arrayOf("backbone", "house", "Melissa", "mouth", "clock", "hammer", "movie", "class", "eyeball", "park")
    val verb = arrayOf("approves", "abstains", "aims", "agrees", "accuses", "borrows", "beats", "blames", "composes", "escapes")
    val adverb = arrayOf("accidentally", "angrily", "happily", "sadly", "purposefully", "ignorantly", "slowly", "quickly", "loudly", "quietly")

    var adj = Random.nextInt(9) + 0
    var n = Random.nextInt(9) + 0
    var adv = Random.nextInt(9) + 0
    var v = Random.nextInt(9) + 0

    val phrase = "The ${adjective[adj]} ${noun[n]} ${adverb[adv]} ${verb[v]}."
    print("phrase")
}