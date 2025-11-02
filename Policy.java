import java.util.Scanner;

public class Policy
{
   // Variables
   private int policyNumber;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String policyholderSmokingStatus;
   private double policyholderHeight;
   private double policyholderWeight;
   
   // No-Arg Constructor
  public Policy() 
  {
   policyNumber = 0;
   providerName = "";
   policyholderFirstName = "";
   policyholderLastName = "";
   policyholderAge = 0;
   policyholderSmokingStatus = "non-smoker";
   policyholderHeight = 0;
   policyholderWeight = 0;
  }
  
  // Constructor
  public Policy(int policyNumberA, String providerNameA, String firstNameA, String lastNameA, int ageA, String smokingStatusA, double heightA, double weightA)
  {
   policyNumber = policyNumberA;
   providerName = providerNameA;
   policyholderFirstName = firstNameA;
   policyholderLastName = lastNameA;
   policyholderAge = ageA;
   policyholderSmokingStatus = smokingStatusA;
   policyholderHeight = heightA;
   policyholderWeight = weightA;
  }
  
  // Setters and Getters
  
  // Policy Number
  public void setPolicyNumber(int value)
  {
   policyNumber = value;
  }
 
  public int getpolicyNumber()
  {
   return policyNumber;
  }
  
  
  
  // Provider Name
  public void setProviderName(String value)
  {
   providerName = value;
  }
  
  public String getproviderName()
  {
   return providerName;
  }
  
  // Policy Holder First Name
  public void setpolicyholderFirstName(String value)
  {
   policyholderFirstName = value;
  } 
  
  public String getpolicyholderFirstName()
  {
   return policyholderFirstName;
  }
  
  // Policy Holder Last Name
  public void setpolicyholderLastName(String value)
  {
   policyholderLastName = value;
  } 
  
  public String getpolicyholderLastName()
  {
   return policyholderLastName;
  }
  
  // Policy Holder Age
  public void setpolicyholderAge(int value)
  {
   policyholderAge = value;
  } 
  
  public int getpolicyholderAge()
  {
   return policyholderAge;
  }
  
  // Policy Holder Smoking Status
  public void setpolicyholderSmokingStatus(String value)
  {
   policyholderSmokingStatus = value;
  } 
  
  public String getpolicyholderSmokingStatus()
  {
   return policyholderSmokingStatus;
  }
  
  // Policy Holder Height
  public void setpolicyholderHeight(int value)
  {
   policyholderHeight = value;
  } 
  
  public double getpolicyholderHeight()
  {
   return policyholderHeight;
  }
  
  // Policy Holder Weight
  public void setpolicyholderWeight(int value)
  {
   policyholderWeight = value;
  } 
  
  public double getpolicyholderWeight()
  {
   return policyholderWeight;
  }
  
 // Get BMI
 
 public double getBMI()
 {
   if(policyholderHeight <= 0) return 0.0;
   return (policyholderWeight * 703.0)/(policyholderHeight * policyholderHeight);
 }
 
 //Policy Price
 public double getpolicyPrice()
 {
   double price = 600.00;
   
   if(policyholderAge > 50)
   {
      price += 75.0;
   }
   
   String status;
   
   if (policyholderSmokingStatus == null)
   {
      status = "";
   }
   else
   {
      status = policyholderSmokingStatus.trim().toLowerCase();
   }
   
   if (status.equals("smoker"))
   {
      price += 100.0;
   }
   
   double bmi = getBMI();
   if (bmi > 35.0)
   {
      price += (bmi - 35.0) * 20.0;
   }
   
   return price;
   
 }
 
 // Main Method
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Policy Number: ");
        int policyNumber = in.nextInt();
        in.nextLine(); 

        System.out.print("Enter the Provider Name: ");
        String providerName = in.nextLine();

        System.out.print("Enter the Policyholder's First Name: ");
        String firstName = in.nextLine();

        System.out.print("Enter the Policyholder's Last Name: ");
        String lastName = in.nextLine();

        System.out.print("Enter the Policyholder's Age: ");
        int age = in.nextInt();
        in.nextLine(); 

        System.out.print("Enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = in.nextLine();

        System.out.print("Enter the Policyholder's Height (in inches): ");
        double height = in.nextDouble();

        System.out.print("Enter the Policyholder's Weight (in pounds): ");
        double weight = in.nextDouble();

       
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                                   age, smokingStatus, height, weight);

        
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Policy Details");
        System.out.println("Policy Number: " + policy.getpolicyNumber());
        System.out.println("Provider Name: " + policy.getproviderName());
        System.out.println("Policyholder Name: " + policy.getpolicyholderFirstName() + " " + policy.getpolicyholderLastName());
        System.out.println("Age: " + policy.getpolicyholderAge());
        System.out.println("Smoking Status: " + policy.getpolicyholderSmokingStatus());
        System.out.println("Height (in): " + policy.getpolicyholderHeight());
        System.out.println("Weight (lb): " + policy.getpolicyholderWeight());
        System.out.printf("BMI: %.2f%n", policy.getBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.getpolicyPrice());

        in.close();
    }
}
      
  
  
 
   
   