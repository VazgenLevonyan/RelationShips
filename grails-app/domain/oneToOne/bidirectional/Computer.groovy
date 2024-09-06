package oneToOne.bidirectional

class Computer {
    String serialNumber
    //Developer developer

    static constraints = {
        serialNumber blank: false, unique: true
        developer nullable: false
    }

    static mapping = {
        developer column: 'developer_id'
    }

    //es toxov entadrvum e  vor menq kopit asac unenq en // arac propertin u esi bidirectional kapa qaniv or map keyov a belongsTo  u asum enq vor owner@ developerna  ete developer@ jnjvi coputernela hamapatasxan jnjvelu
    static belongsTo = [developer:Developer]
}

