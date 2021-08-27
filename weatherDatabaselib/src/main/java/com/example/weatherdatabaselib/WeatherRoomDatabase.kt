package com.example.weatherdatabaselib

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.datalib.models.CityWeatherCache


@Database(entities = [CityWeatherCache::class], version = 1)
@TypeConverters(Converters::class)
abstract class WeatherRoomDatabase : RoomDatabase(), WeatherDatabase
