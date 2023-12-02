fun main() {

   val lst1 = arrayOf<Int>(1,3,-5,4)
   val lst2 = arrayOf<Int>(1,4,-5,-2)

   for (x in lst1.withIndex()){
      println(lst1[x.index] * lst2[x.index])
   }

}