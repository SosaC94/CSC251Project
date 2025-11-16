import java.io.*;
import java.util.*;

public class Project_Christian_Sosa
{
    public static void main(String[] args) throws IOException
    {
        // Create Array List
        ArrayList<Policy> policyList = new ArrayList<>();

        // Open Text Doc
        File polInfo = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(polInfo);

        // Loop to read text file & create object + add to ArrayList
       while (inputFile.hasNext())
         {
            int policyNumber = inputFile.nextInt();   
            inputFile.nextLine();   

             String providerName = inputFile.nextLine();  
             String firstName = inputFile.next();         
             String lastName = inputFile.next();          
             int age = inputFile.nextInt();             
             String smokingStatus = inputFile.next();    
             double height = inputFile.nextDouble();    
             double weight = inputFile.nextDouble();      

            Policy pol = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

            policyList.add(pol);
          }

        inputFile.close();

        // Display info
        for (Policy p : policyList)
        {
            System.out.println("-----------------------------------------------------");
            System.out.println("Policy Number: " + p.getpolicyNumber());
            System.out.println("Provider Name: " + p.getproviderName());
            System.out.println("Policyholder's First Name: " + p.getpolicyholderFirstName());
            System.out.println("Policyholder's Last Name: " + p.getpolicyholderLastName());
            System.out.println("Age: " + p.getpolicyholderAge());
            System.out.println("Smoking Status: " + p.getpolicyholderSmokingStatus());
            System.out.println("Height (in): " + p.getpolicyholderHeight());
            System.out.println("Weight (lb): " + p.getpolicyholderWeight());
            System.out.printf("BMI: %.2f%n", p.getBMI());
            System.out.printf("Policy Price: $%.2f%n", p.getpolicyPrice());
        }

        // Count Smokers vs. Non-Smokers
        int smokers = 0;
        int nonSmokers = 0;

        for (Policy p : policyList)
        {
            String status = p.getpolicyholderSmokingStatus().trim().toLowerCase();

            if (status.equals("smoker"))
                smokers++;
            else
                nonSmokers++;
        }

        System.out.println("\nNumber of Smokers: " + smokers);
        System.out.println("Number of Non-Smokers: " + nonSmokers);
    }
}
