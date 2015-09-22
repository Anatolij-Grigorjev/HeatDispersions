/**
 * Created by anatolij on 22/09/15.
 */

def rnd = new Random()
def imprt = new DataImport(rnd)
imprt.createData()
println "Imported some data: \n ${imprt.importData("data.dat")}"

/* total amount of heat to enter the building */
Double QPS = rnd.nextDouble() * 891

