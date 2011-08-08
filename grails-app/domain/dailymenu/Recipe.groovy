package dailymenu

class Recipe {

    static constraints = {
		name(blank:false, maxSize:50)
		dateCreated()
		preparationTime()
    }
	
	String name
	Date dateCreated
	
	/*
	 * Preparation time in minutes
	 */
	int preparationTime
	
	static hasMany = [items:RecipeIngredient]
}
