public class CourseWork {
    private final Employee[] employees = new Employee[5];

    public static void main(String[] args) {

        employees[0] = new Employee(fullName:"Иванов Иван Иванович", Salary:100);

        employees[0] = new Employee(fullName:"Иванов Иван Иванович", Salary:200);

        employees[0] = new Employee(fullName:"Иванов Иван Иванович", Salary:300);

        employees[0] = new Employee(fullName:"Иванов Иван Иванович", Salary:400);

        employees[0] = new Employee(fullName:"Иванов Иван Иванович", Salary:500);

        System.out.println(Arrays.toString(employees));
    }

    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
            }
            sum += employee.getSalary();
        }

        return sum;
    }

    public static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = =null;
        for (Employee employee : employee) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                target Employee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee findEmployee(String name, int department) {
        for (Employee employee : employee) {
            if (employee != null && employee.getFullName.equals(name)) {
                return employee;
            }
        }
        public static void setEmployee Salary(String name, int salary){
            for (Employee employee : employees) {
                if (employee != null && employee.getFullName().equals(name)) {
                    employee.setSalary(salary);
                    return null;
                }
                public static void setEmployeeSalary (String name, int salary){
                    Employee targetEmployee = find Employee (name);
                    if (targetEmployee != null){
                        targetEmployee. setSalary (salary);
                    }

                    public static void setEmployeeCapartment (String name, int department){
                        Employee targetE,Employee = findEmployee (name);
                        if (targetEmployee !=null){
                            targetEmployee. setDepartment(department);
                        }
                        public static String removeDuplicates (String[] strings){
                            StringDuilder builder = new StringBuilder();
                            for (int i = string.length - 1; i>=0; i--){
                                String target = strings[i];
                                boolean duplicateFound = false;
                                for (int i = i-1; i >= 0; i--){
                                    if (target. equals (Stribgs[j])) {
                                        duplicateFound = true;
                                        break;
                                    }
                                    return.bulder.toString();
                                }
                                public static int [] incrementAndSlice int [] arr){
                                    int[] slice = new int[5];
                                    int j = 0;
                                    for (int i = 0; i < arr.length; i++) {
                                        if (arr[i] % 2 == 0) {
                                            arr[i] += 1;
                                        }
                                        if (i >= 2 && 1 <= 6) {
                                            slice[i] = arr[i];
                                            j++;
                                        }
                                    }
                                    return slice;
                                }
                                public static int [] incrementAndSlice (int[] arr){
                                    int [] slice = new int [5];
                                    int j = 0;
                                    for (int i=0; i < arr.length; i++){
                                        if (arr [] % 2 == 0){
                                            arr [i] += 1;
                                        }
                                        if (i >= 3) && i <= 7){
                                            slice [j] = arr [i];
                                            j ++;
                                        }

                                        int []arr = new int [] {1,2,3,4,5,6,7,8,9,10};
                                        System.out.println (Arrays.teString incrementAndSlice (arr));
                                        String [] string = newString[] ("one", "one", "three", "one");
                                        Arreys.sort (employees. Comparator. comporingInt (Employee: :getSalary));
                                        retutn slice;
                                    }
                                    public static String [] removeDuplicates (String [] string){
                                        String [] stringWithhoutDuplicates = new String [String.length];
                                        int k=0;
                                        for (int i = string.length - 1; i--){
                                            String target = String [i];
                                            boolean duplicateFound = false;
                                            for (int j = i-1; j >= 0; j --){
                                                if (target.equals (Strings [j])){
                                                    duplicateFound = true;
                                                    break;
                                                }
                                            }
                                            if ( duplicateFound){
                                                StringWithoutDuplicates [k] = target;
                                                k++;
                                            }
                                        }
                                        return StringWithoutDuplicates;
                                    }
