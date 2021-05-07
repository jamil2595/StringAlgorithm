
import java.util.*
//this method is for sorting the given strings
fun sortString(inputString: String): String {
    val tempArray = inputString.toCharArray()
    Arrays.sort(tempArray)
    return String(tempArray)
}
//our main method
fun findTheDifference(s: String, t: String): Char {
    val sSorted = sortString(s) // s sorted
    val tSorted = sortString(t) // t sorted
    // here we add random character at the end of "t" string for checking equality of every char with "s" string
    val sFinalSorted = "$sSorted!"
    for (i in tSorted.indices) {
        if (sFinalSorted[i] != tSorted[i] && i != tSorted.length - 1) {
            // i != tSorted.length() - 1  --> means that not consider latest index because of our added random character
            return tSorted[i]
        }
    }
    //if for loop didn't execute, then return below expression
    return tSorted[tSorted.length - 1]
}
fun main(){
    println(findTheDifference("run","arun"))
    //returns 'a'
}
