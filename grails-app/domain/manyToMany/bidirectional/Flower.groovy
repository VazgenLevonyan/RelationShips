package manyToMany.bidirectional

class Flower {
    String name

    static hasMany = [gardens: Garden]

    static constraints = {
        name blank: false, unique: true
    }

    static mapping = {
        gardens joinTable: [name: 'garden_flower', key: 'flower_id', column: 'garden_id']
    }
}