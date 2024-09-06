package oneToOne.unidirectional

class Person {
    String name
    Passport passport

    static constraints = {
        name blank: false
        passport nullable: true
    }

//the mapping block is used to specify the column name for the foreign key, though it’s optional.
//    static mapping = {
//        passport column: 'passport_id',nullable:true
//    }
}
