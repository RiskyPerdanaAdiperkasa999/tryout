fun main() {
println("***SORTING***")
var arr = intArrayOf(4,9,7,5,8,9,3)
var tmp : IntArray = intArrayOf(0)
var swap = 0
var arrSize = arr.size - 2
var maxLoop = (arr.size/2)-1

for(j in 0..maxLoop){
  for(i in 1..arrSize){
  if(arr[i]>arr[i+1]){
    tmp[0] = arr[i]
    arr[i] = arr[i+1]
    arr[i+1] = tmp[0]
    swap++
    print("${swap}. [${arr[i]},${arr[i+1]}] -> ")
    arr.forEach { print("${it} ") }
    println()
  }
  if(arr[i-1]>arr[i]){
     tmp[0] = arr[i]
    arr[i] = arr[i-1]
    arr[i-1] = tmp[0]
    swap++
    print("${swap}. [${arr[i-1]},${arr[i]}] -> ")
    arr.forEach { print("${it} ") }
    println()
  }
}

}
println("\nJumlah swap: "+swap)
println("\n***BASIC FUNCTION***")

fun hello( name: String? ){
  when (name)
  {
    "john" -> println("Hello, John!")
    "aliCE" -> println("Hello, Alice!")
    null -> println("Hello, World!") //name tidak memiliki nilai
    "" -> println("Hello, World!") //name berisi string kosong
  }
}

hello("john")
hello("aliCE")
hello("")
hello(null)

println("\n***BASIC ALGORITHM***")
fun multiplicationTable(n : Int){
  var mArr = arrayOf<Array<Int>>()
  var maxLoopMT = n-1
  var mtpl : Int = 1

  for(i in 0..maxLoopMT){
    var array = arrayOf<Int>()
    for(j in 1..n){
      array += j*mtpl
    }
    mArr += array
    mtpl++
  }

  for (array in mArr) {
    for (value in array) {
        print("$value ")
    }
    println()
	}
}
multiplicationTable(3)

println("\n***STRING MANIPULATION***")


}
