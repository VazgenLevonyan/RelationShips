package oneToMany.bidirectional


class Department {
    String name

    static hasMany = [employees: Employee]
    static mappedBy = [employees: 'department']

    static constraints = {
        name blank: false, unique: true
    }

    static mapping = {
        employees cascade: "all-delete-orphan"
    }
}
