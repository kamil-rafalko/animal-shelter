package com.corriel.animal.domain

import com.corriel.animal.domain.dto.DogDto
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Dog(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        private val id: Long = 0,
        private val name: String,
        private val age: Int,
        private val size: Size,
        private val description: String,
        private val sex: Sex,
        private val dateInserted: LocalDate,
        private val keeperEmail: String) {


    fun toDto(): DogDto {
        return DogDto(id, name, age, size, description, sex, dateInserted, keeperEmail)
    }

    companion object {
        fun fromDto(dto: DogDto): Dog {
            return Dog(
                    name = dto.name,
                    age = dto.age,
                    size = dto.size,
                    description = dto.description,
                    sex = dto.sex,
                    dateInserted = dto.dateInserted,
                    keeperEmail = dto.keeperEmail
            )
        }
    }
}

enum class Size {
    SMALL, MEDIUM, BIG
}

enum class Sex {
    MALE, FEMALE
}