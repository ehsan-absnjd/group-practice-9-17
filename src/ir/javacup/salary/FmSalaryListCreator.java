package ir.javacup.salary;

public class FmSalaryListCreator extends SalaryListCreator{
    public FmSalaryListCreator(Encoder encoder) {
        super(encoder);
    }

    @Override
    protected String doCreate(Employee[] employees) {
        StringBuilder result= new StringBuilder("");
        for (int i=0;i< employees.length-1;i++){
            result.append(addZeroPrefix(String.valueOf(employees[i].getSalary()) , 10)).append(getItemSeparator())
                    .append(addZeroPrefix(employees[i].getCode() , 10)).append(getRecordSeparator());
        }
        result.append(addZeroPrefix(String.valueOf(employees[employees.length-1].getSalary()) , 10)).append(getItemSeparator())
                .append(addZeroPrefix(employees[employees.length-1].getCode() , 10));
        return result.toString();
    }
}
