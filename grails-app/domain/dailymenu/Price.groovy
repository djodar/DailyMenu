package dailymenu

/**
 * Price of an ingredient in a shop
 */
class Price {

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
	Shop shop
	
	static belongsTo = [ingredient: Ingredient] 
}
