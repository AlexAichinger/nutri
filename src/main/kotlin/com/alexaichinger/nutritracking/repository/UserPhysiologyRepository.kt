package com.alexaichinger.nutritracking.repository

import com.alexaichinger.nutritracking.model.physiology.UserPhysiology
import org.springframework.data.mongodb.repository.MongoRepository

interface UserPhysiologyRepository : MongoRepository<UserPhysiology, String>
