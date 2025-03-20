public class Main {
    public static void main(String[] args) {
       
        Computer computer1 = new Computer("16GB", "1TB", "Intel i7");
        Computer computer2 = new Computer("8GB", "512GB", "Intel i5");

        String[] hodNames = {
            "Dr. Farooq Ahmad", "Mr. Shahid Bhatti", "Mr. Abdul Karim Shahid", "Dr.Jawad Shafi", 
            "Mr. Imran Raza", "Miss Muntaha Iqbal", "Miss Iqra Obaid", "Dr. Rao Muhammad Adeel Nawab", 
            "Dr. Tariq Javaid", "Mr. Naveed Aslam"
        };

        
        Person[] inCharges = new Person[10];
        for (int i = 0; i < 10; i++) {
            inCharges[i] = new Person(hodNames[i], "Head of Department " + (i + 1));
        }

      
        Department[] departments = new Department[10];
        for (int i = 0; i < 10; i++) {
            Lab[] labs = new Lab[5]; 
            for (int j = 0; j < 5; j++) {
                labs[j] = new Lab("Lab " + ((i * 5) + (j + 1)), 25, "Block " + (char) ('A' + i) + ", Room " + (101 + j), new Computer[]{computer1, computer2});
            }
            departments[i] = new Department("Department " + (i + 1), "Block " + (char) ('A' + i), "Lahore", labs, inCharges[i]);
        }

        
        Campus campus = new Campus("COMSATS University Lahore", departments);

        System.out.println("Campus Name: " + campus.getCampusName());

        for (int i = 0; i < departments.length; i++) {
            System.out.println("\nDepartment: " + departments[i].getName());
            System.out.println("Address: " + departments[i].getAddress());
            System.out.println("City: " + departments[i].getCity());
            System.out.println("Department In Charge (HOD): " + departments[i].getDepartmentInCharge().getName() + 
                               " (" + departments[i].getDepartmentInCharge().getDesignation() + ")");

            Lab[] deptLabs = departments[i].getLabs();
            for (int j = 0; j < deptLabs.length; j++) {
                System.out.println("\nLab: " + deptLabs[j].getLabName());
                System.out.println("Number of Computers: " + deptLabs[j].getNumberOfComputers());
                System.out.println("Lab Address: " + deptLabs[j].getLabAddress());

                Computer[] labComputers = deptLabs[j].getComputers();
                for (int k = 0; k < labComputers.length; k++) {
                    System.out.println("RAM: " + labComputers[k].getRam() + ", Disk Size: " + labComputers[k].getDiskSize() + ", Core: " + labComputers[k].getCore());
                }
            }
        }
    }
}
