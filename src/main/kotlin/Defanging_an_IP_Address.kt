class Defanging_an_IP_Address {
    companion object {
        fun defangIPaddr(address: String): String {
            return address.toCharArray().joinToString("") {
                if (it == '.')
                    "[.]"
                else
                    it.toString()
            }
        }
    }
}

fun main(args: Array<String>) {
    val result = Defanging_an_IP_Address.defangIPaddr("192.168.0.1")
    println(result)
}