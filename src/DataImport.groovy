import model.Record

/**
 * Created by anatolij on 22/09/15.
 */
class DataImport {

    private static final String[] names = [
            "Lance", "Simon",
            "Jorge", "Paul",
            "Ellen", "Alvarez",
            "Harvey", "Barker",
            "Colleen", "Hill",
            "Emma", "Richards",
            "Felipe", "Keller",
            "Sonja", "Ortega",
            "Simon", "Wilkerson",
            "Lucy", "Fleming",
            "Johnathan", "Rivera",
            "Santos", "Jordan",
            "June", "Nichols",
            "Armando", "Garner",
            "Debra", "Nguyen",
            "Ignacio", "Silva",
            "Emilio", "Myers",
            "Luz", "Newman",
            "Lynn", "Tate",
            "Rogelio", "Grant",
            "Ronald", "Mccarthy",
            "Jimmy", "Young",
            "Cornelius", "Powell",
            "Joyce", "Phelps",
            "Evan", "Gomez",
            "Mack", "Coleman",
            "Desiree", "Castro",
            "Jeannette", "Perkins",
            "Janet", "Hunter",
            "Nicholas", "Jennings",
            "Ray", "Holland",
            "Chad", "Morgan",
            "Francis", "Rhodes",
            "Darla", "Phillips",
            "Gretchen", "Crawford",
            "Heather", "Gonzalez",
            "Clinton", "Gill",
            "Ralph", "Watson",
            "Frank", "Estrada",
            "Dean", "George",
            "Rudy", "Martinez",
            "Don", "Bowman",
            "Lucas", "Robinson",
            "Susan", "Roberson",
            "Donald", "Mckinney",
            "Nellie", "Wells",
            "Kim", "Graham",
            "Ada", "Owen",
            "Abraham", "Reynolds",
            "Clara", "Wilson"
    ]
    Random rnd

    public DataImport(Random rnd) {
        this.rnd = rnd
    }

    def createData() {

        def list = []

        (78 + rnd.nextInt(55)).times {
            def size = names.size()
            def name = names[rnd.nextInt((int)(size / 2) * 2)] + ' ' + names[rnd.nextInt(size)]
            def reading = Math.abs(rnd.nextDouble() * 157)
            String line = ((it + 1)
            + '#' + name
            + '#' + reading
            + '#' + (reading + Math.abs(rnd.nextDouble() * 34))
                    + '#' + Math.abs(rnd.nextDouble() * 88)
            )
            list << line
        }

        new File("data.dat").withPrintWriter { pw -> list.each {line -> pw.println(line)} }
    }

    List<Record> importData(String path) {
        def records = [] as List<Record>
        new File(path).eachLine("UTF-8") { line ->
            String[] splits = line.split('#')

            def record = new Record(id: Long.parseLong(splits[0])
                    , name: splits[1]
                    , prevReading: Double.parseDouble(splits[2])
                    , curReading: Double.parseDouble(splits[3])
                    , areaOwned: Double.parseDouble(splits[4]))
            record.with {
                difference = Math.abs(curReading - prevReading)
            }
            records << record
        }

        records
    }
}
