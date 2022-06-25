package workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Workout{
    //•	type: String
    //•	exerciseCount: int
    private String type;
    private int exerciseCount;
    private List<Exercise> exercises = new ArrayList<>();

    public Workout (String type, int exerciseCount, List<Exercise> exercises) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = exercises;
    }
    public void addExercise(Exercise exercise) {
        if (exerciseCount > exercises.size()) {
            exercises.add(exercise);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExerciseCount(int exerciseCount) {
        this.exerciseCount = exerciseCount;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
    }



    public boolean removeExercise(String name, String muscle) {
        return exercises.removeIf(exercise -> exercise.getName().equals(name) && exercise.getMuscle().equals(muscle));
    }

    public Exercise getExercise(String name, String muscle) {
        return exercises.stream().filter(e -> e.getName().equals(name) && e.getMuscle().equals(muscle)).findFirst().orElse(null);
    }

    public Exercise getMostBurnedCaloriesExercise() {
        //return this.data.stream().max(Comparator.comparing(Egg::getStrength)).orElse(null);
        return exercises.stream().max(Comparator.comparing(Exercise::getBurnedCalories)).orElse(null);
    }

    public int getExerciseCount() {
        return exercises.size();
    }

    public String getStatistics() {
        return "Workout type: " + this.type + System.lineSeparator() +
                this.exercises.stream().map(Exercise::toString).collect(Collectors.joining(System.lineSeparator()));
    }
}