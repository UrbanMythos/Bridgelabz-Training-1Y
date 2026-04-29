package Generics_Collections.Generic;
import java.util.*;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }

    public String toString() {
        return getMealType();
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan Meal";
    }

    public String toString() {
        return getMealType();
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto Meal";
    }

    public String toString() {
        return getMealType();
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High Protein Meal";
    }

    public String toString() {
        return getMealType();
    }
}

class Meal<T extends MealPlan> {
    T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }

    public String toString() {
        return meal.toString();
    }
}

class MealUtil {

    public static <T extends MealPlan> Meal<T> generateMeal(T mealType) {
        // validation (simple demo)
        if (mealType == null) {
            System.out.println("Invalid Meal!");
            return null;
        }
        return new Meal<>(mealType);
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealUtil.generateMeal(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                MealUtil.generateMeal(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealUtil.generateMeal(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                MealUtil.generateMeal(new HighProteinMeal());

        System.out.println("Generated Meal Plans:");
        System.out.println(vegMeal);
        System.out.println(veganMeal);
        System.out.println(ketoMeal);
        System.out.println(proteinMeal);
    }
}