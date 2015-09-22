import utils.Const
import utils.DataImport

/**
 * Created by anatolij on 22/09/15.
 */

def imprt = new DataImport(Const.rnd)
imprt.createData()
def data = imprt.importData("data.dat")
println "Imported some data: \n ${data}"

println "\n\n\nDOING METHOD A\n\n\n"



