package com.example.weatherdatabaselib

import com.example.weatherdatabaselib.CityDao

interface WeatherDatabase {
    fun cityDao(): CityDao
}