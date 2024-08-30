package prototype;

import java.util.*;

public class UMLDiagramToolTest {


    private static UMLShape getUseCaseTemplate(){
        // TO DO: Create a Use Case Template
        return new Ellipse(30.00, 15.00, "use case");
    }

    private static UMLShape getBasicLineTemplate(){
        // TO DO: Create a BasicLine Template
        return new Line("solid", "none", "none");
    }


    private static UMLShape getImplementationTemplate(){
        // TO DO: Create a Implementation Template
        return new Line("dashed", "triangle", "none");
    }


    private static UMLShape getGeneralisationTemplate(){
        // TO DO: Create a Generalisation Template
        return new Line("solid", "triangle", "none");
    }


    private static UMLShape getUseCaseDiagramTemplate(){
        // TO DO: Create a Use Case Diagram Template
        ArrayList<UMLShape> shapes = new ArrayList<UMLShape>();
        shapes.add(getActorTemplate());
        ArrayList<UMLShape> systemBoundary = new ArrayList<>();
        systemBoundary.add(new Box(1000.00, 1500.00));
        systemBoundary.add(getUseCaseTemplate());
        systemBoundary.add(getUseCaseTemplate());
        Container container = new Container(systemBoundary, "System Boundary");
        shapes.add(container);
        return new Container(shapes, "Use Case Diagram");
    }

    private static UMLShape getActorTemplate(){
        // TO DO: Create an Actor Template
        List<UMLShape> shapes = new ArrayList<UMLShape>();
        Line line = new Line("solid", "none", "none");
        shapes.add(new Ellipse(30.00, 30.00));
        shapes.add(line);
        for (int i = 1; i <= 4; i ++) {
            shapes.add(line.clone());
        }
        return new Container(shapes, "Actor");
    }

    private static UMLShape getUMLClassTemplate(){
        // TO DO: Create a UML Class Template
        ArrayList<UMLShape> shapes = new ArrayList<UMLShape>();
        shapes.add(new Box(50.00, 20.00, "ClassName"));
        shapes.add(new Box(50.00, 50.00, "- variableExample: int"));
        shapes.add(new Box(50.00, 50.00, "+ methodExample(arg: String): void"));
        return new Container(shapes, "UML Class");
    }


    public static UMLShapeCollection getUMLShapeCollection(){
        UMLShapeCollection shapeCollection = new UMLShapeCollection();

        // TO DO: Fill in with the corresponding UMLShape template object
        shapeCollection.addShape(UMLShapeType.BASIC_LINE, getBasicLineTemplate());
        shapeCollection.addShape(UMLShapeType.GENERALISATION, getGeneralisationTemplate());
        shapeCollection.addShape(UMLShapeType.IMPLEMENTATION, getImplementationTemplate());
        shapeCollection.addShape(UMLShapeType.USE_CASE, getUseCaseTemplate());
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