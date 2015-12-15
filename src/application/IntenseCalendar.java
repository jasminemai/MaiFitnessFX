package application;

public class IntenseCalendar extends AbstractCalendar {
	final String[] WORKOUT_ARRAY = {"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n 25 Crunches \n 25 Sit Ups \n 25 Bicycle Kicks \n1 Minute Side Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n25 Crunches \n25 Sit Ups \n25 Bicycle Kicks \n1 Minute Side Plank",
									"20 Squats \n 25 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"Rest & Cardio!",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n 25 Crunches \n 25 Sit Ups \n 25 Bicycle Kicks \n1 Minute Side Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n25 Crunches \n25 Sit Ups \n25 Bicycle Kicks \n1 Minute Side Plank",
									"20 Squats \n 25 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"Rest & Cardio!",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n 25 Crunches \n 25 Sit Ups \n 25 Bicycle Kicks \n1 Minute Side Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n25 Crunches \n25 Sit Ups \n25 Bicycle Kicks \n1 Minute Side Plank",
									"20 Squats \n 25 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"Rest & Cardio!",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n 25 Crunches \n 25 Sit Ups \n 25 Bicycle Kicks \n1 Minute Side Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Crunches \n25 Scissor Kicks \n1.5 Minutes of Leg Circles \n1 Minute Plank",
									"20 Sit Ups \n25 Crunches \n25 Sit Ups \n25 Bicycle Kicks \n1 Minute Side Plank",
									"20 Squats \n 25 Lunges \n 20 Donkey Kicks \n 1 Minute Plank",
									"Rest & Cardio!",
									"25 Crunches \n 25 Scissor Kicks \n 2 Minute of Leg Circles \n 2 Minute Plank",
									"20 Sit Ups \n 25 Crunches \n 25 Sit Ups \n 25 Bicycle Kicks \n 1 Minute Side Plank",
									"25 Squats \n 25 Lunges \n 25 Donkey Kicks \n 1 Minute Plank",
									"Rest & Cardio!"};
	public String getWorkout() {
		return WORKOUT_ARRAY[getDate() - 1];
	}

}
