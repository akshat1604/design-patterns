package decorator;

public class DecoratorDriver {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator dataSourceDecorator = new EncryptionDecorator(new FileDataSource("output.txt"));
        dataSourceDecorator.writeData(salaryRecords);
        System.out.println(dataSourceDecorator.readData());
    }
}
