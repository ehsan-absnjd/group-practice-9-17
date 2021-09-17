package ir.javacup.salary;

public class HrmSalaryListCreator extends SalaryListCreator{
    public HrmSalaryListCreator(Encoder encoder) {
        super(encoder);
    }

    @Override
    protected String doCreate(Employee[] employees) {
        StringBuilder result= new StringBuilder("");
        for (int i=0;i< employees.length-1;i++){
            result.append( addZeroPrefix(employees[i].getCode() , 8)).append( getItemSeparator())
                    .append( addZeroPrefix(String.valueOf(employees[i].getSalary()) , 10)).append(getRecordSeparator());
        }
        result.append(addZeroPrefix(employees[employees.length-1].getCode() , 8)).append(getItemSeparator() )
                .append(addZeroPrefix(String.valueOf(employees[employees.length-1].getSalary()) , 10));
        return result.toString();
    }
}
