package oneToMany.bidirectional


class Employee {
    String name
    Department department

    static belongsTo = [department: Department]

    static constraints = {
        name blank: false
    }

    static mapping = {
        department column: 'department_id'
    }
}