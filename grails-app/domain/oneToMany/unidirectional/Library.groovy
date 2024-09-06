package oneToMany.unidirectional

class Library {
    String name

    static hasMany = [books: Book]

    static constraints = {
        name blank: false, unique: true
    }

    //esi dra hamara vor ete library book listi mejic book@ remov exav bok@ will be deleted from db as well
    static mapping = {
        books cascade: "all-delete-orphan"
    }
}
