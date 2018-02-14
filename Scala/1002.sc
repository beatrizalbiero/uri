object 1002 {
    def main(args: Array[String]) {
        var raio = io.StdIn.readLine().toDouble
        val pi: Double = 3.14159
        raio = math.pow(raio,2)
        var res = pi*raio
        println("A=" + f"$res%.4f")
    }
}
