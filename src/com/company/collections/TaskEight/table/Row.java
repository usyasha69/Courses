package com.company.collections.TaskEight.table;

import java.util.HashMap;

public class Row implements Comparable<Row> {
    private HashMap<String, String> name;
    private HashMap<String, String> math;
    private HashMap<String, String> physics;
    private HashMap<String, String> geometry;

    public Row(HashMap<String, String> name, HashMap<String, String> math
            , HashMap<String, String> physics, HashMap<String, String> geometry) {
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.geometry = geometry;
    }

    public HashMap<String, String> getName() {
        return name;
    }

    public void setName(HashMap<String, String> name) {
        this.name = name;
    }

    public HashMap<String, String> getMath() {
        return math;
    }

    public void setMath(HashMap<String, String> math) {
        this.math = math;
    }

    public HashMap<String, String> getPhysics() {
        return physics;
    }

    public void setPhysics(HashMap<String, String> physics) {
        this.physics = physics;
    }

    public HashMap<String, String> getGeometry() {
        return geometry;
    }

    public void setGeometry(HashMap<String, String> geometry) {
        this.geometry = geometry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Row row = (Row) o;

        if (!name.equals(row.name)) return false;
        if (!math.equals(row.math)) return false;
        if (!physics.equals(row.physics)) return false;
        return geometry.equals(row.geometry);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + math.hashCode();
        result = 31 * result + physics.hashCode();
        result = 31 * result + geometry.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Name: " + name.get("Name") + "; Math: " + math.get("Math")
                + "; Physics: " + physics.get("Physics") + "; Geometry: "
                + geometry.get("Geometry");
    }

    @Override
    public int compareTo(Row o) {
        int mathResult = Integer.parseInt(math.get("Math")) - Integer.parseInt(o.getMath().get("Math"));

        int physicsResult = Integer.parseInt(physics.get("Physics"))
                - Integer.parseInt(o.getPhysics().get("Physics"));

        int geometryResult = Integer.parseInt(geometry.get("Geometry"))
                - Integer.parseInt(o.getGeometry().get("Geometry"));

        return mathResult + physicsResult + geometryResult;
    }
}
