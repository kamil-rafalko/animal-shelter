package com.corriel.animal.domain

import org.springframework.data.repository.CrudRepository

interface DogRepository: CrudRepository<Dog, Long>
