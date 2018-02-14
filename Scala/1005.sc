object 1005 {
    def main(args: Array[String]) {
        var A = io.StdIn.readLine().toDouble
        var B = io.StdIn.readLine().toDouble
        A = A*3.5
        B = B*7.5
        var SOMA: Double = A + B
        var Media: Double = SOMA/11.0
        println("MEDIA = " + f"$Media%.5f")
    }
}
