import java.util.Scanner;

public class poisedProject {

    public static void main(String[] args)
    {
    // Variables for information to be requested for customer + architect + contractor
        String customerName;
        String customerSurname;
        int customerNum;
        String customerEmail;
        String customerAddress;

        String architectName;
        String architectSurname;
        int architectNum;
        String architectEmail;
        String architectAddress;

        String contractorName;
        String contractorSurname;
        int contractorNum;
        String contractorEmail;
        String contractorAddress;

 // input
        Scanner input = new Scanner(System.in);

//----------------- Customers information requested
        System.out.println("Please enter the customers first name");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        customerName = input.nextLine();

        System.out.println("Please enter the customers second name");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        customerSurname = input.nextLine();

        System.out.println("Please enter the customer phone number");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        customerNum = input.nextInt();

        System.out.println("Please enter the customer email");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        customerEmail = input.nextLine();

        System.out.println("Please enter the customer address");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        customerAddress = input.nextLine();
        System.out.println("\n");

 // user-defined data type - staffDetails
 // New object called - customer - created in StaffDetails - class
        staffDetails customer = new staffDetails(customerName, customerSurname, customerNum, customerEmail, customerAddress);

 // Printed out Customers details and the toString method for new object - customer - created.
        System.out.println("Customers details:");
        System.out.println(customer.toString());
        System.out.println("\n");

//----------------- Architects information requested
        System.out.println("Please enter the Architects first name");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        architectName = input.nextLine();

        System.out.println("Please enter the Architects second name");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        architectSurname = input.nextLine();

        System.out.println("Please enter the Architects phone number");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        architectNum = input.nextInt();

        System.out.println("Please enter the Architects email");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        architectEmail = input.nextLine();

        System.out.println("Please enter the Architects address");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        architectAddress = input.nextLine();
        System.out.println("\n");

 // user-defined data type - staffDetails
 // New object called  - architect - created in StaffDetails - class
        staffDetails architect = new staffDetails(architectName, architectSurname, architectNum, architectEmail, architectAddress);

 // Printed out Architects details and the toString method for new object - architect - created.
        System.out.println("Architects details:");
        System.out.println(architect.toString());
        System.out.println("\n");

//----------------- Contractors information requested
        System.out.println("Please enter the Contractors first name");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        contractorName = input.nextLine();

        System.out.println("Please enter the Contractors second name");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        contractorSurname = input.nextLine();

        System.out.println("Please enter the Contractors phone number");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        contractorNum = input.nextInt();

        System.out.println("Please enter the Contractors email");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        contractorEmail = input.nextLine();

        System.out.println("Please enter the Contractors address");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        contractorAddress = input.nextLine();
        System.out.println("\n");

 // user-defined data type - staffDetails
 // New object called - contractor - created in StaffDetails - class
        staffDetails contractor = new staffDetails(contractorName, contractorSurname, contractorNum, contractorEmail, contractorAddress);

// Printed out Contractors details and the toString method for new object - Contractor - created.
        System.out.println("Contractor details:");
        System.out.println(contractor.toString());
        System.out.println("\n");



            //==================| Creating project |===================\\

 // Variables for information to be requested for project to be created
        int projectNumber = 0;
        String buildingType = null;
        String projectName = null;
        String buildingLocation = null;
        int ERF = 0;
        int totalCost = 0;
        int totalAmountPaidCurrently = 0;
        String deadline = null;

 //----------------- Project information requested
        System.out.println("Please enter the project number");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        projectNumber = input.nextInt();

        System.out.println("Please enter the building type");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        buildingType = input.nextLine();

        System.out.println("Please enter the project name (leave blank for auto generate): ");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        projectName = input.nextLine();

 // IF statement run if user selects to leave the project name blank = auto generation of a project name
        if (projectName.equals(""))
        {
            projectName = buildingType + " " + customerSurname; // project name autogenerated if user selects to leave the project name blank
        }

        System.out.println("Please enter the building location: ");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        buildingLocation = input.nextLine();

        System.out.println("Please enter the ERF number: ");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        ERF = input.nextInt();

        System.out.println("Please enter the total cost of project");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        totalCost = input.nextInt();

        System.out.println("Please enter the total amount paid to date: ");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        totalAmountPaidCurrently = input.nextInt();

        System.out.println("Please enter the project deadline: ");
        input = new Scanner(System.in); //Clears the scanner so we don't skip lines
        deadline = input.nextLine();
        System.out.println("\n");

 // user-defined data type - projectDetails
 // New object called - newProject - created in projectDetails - class
        projectDetails newProject = new projectDetails(projectNumber, projectName, buildingType, buildingLocation, ERF, totalCost, totalAmountPaidCurrently, deadline);

 // Printed out Project details and the toString method on new object - Project - created
        System.out.println(newProject.toString());
        System.out.println("\n");



//-----------| Print menu |--------------
        while (true)
        {
            String menuSelection;
            input = new Scanner(System.in); // user input requested based on menu options listed below


            System.out.println("Menu:");
            System.out.println("1 - Change due date of project");
            System.out.println("2 - Change total amount of the fee paid to date");
            System.out.println("3 - Update the contractors contact details");
            System.out.println("4 - Quit");

            menuSelection = input.nextLine();  // String menuSelection is equal to users input

 // If user selects '1' - from the menu, they will be able to update the project deadline
            if (menuSelection.equals("1"))
            {
                System.out.println("Please enter the new project deadline: ");
                input = new Scanner(System.in); //Clears the scanner so we don't skip lines
                deadline = input.nextLine();
                System.out.println("\n");

 // New object called - projectUpdated - created - in projectDetails class
                projectDetails projectUpdated = new projectDetails(projectNumber, projectName, buildingType, buildingLocation, ERF, totalCost, totalAmountPaidCurrently, deadline);

 // Printed out toString method for new object - projectUpdated - created with the updated project deadline
                System.out.println(projectUpdated.toString());
                System.out.println("\n");
            }

 // If user selects '2' - from the menu, they will be able to update the total amount paid to date
            if (menuSelection.equals("2"))
            {
                System.out.println("Please enter the total amount paid to date: ");
                input = new Scanner(System.in); //Clears the scanner so we don't skip lines
                totalAmountPaidCurrently = input.nextInt();
                System.out.println("\n");

 // New object called - projectUpdated - created - in projectDetails class
                projectDetails projectUpdated = new projectDetails(projectNumber, projectName, buildingType, buildingLocation, ERF, totalCost, totalAmountPaidCurrently, deadline);

 // Printed out toString method for new object - projectUpdated - created with the updated total amount paid to date
                System.out.println(projectUpdated.toString());
                System.out.println("\n");

            }

 // If user selects '3' - from the menu, they will be able to update the contractors details
            if (menuSelection.equals("3"))
            {
                System.out.println("Please update the contractors details: ");
                input = new Scanner(System.in); //Clears the scanner so we don't skip lines

                System.out.println("Please enter the Contractors first name");
                input = new Scanner(System.in); //Clears the scanner so we don't skip lines
                contractorName = input.nextLine();

                System.out.println("Please enter the Contractors second name");
                input = new Scanner(System.in); //Clears the scanner so we don't skip lines
                contractorSurname = input.nextLine();

                System.out.println("Please enter the Contractors phone number");
                input = new Scanner(System.in); //Clears the scanner so we don't skip lines
                contractorNum = input.nextInt();

                System.out.println("Please enter the Contractors email");
                input = new Scanner(System.in); //Clears the scanner so we don't skip lines
                contractorEmail = input.nextLine();

                System.out.println("Please enter the Contractors address");
                input = new Scanner(System.in); //Clears the scanner so we don't skip lines
                contractorAddress = input.nextLine();
                System.out.println("\n");

 // New object called - contractorUpdated - created - in staffDetails class
                staffDetails contractorUpdated = new staffDetails(contractorName, contractorSurname, contractorNum, contractorEmail, contractorAddress);

 // Printed out toString method for new object - contractorUpdated - created with the updated contractors details added
                System.out.println("Updated contractor  details:");
                System.out.println(contractorUpdated.toString());
                System.out.println("\n");

            }
 // If user selects '4' - from the menu, they will exit program
            if (menuSelection.equals("4"))
            {
                System.out.println("Goodbye! ");
                break;
            }

            }
    }
}