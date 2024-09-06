import oneToOne.bidirectional.Computer
import oneToOne.bidirectional.Developer

class BootStrap {

    def init = { servletContext ->


        // OneToOne-> esi unidirectionali hamar  vor person@ tenuma passportin bayc hakarak@ che

//        def passport = new Passport(passportNumber: 'A1234567').save(flush: true)
//        def passport2 = new Passport(passportNumber: 'A1234567000').save(flush: true)
//        def person = new Person(name: 'John Doe', passport: passport).save(flush: true)


//        def fetchedPerson = Person.findByName('John Doe')
//        def fetchedPassport = Passport.findByPassportNumber('A1234567')
//
//         println "Person: ${fetchedPerson.name}, PassportId: ${fetchedPerson.passport.id}"
//
//
//        Person.findByName('John Doe')?.delete(flush: true)
//
//        println()
//
//        if(Person.findByName('John Doe')){
//            println "Person@ chi jnjve"
//        }
//        else {
//            println "Person@ jnjvea"
//        }
//
//        if (Passport.findByPassportNumber('A1234567')) {
//            print("passport@ chi jnjvel")
//        } else {
//            println("passport@ jnjvela")
//        }


        //   second case when uzum em passport@ uxaki jnjem bayc person@ mna

//        def currentPassport = Passport.findByPassportNumber('A1234567');
//        if (currentPassport) {
//            def currentPerson = Person.findByPassport(currentPassport);
//            if (currentPerson) {
//                currentPerson.passport = null;
//                currentPerson.save(flush: true)
//            }
//            passport.delete(flush: true)
//        }
//
//        person.passport = passport2;
//        println(person.passport)

//        if (Passport.findByPassportNumber('A1234567')) {
//            print("passport@ chi jnjve")
//        } else {
//            println("passport@ jnjvela")
//        }
//
//        if (Person.findByName('John Doe')) {
//            println "Person@ chi jnjve"
//            println(person.getPassport())
//        } else {
//            println "Person@ jnjvea"
//
//        }


        // OneToOne ->  esi biderctioanlai hamara erku komnel karumen tenan ianc

        def computer = new Computer(serialNumber: 'SN123456')
        def developer = new Developer(name: 'Alice',computer: computer)
        developer.save()
        computer.developer = developer
        computer.save()

        def fetchedComputer = Computer.findBySerialNumber('SN123456')
        println "Computer Serial Number: ${fetchedComputer.serialNumber}, Developer Name: ${fetchedComputer.developer.name}"

        def fetchedDeveloper = Developer.findByName('Alice')
        println "Developer Name: ${fetchedDeveloper.name}, Computer Serial Number: ${fetchedDeveloper.computer.serialNumber}"

        println('-------')

//        fetchedDeveloper.delete(flush: true)
//        def dev = Developer.findByName("Alice");
//        if(!dev){
//            println("jnjvela developer@")
//        }
//
//        def comp = Computer.findBySerialNumber('SN123456')
//        if(!comp){
//            println("jnjvela comp@")
//        }

        def currentComputer = Computer.findBySerialNumber('SN123456');
        if (currentComputer) {
            def currentDeveloper = Developer.findByComputer(currentComputer);
            if (currentDeveloper) {
                currentDeveloper.computer = null;
                currentDeveloper.save(flush: true)

            }
        }

        def secondDeveloper = new Developer(name: 'Gago');
        secondDeveloper.computer=currentComputer;
        currentComputer.developer=secondDeveloper

        println "Computer Serial Number: ${currentComputer.serialNumber}, Developer Name: ${currentComputer.developer.name}"




        println('09900')






        //OneToMany -> unidirectional  esi biderctionali nman xosq@ OneToOne-i masina etqan xndraharuyc chi
        // tes  libraryn srqir save arir heto girq@ sarqir 2 hat avelacrir listi mej save arir libraryn booker@ nuynpes saved exan qani vor
        // hasMany asosaction@ triggera anum cascadingi save operation@

//        def library = new Library(name: 'City Library').save(flush: true)
//        def book1 = new Book(title: 'The Great Gatsby')
//        def book2 = new Book(title: '1984')
//
//        library.addToBooks(book1).addToBooks(book2)
//        library.save(flush: true)
//
//        def fetchedLibrary = Library.findByName('City Library')
//        fetchedLibrary.books.each { book ->
//            println "Book Title: ${book.title}"
        //}


        //OneToMany  -bidirectional relationship

//        def department = new Department(name: 'Engineering').save(flush: true)
//        def employee1 = new Employee(name: 'John Doe', department: department).save(flush: true)
//        def employee2 = new Employee(name: 'Jane Smith', department: department).save(flush: true)
//        department.addToEmployees(employee1).addToEmployees(employee2)
//        department.save(flush: true)
//
//        def fetchedDepartment = Department.findByName('Engineering')
//        fetchedDepartment.employees.each { employee ->
//            println "Employee Name: ${employee.name}"
//        }
//        def fetchedEmployee = Employee.findByName('John Doe')
//        println "Employee: ${fetchedEmployee.name}, Department: ${fetchedEmployee.department.name}"


        // ManyToMany  bidirectional relationship

//        def garden = new Garden(name: 'Rose Garden').save(flush: true)
//        def flower1 = new Flower(name: 'Rose').save(flush: true)
//        def flower2 = new Flower(name: 'Tulip').save(flush: true)
//
//// Add flowers to the garden
//        garden.addToFlowers(flower1).addToFlowers(flower2)
//        garden.save(flush: true)
//
//// Add garden to the flowers
//        flower1.addToGardens(garden)
//        flower2.addToGardens(garden)
//        flower1.save(flush: true)
//        flower2.save(flush: true)
//
//// Fetch and print garden details
//        def fetchedGarden = Garden.findByName('Rose Garden')
//        fetchedGarden.flowers.each { flower ->
//            println "Flower Name: ${flower.name}"
//        }
//
//// Fetch and print flower details
//        def fetchedFlower = Flower.findByName('Rose')
//        fetchedFlower.gardens.each { currentgarden ->
//            println "Garden Name: ${currentgarden.name}"
//        }
    }
}

