package oneToOne.bidirectional

class Developer {
    String name
    Computer computer

    static constraints = {
        name blank: false
        computer nullable: true
    }

    static mapping = {
        computer column: 'computer_id'
    }
}

