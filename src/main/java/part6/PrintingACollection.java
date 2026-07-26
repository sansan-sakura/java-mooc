
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

    public String toString(){
        String output = "The collection "+ this.name;
        if(this.elements.size()==0){
            return output + " is empty.";
        }


        output = output + " has " + this.elements.size() + (this.elements.size()==1? " element:\n" : " elements:\n");

        for(int i =0; i< this.elements.size(); i++){
            boolean isLastElement = i == this.elements.size() -1;
            output = output + this.elements.get(i) + (isLastElement? "":"\n");
        }

        return output;

    }

}
