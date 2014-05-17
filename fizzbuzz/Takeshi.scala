package exercise

/**
 *   なんか偉い人が考えた問題
 *   ルールは以下の通り
 *       1から順番に数を表示する
 *       その数が3で割り切れるなら"Fizz"、5で割り切れるなら"Buzz"、両方で割り切れるなら"FizzBuzz"と表示する
 *   要するに"1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz ･･･"と出力される
 *   プログラマかどうかがわかるんだとさ
 *
 *   実行例
 *
 *   1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34
 */
object Takeshi {
  def main(args: Array[String]) {
    def f(i:Int):String = i match{
        case i if i % 15 == 0 => "FizzBuzz"
        case i if i % 3 == 0 => "Fizz"
        case i if i % 5 == 0 => "Buzz"
        case _ => i.toString
    }

    (1 to 35).map(f).foreach((s:String)=>{print(s + " ")})
  }
}

