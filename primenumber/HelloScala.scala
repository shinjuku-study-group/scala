package something

import scala.collection.mutable.ListBuffer

object HelloScala {
  def main(args: Array[String]) {

    def getPrimeNumbers(i: Int) : Seq[Int] = {
        def canDivied(divided : Int) = {
            (2 to divided - 1).exists(division => divided % division == 0)
        }

        for (current <- 1 to i
             if(current > 1)
             if(!canDivied(current)))
            yield current
    }

    for(item <- getPrimeNumbers(50))
      print(item + " ")
  }
}

