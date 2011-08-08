package dailymenu

class Ingredient {

    static constraints = {
		name(blank:false, maxSize:50)
    }
	
	String name
	static hasMany = [prices: Price]
	
}
