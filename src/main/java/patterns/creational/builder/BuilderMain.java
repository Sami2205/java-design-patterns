package patterns.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {

        ObjectToBuild.Builder builder = new ObjectToBuild.Builder();

        ObjectToBuild objectToBuild = builder.var1("Var1 Value").var2("Var2 Value").var3("Var3 Value").var4("Var4 Value").build();

        System.out.println(objectToBuild);

    }

}
