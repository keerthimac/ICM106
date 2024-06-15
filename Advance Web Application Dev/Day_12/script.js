console.log("Hello");

function button03Fun() {
  console.log("button 03");
}

button04Fun = () => {
  console.log("button 04");
};

document.getElementById("button4").addEventListener("click", button04Fun);

document.getElementById("button1").addEventListener("click", () => {
  console.log("button 01");
});

document.getElementById("button2").addEventListener("click", function () {
  console.log("button 02");
});

document.getElementById("button3").addEventListener("click", button03Fun);
