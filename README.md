# MaiFitnessFX
JavaFX Fitness Application that monitors user's weight and calorie intake. As well as a daily workout routine that are categorized by difficulty level.

#Features:
Workouts & tips to keep up motivation! 

#Minor Bugs
Basically the minor bugs are when the user clicks on the “create user” or “log in” button, it doesn’t close out the GUI and I’ve tried basically everything and got all the help I could get, within the Main.java, you can see the code that I used:
	Stage stage = (Stage) logInButton.getScene().getWindow();
	stage.close();
Which was recommended/suggested by many people, but however whenever a method comes after it, it doesn’t actually close, but if it was a regular print statement, it does, confusing, I know. I even tried using a delayed timer in order for it to close and then run the methods, but that didn’t work either. Another bug is that if the user creates an account, documents calories, or documents weight, it overwrites what’s within the file. I’ve tried to check if the file existed or not, but nothing was really working.

#Future:
I wish to further develop this program by having it all through JavaFx/GUI instead of running through the console. As well as the little kinks, like closing the stage and checking if the files are existent.
