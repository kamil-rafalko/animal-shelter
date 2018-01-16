package com.corriel.animal.domain.dto

import com.corriel.animal.domain.Sex
import com.corriel.animal.domain.Size
import java.time.LocalDate

class DogDto(val id: Long?,
             val name: String,
             val age: Int,
             val size: Size,
             val description: String,
             val sex: Sex,
             val dateInserted: LocalDate,
             val keeperEmail: String)