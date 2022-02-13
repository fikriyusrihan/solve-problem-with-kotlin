fun main(){
    print(pageCount(7,3))
}

fun pageCount(n: Int, p: Int): Int {

    var pageCounterFromFront = 0
    var pageCounterFromBack = 0
    var leftPage = 0
    var rightPage = 0

    //Hitung dari depan
    leftPage = 0
    rightPage = 1
    while (leftPage != p && rightPage != p){
        pageCounterFromFront++
        leftPage += 2
        rightPage += 2
    }

    //Hitung dari belakang
    if (n % 2 != 0){
        leftPage = n - 1
        rightPage = n

        while (leftPage != p && rightPage != p){
            pageCounterFromBack++
            leftPage -= 2
            rightPage -= 2
        }

    } else {
        leftPage = n-2
        rightPage = n-1

        if (n == p) {
            pageCounterFromBack = 0
        } else {
            pageCounterFromBack = 1
            while (leftPage != p && rightPage != p){
                pageCounterFromBack++
                leftPage -= 2
                rightPage -= 2
            }
        }
    }

    return if (pageCounterFromFront <= pageCounterFromBack){
        pageCounterFromFront
    } else {
        pageCounterFromBack
    }
}