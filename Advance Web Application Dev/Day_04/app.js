document.getElementById("btn-register").addEventListener("click", btnRegister);

function btnRegister() {
  let firstName = document.getElementById("first-name").value;
  let lastName = document.getElementById("last-name").value;
  let province = document.getElementById("province").value;

  let requestBody = {
    firstName: firstName,
    lastName: lastName,
    province: province,
  };

  fetch("http://localhost:8080/create-student", {
    method: "POST",
    body: JSON.stringify(requestBody),
    headers: { "Content-type": "application/json" },
  }).then(res => res.json())
      .then(data=>console.log(data));
}
