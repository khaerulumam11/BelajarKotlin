package co.id.belajarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        txt.setOnClickListener {
//            val toast  = Toast.makeText(this,"Toast",Toast.LENGTH_SHORT)
//            toast.show()
//        }

        txt.setOnClickListener(){ v -> showToast()}
        txt.setOnClickListener { v -> showToast()}

        val biodataUser = { a: String, b: String ->
            "Nama Saya $a dan Alamat saya $b"
        }

        dataUser("Khaerul Umam","Bandung", operation = biodataUser)

        dataUser("Khaerul Umam", "Bandung", {a, b -> "Nama Saya $a dan Alamat saya $b" })

        val names = arrayOf("xxx","xxyy","yyxx","yyyy")
        names.sorted()

        println("Names $names")

        val namesSortedByLength = names.sortedWith(compareBy { it.length })

        println("Names Sorted By Length $namesSortedByLength")

        val players = listOf("Andik","Bambang","Evan","")
        println("Nama Players $players")

        val namaMahasiswa = listOf("Khaerul","Umam")

    }

    private fun showToast() {
        val toast  = Toast.makeText(this,"Toast",Toast.LENGTH_SHORT)
            toast.show()
    }

    fun dataUser(username: String, alamat:String, operation: (String, String) -> String) : String{
        val result = operation(username,alamat)
        println(result)
        return result;
    }
}