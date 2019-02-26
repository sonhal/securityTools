import com.rsk.Providers

fun main(args: Array<String>) {

    val providers = Providers()

    val details = providers.getAllProviders()

    details.forEach ( ::println)

}

//    getAllProviders{
//        key, value -> println("\t ----- $key: $value")
//    }
//}

fun getAllProviders(fn: (String, String) -> Unit) {
    val allProviders = Providers.getProviders()

    val it = allProviders.iterator()
    while (it.hasNext()) {
        val provider = it.next()
        println(it.next().name)

        provider.forEach { key, value -> fn(key.toString(), value.toString()) }
    }
}

