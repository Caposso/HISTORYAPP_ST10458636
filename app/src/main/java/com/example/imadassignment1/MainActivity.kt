package com.example.imadassignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Declare the Variables
        val clearButton = findViewById<Button>(R.id.clearButton)
        val generateButton = findViewById<Button>(R.id.generateButton)
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber1)
        val displayTextView = findViewById<TextView>(R.id.displayTextView)

        // Set onClickListener the Clear Button
        clearButton.setOnClickListener {
            editTextNumber.text.clear()

            // Set onClickListener the Generate Button
            generateButton.setOnClickListener {

                //Declare the variables values
                val messageText : String

                //We Declared a Variable and Assign the Variable to a value
                val ageText : Int = editTextNumber.text.toString().toInt()

                // Using If Statements we putting a range to the User
                if (ageText < 20) {
                    messageText = "The age is out of range. Please enter a number between 20-100"
                } else if (ageText > 100) {
                    messageText = "The age is out of range. Please enter a number between 20-100"
                    //
                } else if (ageText == 56) {
                    messageText = "You are 56 which is the same age as Abraham Lincoln. Abraham Lincoln was an American lawyer, politician, and statesman, who served as the 16th president of the United States."
                } else if (ageText == 73) {
                    messageText = "You are 73 which is the same age as Charles Darwin. Charles Darwin was an English naturalist, geologist and biologist, widely known for his contributions to evolutionary biology."
                } else if (ageText == 54) {
                    messageText = "You are 54 which is the same age as Christopher Columbus. Christopher Columbus was an Italian explorer and navigator from the Republic of Genoa who completed four Spanish-based voyages across the Atlantic Ocean."
                } else if (ageText == 76) {
                    messageText = "You are 76 which is the same age as Albert Einstein. Albert Einstein was a German-born theoretical physicist who is widely held to be one of the greatest and most influential scientists of all time."
                } else if (ageText == 67) {
                    messageText = "You are 67 which is the same age as Leonardo da Vinci. Leonardo da Vinci was an Italian polymath active as a painter, draughtsman, engineer, scientist, theorist, sculptor, and architect."
                } else if (ageText == 84) {
                    messageText = "You are 84 which is the same age as Isaac Newton. Isaac Newton was an English polymath active as a mathematician, physicist, astronomer, alchemist, theologian, and author."
                } else if (ageText == 39) {
                    messageText = "You are 39 which is the same age as Martin Luther King Jr. Martin Luther Kng Jr was an American Christian minister, activist, and political philosopher who was one of the most prominent leaders in the civil rights movement."
                } else if (ageText == 58) {
                    messageText = "You are 58 which is the same age as Andy Warhol. Andy Warhol was an American visual artist, film director, producer, and leading figure in the pop art movement."
                } else if (ageText == 55) {
                    messageText = "You are 55 which is the same age as Julius Cesar. Julius Cesar was a Roman general and statesman, member of the First Triumvirate. Caesar led the Roman armies in the Gallic Wars."
                } else if (ageText == 88) {
                    messageText = "You are 88 which is the same age as Charles Chaplin. Charles Chaplin was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film."
                } else {
                    messageText = "There is no Historical Figure known to be around $ageText years old"
                }
                displayTextView.text = messageText






            }
        }


    }

}


