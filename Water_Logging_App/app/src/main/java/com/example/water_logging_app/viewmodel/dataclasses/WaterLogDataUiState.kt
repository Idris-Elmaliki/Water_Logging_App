package com.example.water_logging_app.viewmodel.dataclasses

data class WaterLogDataList(
    val waterInfoList : List<WaterLogDataUiState> = emptyList()
)
data class WaterLogDataUiState(
    val amountOfWater : Int? = null,
    val measurementType : String? = null,
    val timeOfInput : String,
    val date : String
)