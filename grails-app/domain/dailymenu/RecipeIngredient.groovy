package dailymenu

class RecipeIngredient {

    static constraints = {
    }
	
	static belongsTo = [ingredient:Ingredient]
	Integer quantity
	String description
}
