package com.example.myfavbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateBooks()
    }

    private fun populateBooks() {
        val book1 = Books(
            R.drawable.allquiteontheweasternfront,
            "Erich Maria Remarque",
            "ALL QUIET ON THE WEASTERN FRONT",
            "All Quiet on the Western Front tells the story of a group of young Germans who enlist in World War I after being captivated by slogans of patriotism and honor. It is narrated by the protagonist, Paul Baumer, who is 20 years old"
        )

        bookList.add(book1)

        val book2 = Books(
            R.drawable.thesorcerersstone,
            "J.K. Rowling",
            "HARRY POTTER AND THE SORCERER'S STONE",
            "Harry Potter's life is miserable. His parents are dead and he's stuck with his heartless relatives, who force him to live in a tiny closet under the stairs. But his fortune changes when he receives a letter that tells him the truth about himself: he's a wizard. A mysterious visitor rescues him from his relatives and takes him to his new home, Hogwarts School of Witchcraft and Wizardry."
        )

        bookList.add(book2)

        val book3 = Books(
            R.drawable.chamberofsecrets,
            "J.K. Rowling",
            "HARRY POTTER AND THE CHAMBER OF SECRETS,",
            "Ever since Harry Potter had come home for the summer, the Dursleys had been so mean and hideous that all Harry wanted was to get back to the Hogwarts School for Witchcraft and Wizardry. But just as he’s packing his bags, Harry receives a warning from a strange impish creature who says that if Harry returns to Hogwarts, disaster will strike."
        )

        bookList.add(book3)

        val book4 = Books(
            R.drawable.orderofthephoenix,
            "J.K. Rowling",
            "HARRY POTTER AND THE ORDER OF THE PHOENIX",
            " There is a door at the end of a silent corridor. And it’s haunting Harry Potter's dreams. Why else would he be waking in the middle of the night, screaming in terror?\n"
        )

        bookList.add(book4)

        val book5 = Books(
            R.drawable.halfbloodprince,
            "J.K. Rowling",
            "HARRY POTTER AND THE HALF BLOOD PRINCE",
            "The war against Voldemort is not going well; even Muggle governments are noticing. Ron scans the obituary pages of the Daily Prophet, looking for familiar names. Dumbledore is absent from Hogwarts for long stretches of time, and the Order of the Phoenix has already suffered losses."
        )

        bookList.add(book5)

        val book6 = Books(
            R.drawable.thegreatgatsby,
            "F. Scott Fitzgerald",
            "THE GREAT GATSBY",
            "The Great Gatsby, F. Scott Fitzgerald's third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers. The story is of the fabulously wealthy Jay Gatsby and his new love for the beautiful Daisy Buchanan, of lavish parties on Long Island at a time when The New York Times noted 'gin was the national drink and sex the national obsession,' it is an exquisitely crafted tale of America in the 1920s.\n"
        )

        bookList.add(book6)

        val book7 = Books(
            R.drawable.thehobbit,
            "J.R.R Tolkien",
            "THE HOBBIT",
            "First published over 50 years ago, J.R.R. Tolkien's 'The Hobbit' has become one of the best-loved books of all time. Now Tolkien's fantasy classic has been adapted into a fully painted graphic novel."
        )

        bookList.add(book7)

        val book8 = Books(
            R.drawable.fellowshipofthering,
            "J.R.R Tolkien",
            "THE LORD OF THE RINGS THE FELLOWSHIP OF THE RINGS",
            "One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkeness bind them."
        )

        bookList.add(book8)

        val book9 = Books(
            R.drawable.thetwotowers,
            "J.R.R Tolkien",
            "THE LORD OF THE RINGS THE TWO TOWERS",
            "Frodo and his Companions of the Ring have been beset by danger during their quest to prevent the Ruling Ring from falling into the hands of the Dark Lord by destroying it in the Cracks of Doom. They have lost the wizard, Gandalf, in a battle in the Mines of Moria. And Boromir, seduced by the power of the Ring, tried to seize it by force. While Frodo and Sam made their escape, the rest of the company was attacked by Orcs. Now they continue the journey alone down the great River Anduin—alone, that is, save for the mysterious creeping figure that follows wherever they go."
        )

        bookList.add(book9)

        val book10 = Books(
            R.drawable.returnoftheking,
            "J.R.R Tolkien",
            "THE LORD OF THE RINGS THE RETURN OF THE KING",
            "In the third volume of The Lord of the Rings trilogy the good and evil forces join battle, and we see that the triumph of good is not absolute. The Third Age of Middle-earth ends, and the age of the dominion of Men begins."
        )

        bookList.add(book10)
    }
}