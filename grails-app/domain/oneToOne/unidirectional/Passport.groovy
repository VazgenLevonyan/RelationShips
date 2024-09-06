package oneToOne.unidirectional


class Passport {
    String passportNumber

    static constraints = {
        passportNumber blank: false, unique: true
    }

    //nayi ste unidirectionala u zut menq asum enq vor es passsport@  ter@ personna  owner enq define anum senc   esi talisa en cascading@ vor ete brnenq ia tiroj@ jnjenq esel kjnjvi
   static belongsTo = Person


    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passportNumber='" + passportNumber + '\'' +
                ", version=" + version +
                '}';
    }
}