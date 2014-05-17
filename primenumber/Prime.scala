/**
 * Created by simezi on 2014/05/10.
 */
object Prime {
  def main(args: Array[String]) {
    println(mkPrimeList(100).mkString)
  }

  def mkPrimeList(i: Int) = {
    val numList = (1 to i).toList
    filterList(numList)
  }

  def filterList(numList: List[Int]): List[Int] = {
    if (numList.head > numList(1)) {
      return numList.drop(1) ::: List(numList.head)
    }
    if(numList.head == 1){
      filterList(numList.drop(1))
    }
    filterList(numList.filter(_ % numList.head != 0) ::: List(numList.head))
  }
}
