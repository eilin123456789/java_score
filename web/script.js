function checkGrade() {
    let name = document.getElementById("name").value;
    let score = document.getElementById("score").value;

    fetch(`http://localhost:8081/grade?name=${name}&score=${score}`)
        .then(res => res.json())
        .then(data => {
            document.getElementById("result").innerHTML =
                `${data.name} got grade: <b>${data.grade}</b>`;
        })
        .catch(err => {
            document.getElementById("result").innerText = "Error contacting server.";
        });
}