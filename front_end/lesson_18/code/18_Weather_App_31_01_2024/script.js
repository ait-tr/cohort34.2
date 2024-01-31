const API_KEY = 'fa1e72ff893c6a4a5ed4077327e855b4';
const BASE_URL = 'https://api.openweathermap.org/data/2.5/weather';

const input = document.getElementById('locationInput');
const button = document.getElementById('getWeatherBtn');
const info = document.getElementById('weatherContainer');

button.onclick = () => {
    const cityName = input.value.trim();
    if (cityName) {
        fetch(`${BASE_URL}?q=${cityName}&appid=${API_KEY}&units=metric`)
            .then(response => response.json())
            .then(weather => console.log(weather))
    }
}