package com.rsk

open class Person(val name:String, var age:Int, var isMarried: Boolean = false) : Signatory {


    var partnerName: String = ""

    override fun sign() = println("$name aged $age, is married=$isMarried, can sign documents")

    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val p = Person("Sondre", 21)
            p.sign()
            p.age = 25
            p.sign()
            p.partnerName = "Anne"
            println("Partner name is ${p.partnerName}")
            p.partnerName = "AnnePanne"
            println("Partner name is ${p.partnerName}")

            val kevin = User("Kevin", 1)
            println(kevin)

            val(name, id) = kevin
            val otheruser = kevin.copy(id=2)

            println(otheruser)
        }
    }
}

class Student(name: String, age: Int): Person(name, age)

data class User(val name:String, val id:Int)

