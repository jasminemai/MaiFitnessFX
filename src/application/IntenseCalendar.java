package application;

public class IntenseCalendar extends AbstractCalendar {
	final String[] WORKOUT_ARRAY = {"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n 25 Crunches \n 25 Sit Ups \n 25 Bicycle Kicks \n1 Minute Side Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n25 Crunches \n25 Sit Ups \n25 Bicycle Kicks \n1 Minute Side Plank",
									"15 Squats \n 15 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"Rest & Cardio!",
									"10 Sit Ups \n 15 Crunches \n 15 Sit Ups \n 15 Bicycle Kicks \n 30 Second Side Plank",
									"15 Squats \n 15 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"15 Crunches \n 20 Scissor Kicks \n 1 Minute of Leg Circles \n 1 Minute Plank",
									"10 Sit Ups \n 15 Crunches \n 15 Sit Ups \n 15 Bicycle Kicks \n 30 Second Side Plank",
									"15 Squats \n 15 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"Rest & Cardio!",
									"10 Sit Ups \n 15 Crunches \n 15 Sit Ups \n 15 Bicycle Kicks \n 30 Second Side Plank",
									"15 Squats \n 15 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"15 Crunches \n 20 Scissor Kicks \n 1 Minute of Leg Circles \n 1 Minute Plank",
									"10 Sit Ups \n 15 Crunches \n 15 Sit Ups \n 15 Bicycle Kicks \n 30 Second Side Plank",
									"15 Squats \n 15 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"15 Crunches \n 20 Scissor Kicks \n 1 Minute of Leg Circles \n 1 Minute Plank",
									"Rest & Cardio!",
									"15 Squats \n 15 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"15 Crunches \n 20 Scissor Kicks \n 1 Minute of Leg Circles \n 1 Minute Plank",
									"10 Sit Ups \n 15 Crunches \n 15 Sit Ups \n 15 Bicycle Kicks \n 30 Second Side Plank",
									"15 Squats \n 15 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"15 Crunches \n 20 Scissor Kicks \n 1 Minute of Leg Circles \n 1 Minute Plank",
									"10 Sit Ups \n 15 Crunches \n 15 Sit Ups \n 15 Bicycle Kicks \n 30 Second Side Plank",
									"Rest & Cardio!",
									"15 Crunches \n 20 Scissor Kicks \n 1 Minute of Leg Circles \n 1 Minute Plank",
									"10 Sit Ups \n 15 Crunches \n 15 Sit Ups \n 15 Bicycle Kicks \n 30 Second Side Plank",
									"15 Squats \n 15 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"Rest & Cardio!"};
	public String getWorkout() {
		return WORKOUT_ARRAY[getDate() - 1];
	}

}
