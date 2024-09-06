package oneToMany.unidirectional


class Book {
    String title

    static constraints = {
        title blank: false
    }
}
