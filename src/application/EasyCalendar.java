package application;
/*
 * Array of strings indicating workout
 */
public class EasyCalendar extends AbstractCalendar {
	final String[] WORKOUT_ARRAY = {"15 Crunches \n20 Scissor Kicks \n1 Minute of Leg Circles \n1 Minute Plank",
									"10 Sit Ups \n15 Crunches \n15 Sit Ups \n15 Bicycle Kicks \n30 Second Side Plank",
									"15 Squats \n15 Lunges \n20 Donkey Kicks \n1 Minute Plank",
									"15 Crunches \n20 Scissor Kicks \n1 Minute of Leg Circles \n1 Minute Plank",
									"10 Sit Ups \n15 Crunches \n15 Sit Ups \n15 Bicycle Kicks \n30 Second Side Plank",
									"15 Squats \n15 Lunges \n20 Donkey Kicks \n1 Minute Plank",
									"Rest & Cardio!",
									"15 Crunches \n20 Scissor Kicks \n1 Minute of Leg Circles \n1 Minute Plank",
									"10 Sit Ups \n15 Crunches \n15 Sit Ups \n15 Bicycle Kicks \n30 Second Side Plank",
									"15 Squats \n15 Lunges \n20 Donkey Kicks \n1 Minute Plank",
									"15 Crunches \n20 Scissor Kicks \n1 Minute of Leg Circles \n1 Minute Plank",
									"10 Sit Ups \n15 Crunches \n15 Sit Ups \n15 Bicycle Kicks \n30 Second Side Plank",
									"15 Squats \n15 Lunges \n20 Donkey Kicks \n1 Minute Plank",
									"Rest & Cardio!",
									"15 Crunches \n20 Scissor Kicks \n1 Minute of Leg Circles \n1 Minute Plank",
									"10 Sit Ups \n15 Crunches \n15 Sit Ups \n15 Bicycle Kicks \n30 Second Side Plank",
									"15 Squats \n15 Lunges \n20 Donkey Kicks \n1 Minute Plank",
									"15 Crunches \n20 Scissor Kicks \n1 Minute of Leg Circles \n1 Minute Plank",
									"10 Sit Ups \n15 Crunches \n15 Sit Ups \n15 Bicycle Kicks \n30 Second Side Plank",
									"15 Squats \n15 Lunges \n20 Donkey Kicks \n1 Minute Plank",
									"Rest & Cardio!",
									"15 Crunches \n20 Scissor Kicks \n1 Minute of Leg Circles \n1 Minute Plank",
									"10 Sit Ups \n15 Crunches \n15 Sit Ups \n15 Bicycle Kicks \n30 Second Side Plank",
									"15 Squats \n15 Lunges \n20 Donkey Kicks \n1 Minute Plank",
									"15 Crunches \n20 Scissor Kicks \n1 Minute of Leg Circles \n1 Minute Plank",
									"10 Sit Ups \n15 Crunches \n15 Sit Ups \n15 Bicycle Kicks \n30 Second Side Plank",
									"15 Squats \n15 Lunges \n20 Donkey Kicks \n1 Minute Plank",
									"Rest & Cardio!",
									"10 Sit Ups \n15 Crunches \n15 Sit Ups \n15 Bicycle Kicks \n30 Second Side Plank",
									"15 Squats \n15 Lunges \n20 Donkey Kicks \n1 Minute Plank",
									"Rest & Cardio!",};

	public String getWorkout() {
		return WORKOUT_ARRAY[getDate() - 1];
		
	}
}
