fun main(){
    print(sockMerchant(7, arrayOf(1,2,1,12,3,4,1,3)))
}

//Fungsi sockMerchant untuk mencari ada berapa pasang kaus kaki
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var pair = 0
    val i = 0

    val newList = ar.toMutableList()

    while (newList.isNotEmpty()) {
        for (j in i+1 until newList.size){
            if (newList[i] == newList[j]){
                pair += 1
                newList.removeAt(j)
                break
            }
        }

        newList.removeAt(i)
    }

    return pair
}