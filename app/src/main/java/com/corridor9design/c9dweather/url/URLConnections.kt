package com.corridor9design.c9dweather.url

class URL {
    private var link: String = "https://api.openweathermap.org/data/3.0/onecall?exclude=minutely&lat=" +
            LocationCoord.lat + "&lon=" + LocationCoord.lon + "&appid=" + LocationCoord.API_KEY

    fun getLink(): String {
        return link
    }

    companion object {
        private var cityUrl: String? = null

        fun setCityUrl(cityName: String) {
            cityUrl = "https://api.openweathermap.org/geo/1.0/direct?&q=$cityName&appid=${LocationCoord.API_KEY}"
        }

        fun getCityUrl(): String? {
            return cityUrl
        }
    }
}