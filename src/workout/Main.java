package workout;


public class Main {
    // Initialize the repository
    Workout workout = new Workout("strength", 3);

    // Initialize entity
    Exercise exercise = new Exercise("Bench Press", "chest", 30);

// Print Exercise
//System.out.println(exercise); // Exercise: Bench Press, chest, 30
//
//// Add Exercise
//workout.addExercise(exercise);
//
//// Remove Exercise
//System.out.println(workout.removeExercise("Bench Press","arms")); // false
//System.out.println(workout.removeExercise("Bench Press","chest")); // true
//
////Get exercise
//System.out.println(workout.getExercise("Bench Press","chest")); // null
//
//    Exercise secondExercise = new Exercise("Deadlift", "back", 50);
//    Exercise thirdExercise = new Exercise("Barbell Curl", "biceps", 25);
//    Exercise fourthExercise = new Exercise("Squats", "legs", 60);
//    Exercise fifthExercise = new Exercise("Deadlift", "legs", 55);
//
//workout.addExercise(secondExercise);
//workout.addExercise(thirdExercise);
//workout.addExercise(fourthExercise);
//workout.addExercise(fifthExercise);
}