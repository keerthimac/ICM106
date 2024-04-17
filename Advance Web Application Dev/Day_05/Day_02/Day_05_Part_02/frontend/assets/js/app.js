async function registerStudent() {
  let txtFirstName = document.getElementById("first-name").value;
  let txtLastName = document.getElementById("last-name").value;
  let selectProvince = document.getElementById("select-province").value;
  const response = await fetch("http://localhost:8080/create-student", {
    method: "POST",
    body: JSON.stringify({
      firstName: txtFirstName,
      lastName: txtLastName,
      province: selectProvince,
    }),
    headers: {
      "Content-Type": "application/json",
    },
  })
    const data = await response.json();
    console.log(data)
}

document
  .getElementById("btn-register")
  .addEventListener("click", registerStudent);

const toastLiveExample = document.getElementById("liveToast");
  
function showSuccess (){
const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample);
toastBootstrap.show();    
}



