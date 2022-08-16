package relationalschema;

import java.util.ArrayList;

/* FunctionalDependency has two lists of attributes: one on from which the dependency starts, and one
from which the dependency goes to
For example, the dependency X -> Y would have a fromList of [X] and a toList of [Y]
 */

public class FunctionalDependency {
    private ArrayList<Attribute> fromList;
    private ArrayList<Attribute> toList;

    public FunctionalDependency(ArrayList<Attribute> fList, ArrayList<Attribute> tList) {
        this.fromList = fList;
        this.toList = tList;
    }

    public ArrayList<Attribute> getFromList() {
        return fromList;
    }

    public ArrayList<Attribute> getToList() {
        return toList;
    }
}
