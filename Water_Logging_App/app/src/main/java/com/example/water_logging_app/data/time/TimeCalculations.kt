package com.example.water_logging_app.data.time

import java.text.DateFormat
import java.util.Calendar

fun currentDate() : String {
    val date = Calendar.getInstance().time
    val dateFormat = DateFormat.getDateInstance().format(date)

    return dateFormat
}

fun currentTime() : String {
    val time = Calendar.getInstance().time
    val timeFormat = DateFormat.getTimeInstance().format(time)

    return timeFormat
}