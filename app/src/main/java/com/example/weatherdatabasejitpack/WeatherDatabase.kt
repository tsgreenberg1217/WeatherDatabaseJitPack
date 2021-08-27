package com.example.weatherdatabasejitpack

import com.example.weatherdatabasejitpack.CityDao

interface WeatherDatabase {
    fun cityDao(): CityDao
}