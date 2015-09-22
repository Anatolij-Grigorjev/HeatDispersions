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

            String line = (it
            + '#' + name
            + '#' + Math.abs(rnd.nextDouble() * 157)
            + '#' + Math.abs(rnd.nextDouble() * 214)
            )
            list << line
        }

        new File("data.dat").withPrintWriter { pw -> list.each {line -> pw.println(line)} }
    }


}
