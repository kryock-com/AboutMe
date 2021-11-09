//Runs once at the beginning
function setup() {
  var googleSheetLink = "https://docs.google.com/spreadsheets/d/1IQB4tBGjzrSWJCumf0wqJvQQ4wLY2TcjDpk3jrz6Hr8/edit?usp=sharing";
  trivia.loadGoogleSheet(googleSheetLink).then(displayWelcome); 
}


//balloons rising to the top
function balloons() {
  background("grey")
  var sFrame = floor(frameCount / (4*height))*4*height; //starting frame for looping
  for (var i = 0; i < 30; i++) { //let's do 30 balloons
    randomSeed(10510 * i + 2); //ensures a repeatable random #
    var y = int(random(height*4) - (frameCount - sFrame)/2);
    randomSeed(30260 * i + 1); //ensures another repeatable random #
    var x = int(random(width));
    fill("red");
    line(x, y, x, y + 20);//balloon string
    ellipse(x, y, 10, 13);//balloon
  }
}


//Loops continously for background effects and animations. (p5.js)
function draw() {
  
  if (trivia.state == "welcome") background("red");
  else if (trivia.state == "question") background("orange");
  else if (trivia.state == "correct") balloons();
  else if (trivia.state == "incorrect") background("red");
  else if (trivia.state == "thankyou") background("yellow");
}

function displayWelcome() {
  $(".screen").hide();
  $("#welcome-screen").show();
}

function displayQuestion() {
  $(".screen").hide();
  $("#question-screen").show();
  $("#correctAnswer").removeClass("highlight");
  $("#feedback").hide();
  trivia.insertQuestionInfo();
  trivia.shuffleAnswers();
}

function displayThankyou() {
  $(".screen").hide();
  $("#thankyou-screen").show();
  $("#game-results").html(`Your score: ${trivia.totalCorrect}/${trivia.totalAnswered}`);
}

function onClickedAnswer(isCorrect) {
  if (isCorrect) $("#feedback").html(`Good Job you got this one correct!`).show();
  else $("#feedback").html(`Don't suck this time.`).show();
  $("#correctAnswer").addClass("highlight"); //highlight right answer
  setTimeout(trivia.gotoNextQuestion, 3000); //wait 3 secs...next question
}

function onClickedStart() {
  displayQuestion();
}
