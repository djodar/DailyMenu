package dailymenu

class Ingredient {

    static constraints = {
		name(blank:false, maxSize:50)
		prices()
    }
	
	String name
	static hasMany = [prices: Price]
	
}
