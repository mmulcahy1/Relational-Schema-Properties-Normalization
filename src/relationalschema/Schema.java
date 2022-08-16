package relationalschema;

import java.util.ArrayList;

/* A schema is made up of attributes and a list of functional dependencies */

public class Schema {
    private String name;
    private ArrayList<Attribute> attributeList;
    private ArrayList<FunctionalDependency> dependencyList;

    public Schema(String n, ArrayList<Attribute> attList, ArrayList<FunctionalDependency> depList) {
        this.name = n;
        this.attributeList = attList;
        this.dependencyList = depList;
    }

    public ArrayList<Attribute> getAttributeList() {
        return attributeList;
    }

    public ArrayList<FunctionalDependency> getDependencyList() {
        return dependencyList;
    }
}
