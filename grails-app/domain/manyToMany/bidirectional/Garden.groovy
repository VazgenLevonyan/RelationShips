package manyToMany.bidirectional

class Garden {
    String name

    static hasMany = [flowers: Flower]
    static belongsTo = [Flower]

    static constraints = {
        name blank: false, unique: true
    }

    static mapping = {
        flowers joinTable: [name: 'garden_flower', key: 'garden_id', column: 'flower_id']
    }
}

