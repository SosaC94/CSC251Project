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
  //  @param policyNumberA The policy number.
  //  @param providerNameA The provider/company name.
  //  @param firstNameA The policyholder's first name.
  //  @param lastNameA The policyholder's last name.
  //  @param ageA The policyholder's age.
  //  @param smokingStatusA The policyholder's smoking status.
  //  @param heightA The policyholder's height (in inches).
  //  @param weightA The policyholder's weight (in pounds).
   
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
  // @param value The policy number
  
  public void setPolicyNumber(int value)
  {
   policyNumber = value;
  }
  
  // @return The policy number
  
  public int getpolicyNumber()
  {
   return policyNumber;
  }
  
  
  
  // Provider Name
  // @param value The provider name
  public void setProviderName(String value)
  {
   providerName = value;
  }
  
  // @return The provider name
  
  public String getproviderName()
  {
   return providerName;
  }
  
  // Policy Holder First Name
  // @param value The policy holder first name
  public void setpolicyholderFirstName(String value)
  {
   policyholderFirstName = value;
  } 
  
  //@return The policy holder first name
  
  public String getpolicyholderFirstName()
  {
   return policyholderFirstName;
  }
  
  // Policy Holder Last Name
  // @param value The policy holder last name
  public void setpolicyholderLastName(String value)
  {
   policyholderLastName = value;
  }
  
  // @return The policy holder last name 
  
  public String getpolicyholderLastName()
  {
   return policyholderLastName;
  }
  
  // Policy Holder Age
  // @param value Policy holder age
  public void setpolicyholderAge(int value)
  {
   policyholderAge = value;
  } 
  
  // @return Policy Holder Age
  
  public int getpolicyholderAge()
  {
   return policyholderAge;
  }
  
  // Policy Holder Smoking Status
  // @param value Policy holder smoking status
  public void setpolicyholderSmokingStatus(String value)
  {
   policyholderSmokingStatus = value;
  } 
  
  // @return Policy holder smoking status
  
  public String getpolicyholderSmokingStatus()
  {
   return policyholderSmokingStatus;
  }
  
  // Policy Holder Height
  // @param value The policy holder height
  public void setpolicyholderHeight(int value)
  {
   policyholderHeight = value;
  } 
  
  // @return policy holder height
  
  public double getpolicyholderHeight()
  {
   return policyholderHeight;
  }
  
  // Policy Holder Weight
  // @param The policy holder weight
  public void setpolicyholderWeight(int value)
  {
   policyholderWeight = value;
  } 
  
  // @ return The policy holder weight
  
  public double getpolicyholderWeight()
  {
   return policyholderWeight;
  }
  
 // Get BMI
 // @return Policy Holder BMI or 0 if height is invalid.
 
 public double getBMI()
 {
   if(policyholderHeight <= 0) return 0.0;
   return (policyholderWeight * 703.0)/(policyholderHeight * policyholderHeight);
 }
 
 //Policy Price
 // @return The policy price
 
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
}
      
  
  
 
   
   