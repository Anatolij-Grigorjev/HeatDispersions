/**
 * Created by anatolij on 22/09/15.
 */


def imprt = new DataImport(new Random())
imprt.createData()
println "Imported some data: \n ${imprt.importData("data.dat")}"