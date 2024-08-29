package prototype;

public class UMLDiagramToolTest {

    private static UMLShape getUseCaseDiagramTemplate(){
        // TO DO: Create a Use Case Diagram Template
        return null;
    }

    private static UMLShape getActorTemplate(){
        // TO DO: Create an Actor Template
        return null;
    }

    private static UMLShape getUMLClassTemplate(){
        // TO DO: Create a UML Class Template
        return null;
    }

    public static UMLShapeCollection getUMLShapeCollection(){
        UMLShapeCollection shapeCollection = new UMLShapeCollection();

        // TO DO: Fill in with the corresponding UMLShape template object
        shapeCollection.addShape(UMLShapeType.BASIC_LINE, );
        shapeCollection.addShape(UMLShapeType.GENERALISATION, );
        shapeCollection.addShape(UMLShapeType.IMPLEMENTATION, );
        shapeCollection.addShape(UMLShapeType.USE_CASE, );
        shapeCollection.addShape(UMLShapeType.ACTOR, getActorTemplate());
        shapeCollection.addShape(UMLShapeType.USE_CASE_DIAGRAM, getUseCaseDiagramTemplate());
        shapeCollection.addShape(UMLShapeType.UML_CLASS, getUMLClassTemplate());

        return shapeCollection;
    }


    public static void main(String[] args) {

        // prepare a prototype register
        UMLShapeCollection shapeCollection = getUMLShapeCollection();

        // pass the register to the diagramTool
        UMLDiagramTool umlDiagramTool = new UMLDiagramTool(shapeCollection);
        umlDiagramTool.createShape(UMLShapeType.USE_CASE_DIAGRAM);
        System.out.println("------------------------------");
        umlDiagramTool.createShape(UMLShapeType.UML_CLASS);
    }
}