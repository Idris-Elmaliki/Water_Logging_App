package com.example.water_logging_app
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Water_Info_Table")
data class WaterInfo(
    val amount: Int,
    val measurement : String,
    val timeOfInput : String,
    @PrimaryKey(autoGenerate = true)
    val id : Int,
)
