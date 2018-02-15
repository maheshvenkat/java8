import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.stream.Stream;

public class StreamMapDemo {

    class Employee {
        private String name;
        private LocalDate empBirthDate;

        public Employee(String name,LocalDate empBirthDate) {
            this.name = name;
            this.empBirthDate = empBirthDate;
        }
    }

    public Employee[] getEmployee() {
        Employee [] employees = {
                new Employee("John", LocalDate.of(1984, Month.JANUARY,2)),
                new Employee("Mike", LocalDate.of(1986, Month.FEBRUARY,6)),
                new Employee("Amy",LocalDate.of(1980,Month.MARCH,10))

        };
        return employees;
    }

    public double calculateAvgAge(Employee [] employees) {
        Stream<Employee> stream = Stream.of(employees);
        LocalDate today = LocalDate.now();

        Stream<Period> periods = stream.map((employee)-> Period.between(employee.empBirthDate,today));
        double avgAge = periods.mapToLong((period)-> period.toTotalMonths())
                                .average().getAsDouble()/12;
        return avgAge;

    }

    public static void main(String[] args) {
        StreamMapDemo demo = new StreamMapDemo();
        Employee [] employees = demo.getEmployee();
        double age = demo.calculateAvgAge(employees);
        System.out.printf("Average Age : %2.2f\n",age);

    }

}
