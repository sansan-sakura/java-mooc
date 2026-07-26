
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest(){
        if(this.elements.size() == 0){
            return null;
        }
        String returnString = this.elements.get(0);
        for(String ele : this.elements){
            if(ele.length()>returnString.length()){
                returnString = ele;
            }
        }
        return returnString;
    }

}
