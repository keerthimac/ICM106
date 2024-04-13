let txtPostal = document.getElementById("text-postal-code");
let btnCity = document.getElementById("btn-city");
let txtCity = document.getElementById("txt-city")

let handleCity = () => {
    let postalCode = txtPostal.value;
    fetch("http://localhost:8080/get-city/" + postalCode)
        .then(res => res.json())
        .then(data => txtCity.innerHTML = data.city);
}

btnCity.addEventListener("click", handleCity);
