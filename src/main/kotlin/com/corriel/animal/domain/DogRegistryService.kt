package com.corriel.animal.domain

import com.corriel.animal.domain.dto.DogDto
import org.springframework.stereotype.Service

@Service
class DogRegistryService(private val dogRepository: DogRepository) {

    fun addDog(dto: DogDto): DogDto {
        val dog = Dog.fromDto(dto)
        dogRepository.save(dog)
        return dog.toDto()
    }

    fun updateDog(id: String, dto: DogDto): DogDto {
        val dog = Dog.fromDto(dto)
        val dogWithId = dog.copy(id = id.toLong())
        dogRepository.save(dogWithId)
        return dogWithId.toDto()
    }

    fun deleteDog(id: String) {
        dogRepository.delete(id.toLong())
    }

    fun getDogs(): List<DogDto> =
            dogRepository.findAll()
                    .map { it.toDto() }

}