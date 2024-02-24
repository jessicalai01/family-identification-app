package family.identity.app;

public class Main {
    private static final NewDataType newDataType = new NewDataType();
    public static void main(String[] args) {
        newDataType.add("abc");
        System.out.println(newDataType);
        createNewData("list");
    }
    public static NewDataType createNewData(String dataType){
        if("list".equalsIgnoreCase(dataType)){
            return new NewDataType();
        }
        return null;
    }
}
