int fib(int n) {
	if ((n == 1) || (n == 2)) {
	return 1
	} else {
		int result = fib(n-1) + fib(n-2)
		return result
	}
}

print "Which number in the fibonacci sequence do you wish to view: " 
String s = System.console().readLine()
int n = Integer.parseInt(s)
println "The number is " + fib(n)