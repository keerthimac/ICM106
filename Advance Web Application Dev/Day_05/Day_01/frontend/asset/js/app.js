function register() {
  let firstName = document.getElementById("txtFirstName").value;
  let lastName = document.getElementById("txtLastName").value;
  let age = document.getElementById("txtAge").value;


  let requestBody = {
    firstName: firstName,
    lastName: lastName,
    age: age,
  };

  fetch("http://localhost:8080/create-student", {
    method: "POST",
    body: JSON.stringify(requestBody),
    headers: {
      "Content-type": "application/json",
    },
  })
    .then((response) => response.json())
    .then((data) => console.log(data));
}

let btnRegister = document.getElementById("btnRegister");
btnRegister.addEventListener("click", register);
