package com.corridor9design.c9dweather.location

import android.content.Context
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.util.Log
import java.util.Locale

class CityLookup {
    companion object {
        @JvmStatic
        fun setLongitudeLatitude(location: Location) {
            try {
                LocationCoord.lat = location.latitude.toString()
                LocationCoord.lon = location.longitude.toString()
                Log.d("location_lat", LocationCoord.lat)
                Log.d("location_lon", LocationCoord.lon)
            } catch (e: NullPointerException) {
                e.printStackTrace()
            }
        }

        @JvmStatic
        fun getCityNameUsingNetwork(context: Context, location: Location): String {
            var city = ""
            try {
                val geocoder = Geocoder(context, Locale.getDefault())
                val addresses: List<Address> = geocoder.getFromLocation(location.latitude, location.longitude, 1)
                city = addresses[0].locality
                Log.d("city", city)
            } catch (e: Exception) {
                Log.d("city", "Error to find the city.")
            }
            return city
        }
    }
}
