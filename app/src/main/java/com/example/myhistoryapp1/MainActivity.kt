package com.example.myhistoryapp1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val idhistorybutton = findViewById<Button>(R.id.idhistorybutton)
        val idclear = findViewById<Button>(R.id.idclear)
        val ageTextNumber = findViewById<EditText>(R.id.ageTextNumber)
        val idoutput = findViewById<TextView>(R.id.idoutput)
        idhistorybutton.setOnClickListener {

            /* if else statement */
            val age = ageTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                idoutput.text = "Please enter a valid age"


            } else {

                if (age < 20 || age > 100) {
                    idoutput.text = "please enter a valid age between 20 to 100"
                    ageTextNumber.text.clear()
                } else {
                    /* 10 Dead Famous People I chose */
                    val result = when (age) {
                        60 -> "Diego Armando Maradona was an Argentine professional football player and manager. Widely regarded as one of the greatest players in the history of the sport, he was one of the two joint winners of the FIFA Player of the 20th Century award."
                        95 ->  "Nelson Rolihlahla Mandela was a South African anti-apartheid activist, politician, and statesman who served as the first president of South Africa from 1994 to 1999. He was the country's first black head of state and the first elected in a fully representative democratic election."
                        47 -> "Aaron Arthur Ferguson, professionally known as Shona Ferguson, was a Motswana actor based in South Africa, executive producer and co-founder of Ferguson Films."
                        77 -> "John Witherspoon, was an American actor and comedian who performed in various television shows and films. Witherspoon played Willie Jones in the Friday series, and starred in films such as Hollywood Shuffle, Boomerang, The Five Heartbeats, and Vampire in Brooklyn."
                        36 -> "Robert Nesta Marley OM was a Jamaican reggae singer, guitarist, and songwriter. Considered one of the pioneers of the genre, Marley fused elements of reggae, ska, and rocksteady in his music and was renowned for his distinctive vocal and songwriting style."
                        61 -> "Lance Solomon Reddick was an American actor and musician. He was known for his roles as Cedric Daniels in The Wire, Phillip Broyles in Fringe and Chief Irvin Irving in Bosch. In film, he starred as Charon in the John Wick franchise and as General Caulfield in White House Down."
                        43 -> "Chadwick Boseman, One of the greatest actors in the world, known for his role as T'challa the Black Panther in the MCU Universe, black superhero."
                        56 -> "Steven Paul Jobs was an American businessman, inventor, and investor best known for co-founding the technology giant Apple Inc. Jobs was also the founder of NeXT and chairman and majority shareholder of Pixar."
                        50 -> "Micheal Jackson, the king of pop, one of the greatest musicians of all time, awarded as on of the greatest human beings to bridge social issues through music."
                        41 -> "Kobe Bean Bryant was an American professional basketball player. A shooting guard, he spent his entire 20-year career with the Los Angeles Lakers in the National Basketball Association."

                        else -> "No one Died at this age, try a different one!"

                    }
                    idoutput.text = result

                }

            }
            idclear.setOnClickListener {
                ageTextNumber.text.clear()
                idoutput.text = ""
            }



        }



    }


}