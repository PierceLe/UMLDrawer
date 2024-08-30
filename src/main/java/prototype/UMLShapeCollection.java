package prototype;

import java.util.*;

public class UMLShapeCollection {
    private final Map<UMLShapeType, UMLShape> collection = new HashMap<>();

    public void addShape(UMLShapeType type, UMLShape shape) {
        /***
         * TO DO
         */
        collection.put(type, shape);
    }

    public UMLShape getShape(UMLShapeType type) {
        /***
         * TO DO
         */
        return collection.get(type);
    }
}
