package dailymenu

/**
 * Price of an ingredient in a shop
 */
class IngredientShop {

    static constraints = {
		shop()
		ingredient()
		price(min:0.0)
    }
	
	BigDecimal price
	
	/*
	 * Units: could be anything, items, grams, liter
	 */
	String units
	
	static belongsTo = [ingredient: Ingredient, shop: Shop] 
}
