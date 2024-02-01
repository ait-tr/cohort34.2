const API_KEY = "fa1e72ff893c6a4a5ed4077327e855b4";
const BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

const input = document.getElementById("locationInput");
const button = document.getElementById("getWeatherBtn");
const info = document.getElementById("weatherContainer");

button.onclick = () => {
  const cityName = input.value.trim();
  if (cityName) {
    fetch(`${BASE_URL}?q=${cityName}&appid=${API_KEY}&units=metric`)
      .then((response) => response.json())
      .then((weather) => displayWeather(weather));
  };
  input.value = '';
};

// const example = {
//   main: {
//     temp: 5,
//   },
//   weather: [
//     {
//       description: "clear sky",
//     },
//   ],
//   wind: {
//     speed: 5,
//   },
// };

function displayWeather({
  main: { temp },
  weather: [{ description }],
  wind: { speed },
  name: cityName, // alias
}) {
  info.innerHTML = `
        <h2 class="mb-3">${cityName}</h2>
        <p>Temperature: ${temp} °C</p>
        <p>Description: ${description}</p>
        <p>Wind speed: ${speed} m/s</p>
    `;
}