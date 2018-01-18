package com.corriel.animal.rest

import com.corriel.animal.domain.DogRegistryService
import com.corriel.animal.domain.dto.DogDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/dogs")
@CrossOrigin(origins = [ "*" ])
class DogRegistryController(private val dogRegistryService: DogRegistryService) {

    @PostMapping
    fun addDog(@RequestBody dogDto: DogDto): ResponseEntity<DogDto> =
            dogRegistryService.addDog(dogDto)
                .let { ResponseEntity(it, HttpStatus.CREATED) }

    @PutMapping("/{id}")
    fun updateDog(@PathVariable id: String, @RequestBody dogDto: DogDto) =
            dogRegistryService.updateDog(id, dogDto)

    @DeleteMapping("/{id}")
    fun deleteDog(@PathVariable id: String): ResponseEntity<Void> =
        dogRegistryService.deleteDog(id)
                .let { ResponseEntity(HttpStatus.NO_CONTENT) }

    @GetMapping
    fun getDogs(): List<DogDto> = dogRegistryService.getDogs()

}