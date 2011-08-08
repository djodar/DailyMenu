package dailymenu

class Shop {

    static constraints = {
		name(blank:false, maxLength: 50)
    }
	
	String name
	static hasMany = [prices:Price]
}
