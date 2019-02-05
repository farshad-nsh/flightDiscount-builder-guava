package domain;


import com.google.common.base.Strings;
import domain.enums.IATI;

/**
 * @author farshad noravesh
 * ver 1.0.0
 */
public class FlightNumber {

    private final IATI airLineName;
    private final int  operationalBaseId;
    private final int flightOperationalId;

    public FlightNumber(IATI airLineName, int operationalBaseId,int flightOperationalId) {
        if (operationalBaseId < 0 || operationalBaseId > 9999) {
            throw new IllegalArgumentException("Invalid  flightOperationalId [" + flightOperationalId + "]");
        }
        if (flightOperationalId < 0 || flightOperationalId > 99999) {
            throw new IllegalArgumentException("Invalid  flightOperationalId [" + flightOperationalId + "]");
        }
        this.airLineName = airLineName;
        this.operationalBaseId = operationalBaseId;
        this.flightOperationalId=flightOperationalId;
    }

    @Override
    public String toString() {
        return  airLineName+Strings.padStart(String.valueOf(operationalBaseId),4,'0')+
                Strings.padStart(String.valueOf(flightOperationalId), 0,'0');
    }
}
