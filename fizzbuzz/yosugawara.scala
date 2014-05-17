object yosugawara {
	def main(args: Array[String]) {
		fizzbuzz(30)
	}
	
	def fizzbuzz(number: Int) = {
		if (number % 15 == 0) {
			println("fizzbuzz")
		} else if (number % 3 == 0) {
			println("fizz")
		} else if (number % 5 == 0) {
			println("buzz")
		}
	}
}