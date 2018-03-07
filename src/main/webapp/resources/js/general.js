console.log("estou no javascript");

var table = document.querySelector("#finishedTasks");
var tasks = table.querySelectorAll("tr");
tasks.forEach(function(element) {
    var inicio  = new Date(element.querySelector(".start").textContent);
    var fim     = new Date(element.querySelector(".finish").textContent);
    var totalHours = element.querySelector(".totalHours");
    console.log(totalHours);
    var timeDiff = Math.abs(fim.getTime() - inicio.getTime());
    var diffHours = Math.abs(timeDiff / (1000 * 60 * 60)); 
    totalHours.textContent = diffHours.toFixed(1);
    console.log(diffHours);
});


