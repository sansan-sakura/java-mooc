
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        LicensePlate comparedObj = (LicensePlate) obj;
        return this.country.equals(comparedObj.country) && this.liNumber.equals(comparedObj.liNumber);
    }

    @Override
    public int hashCode(){
        return this.country.hashCode() + this.liNumber.hashCode();
    }



}
