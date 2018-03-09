var table = document.querySelector("#finishedTasks");
var tasks = table.querySelectorAll("tr");
tasks.forEach(function(element) {
    var inicio  = new moment(element.querySelector(".start").textContent,'DD/MM/YYYY HH:mm:ss');
    var fim     = new moment(element.querySelector(".finish").textContent,'DD/MM/YYYY HH:mm:ss');
    var totalHours = element.querySelector(".totalHours");
    var timeDiff = fim.diff(inicio,'minutes');
    var hoursDiff = timeDiff/60;
    totalHours.textContent = hoursDiff.toFixed(1);
});

