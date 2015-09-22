package model

/**
 * Created by anatolij on 22/09/15.
 */
class Record {

    String name
    Long id
    Double prevReading
    Double curReading
    Double difference
    Double areaOwned

    @Override
    public String toString() {
        return """\
Record{
    name='$name',
    id=$id,
    prevReading=$prevReading,
    curReading=$curReading,
    difference=$difference
}"""
    }
}
