package android.compose.learn.wiggles.data

import android.compose.learn.wiggles.R
import android.compose.learn.wiggles.model.Dog
import android.compose.learn.wiggles.model.Gender
import android.compose.learn.wiggles.model.Owner

object FakeDogDatabase {
    private val owner = Owner(
        "Medarda",
        "Developer & Pet Lover",
        R.drawable.owner
    )

    val puppies = listOf(
        Dog(
            id = 0,
            name = "Rafik",
            age = 3.5,
            gender = Gender.MALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.almost_shaka,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),Dog(
            id = 1,
            name = "Shaka",
            age = 3.5,
            gender = Gender.MALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.angry_one,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),Dog(
            id = 2,
            name = "Hiena",
            age = 3.5,
            gender = Gender.MALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.blue_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            id = 3,
            name = "Funny",
            age = 3.5,
            gender = Gender.FEMALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.funny_one,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),Dog(
            id = 4,
            name = "Tufa",
            age = 3.5,
            gender = Gender.MALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.licking,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),Dog(
            id = 5,
            name = "Rafik",
            age = 3.5,
            gender = Gender.MALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.my_buddy,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            id = 6,
            name = "Rafik",
            age = 3.5,
            gender = Gender.FEMALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.on_the_pillow,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),  Dog(
            id = 7,
            name = "Rafik",
            age = 3.5,
            gender = Gender.FEMALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.pantera,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),  Dog(
            id = 8,
            name = "Rafik",
            age = 3.5,
            gender = Gender.FEMALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.serious,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),  Dog(
            id = 9,
            name = "Rafik",
            age = 3.5,
            gender = Gender.FEMALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.shaka_lover,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),  Dog(
            id = 10,
            name = "Rafik",
            age = 3.5,
            gender = Gender.FEMALE,
            color = "Brown",
            weight = 12.9,
            location = "389m away",
            R.drawable.suprised_one,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
    )
}