
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String filePath = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();

        try(Scanner fileScanner = new Scanner(new File(filePath))){
            while(fileScanner.hasNextLine()){
                String recipeName = fileScanner.nextLine();
                int cookingTime = Integer.valueOf(fileScanner.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();

                while(fileScanner.hasNextLine()){
                    String ingredient = fileScanner.nextLine();

                    if(ingredient.isEmpty()){
                        break;
                    }

                    ingredients.add(ingredient);
                }

                Recipe recipe = new Recipe(cookingTime, recipeName, ingredients);
                recipes.add(recipe);

            }

        } catch(Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while(true){

            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if(command.equals("list")){
                System.out.println("Recipes:");
                for(Recipe recipe: recipes){
                    System.out.println(recipe);

                }
            }
            if(command.equals("find name")){
                System.out.println("Searched word:");
                String word = scanner.nextLine();

                for(Recipe recipe: recipes){
                    if(recipe.getName().contains(word)){
                        System.out.println(recipe);

                    }

                }
            }
            if(command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());

                for(Recipe recipe: recipes){

                    if(recipe.getCookingTime() <= maxCookingTime){
                        System.out.println(recipe);

                    }

                }
            }
            if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String  word = scanner.nextLine();

                for(Recipe recipe: recipes){

                    ArrayList<String> indigredients = recipe.getIndegredients();
                    for(String indigredient: indigredients){
                        if(indigredient.equals(word)){
                            System.out.println(recipe);
                            return;
                        }
                    }



                }
            }

            if(command.equals("stop")){
                break;
            }
        }

    }

}
