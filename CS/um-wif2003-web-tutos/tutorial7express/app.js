var express = require("express");
var app = express();

app.listen(3000, function () {
  console.log("Server is running on http://localhost:3000");
});

app.get("/", function (req, res) {
  res.send("Hi there, welcome to my Tutorial 7 solution!");
});

app.get("/speak/:animal", function (req, res) {
  var sounds = {
    chicken: "Cluck",
    cow: "Moo",
    dog: "Woof Woof!",
  };
  var animal = req.params.animal.toLowerCase();
  var sound = sounds[animal];
  res.send("The " + animal + " says '" + sound + "'");
});

app.get("/repeat/:word/:times", function (req, res) {
    var word = req.params.word;
    var times = Number(req.params.times);
    var result = "";
    for (var i = 0; i < times; i++) {
        result += word + " ";
    }
    res.send(result);
});

app.get("/average", function (req, res) {
    var scores = [90, 98, 89, 100, 100, 86, 94];
    var average = calculateAverage(scores);
    console.log(average);
    res.send("A request to calculate average");
});

app.get("*", function (req, res) {
    res.send("Sorry, page not found...What are you doing with your life?");
});

function calculateAverage(testScores) {
    var sum = 0;
    for (var i = 0; i < testScores.length; i++) {
        sum += testScores[i];
    }
    return sum / testScores.length;
}

