package com.example.kotlindevelopment

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class LogicTest  : AppCompatActivity() {

    val strJson:String = "[\n" +
            "\t{\n" +
            "\t\"name\" : \"Ravi Tamada\", \n" +
            "\t\"email\" : \"ravi8x@gmail.com\",\n" +
            "\t\"phone\" : {\n" +
            "\t\t\"home\" : \"08947 000000\",\n" +
            "\t\t\"mobile\" : \"9999999999\"\n" +
            "\t}\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\"name\" : \"Tommy\", \n" +
            "\t\"email\" : \"tommy@gmail.com\",\n" +
            "\t\"phone\" : {\n" +
            "\t\t\"home\" : \"08946 000000\",\n" +
            "\t\t\"mobile\" : \"0000000000\"\n" +
            "\t}\n" +
            "\t}\n" +
            "]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
        Log.d("Print val max val is===",""+ maxOf(6,2))
        Log.d("Print val max val is===",""+ findMax(1,2))
        // Log.d("Parse Int",""+ parseInt(10))
        print("Print val max val is==="+ maxOf(1,2))
        print("Print val max val2  is ==="+ findMax(1,2))
        product("12","3")
        product("12","Elambu")
        Log.d("Print val lengt===",""+getStringLength(879))
        Log.d("Print val describe===",""+describe("Welcome"))
        val items:List<String> = listOf("apple", "banana", "kiwifruit")
        if("banana" in items){
            Log.d("Print contain is true",""+true)
        }else {
            Log.d("Print contain is false", ""+false)
        }

        for (index:Int in items.indices) {
            Log.d("Print item",""+items.lastIndexOf("apple"))
            Log.d("Print item at","$index is ${items[index]}")
        }

        val x = 10
        val y = 9
        if (x in 1..y+1) {
            Log.d("Print range if","fits in range")
        }else{
            Log.d("Print range else","fits in range")

        }


        for (x in 40..50 step 2) {
            print(x)
        }
        println()
        for (x in 9 downTo 0 step 3) {
            print(x)
        }
        Log.d("Print val fruit===",""+ getFruits())
        Log.d("Print space===",""+ "Convert this to camelcase".spaceToCamelCase())

        val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    }

    fun String.spaceToCamelCase() {
        Log.d("Print camel","print")
    }

    fun maxOf(a: Int, b: Int) = if (a > b) a else b

    fun findMax(a:Int,b:Int) : Int {
        return a+b
    }

    fun main() {
        val str: String
    }

    fun parseInt(str: String): Int? {
        // ...
        return str.toIntOrNull()
    }

    fun product(a: String, b: String){

        val x= parseInt(a)
        val y= parseInt(b)

        if(x != null && y != null){
            Log.d("Value",""+x*y)
        }else{
            Log.d("Value","X: $x"+ "Y: $y")
        }
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }

        // `obj` is still of type `Any` outside of the type-checked branch
        return null
    }
    fun describe(obj: Any): Any =
        when (obj) {
            1808          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            is String -> product("2","3")
            is Int -> "int"
            else       -> "Unknown"
        }
    fun getFruits(): Any {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        /*  fruits
              .filter { it.startsWith("i") }
              .sortedBy { it }
              .map { it.toUpperCase() }
              .forEach { println(it) }*/

        val str:Any =  fruits.filter { it.startsWith("a")}
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach{ Log.d("Print fruit list ",""+it)}
        return str.toString()
    }
}
