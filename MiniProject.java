/* **************************************
Author                     Jadid Alam
Student ID                  230407080
Date                       10/10/2023
version                             3

This program simulates an interaction
with the user about their pet
************************************* */

import java.io.*;     // imports every directory
import java.util.*;   // imports every directory

/* **************************************************
This record holds information about the user's pet.
*/
class PetRecord
{
    String name;
    String breed;
    String issue;
    double heightInCentimeters;
    double weighInKilograms;
    double BMI;
    double averageJumpHeight;
} //END PetRecord


public class MiniProject
{
    
    public static void main(String[] param) throws IOException
    {

        runVet();
        
        return;
        
    } //END main

    
    /* ***********************************************
    this method takes a string input and prints it out
    */
    public static void print(String message)
    {
        
        System.out.println(message);
        
        return;
        
    } //END print

    
    /* **************************************************
    This method prints the input argument and return the keyboard input
    */
    public static String ask(String question)
    {
        
        Scanner scanner = new Scanner(System.in);

        print(question);
        String ans = scanner.nextLine();
        
        return ans;
        
    } //END ask

    
    /* ********************************************************
    This method only takes an double keyboard input and returns
    it, however if anything other than an double is inputted it
    asks the question again.
    */
    public static double askForValidDouble(String question)
    {
        boolean continueLoop = true;
        String answer = "INVALIDinput";
        double doubleAns = 0.0;
        
        while (continueLoop)
            {
                answer = ask(question);
    
                for (int i = 0; i < answer.length(); i++)
                    {
                        boolean conditionForValidFirstNumber = answer.charAt(i) == '0' || answer.charAt(i) =='1' || answer.charAt(i) == '2' || answer.charAt(i) =='3' || answer.charAt(i) == '4' || answer.charAt(i) =='5' || answer.charAt(i) == '6' || answer.charAt(i) =='7' || answer.charAt(i) == '8' || answer.charAt(i) =='9' || answer.charAt(i) == '-';
                        
                        boolean conditionForValidNumber = answer.charAt(i) == '0' || answer.charAt(i) =='1' || answer.charAt(i) == '2' || answer.charAt(i) =='3' || answer.charAt(i) == '4' || answer.charAt(i) =='5' || answer.charAt(i) == '6' || answer.charAt(i) =='7' || answer.charAt(i) == '8' || answer.charAt(i) =='9' || answer.charAt(i) == '.';
                        
                        if (i == 0)
                        {
                            if (!conditionForValidFirstNumber)
                            {
                                print("Please input a valid double number!");
                                break;
                            }
                            else if (answer.length() == 1 && conditionForValidFirstNumber)
                            {
                                continueLoop = false;
                            }
                        }
                        else
                        {
                            if (!conditionForValidNumber)
                            {
                                print("Please input a valid double number!");
                                continueLoop = true;
                                
                                break;
                            }
                            else
                            {
                                continueLoop = false;
                            }
                        }
                    }
            }
    
        if (continueLoop == false)
        {
            doubleAns = Double.parseDouble(answer);
        }
        
        return doubleAns;       
    } //END askForValidDouble

    
    /* ********************************************************
    This method stores an inputted name into the correspoding
    variable in the inputted pet record
    */
    public static PetRecord set_Pet_Name(PetRecord p, String name)
    {
        p.name = name;

        return p;
    } //END set_Pet_Name


    /* ********************************************************
    This method stores an inputted breed into the correspoding
    variable in the inputted pet record
    */
    public static PetRecord set_Pet_Breed(PetRecord p, String breed)
    {
        p.breed = breed;
        
        return p;
    } //END set_Pet_Breed


    /* ********************************************************
    This method stores an inputted issue into the correspoding
    variable in the inputted pet record
    */
    public static PetRecord set_Pet_Issue(PetRecord p, String issue)
    {
        p.issue = issue;
        
        return p;
    } //END set_Pet_Issue


    /* ********************************************************
    This method stores an inputted height in cm into the correspoding
    variable in the inputted pet record
    */
    public static PetRecord set_Pet_HeightInCentimeters(PetRecord p, double heightInCentimeters)
    {
        p.heightInCentimeters = heightInCentimeters;
        
        return p;
    } //END set_Pet_HeightInCentimeters


    /* ********************************************************
    This method stores an inputted weight in kg into the correspoding
    variable in the inputted pet record
    */
    public static PetRecord set_Pet_weighInKilograms(PetRecord p, double weighInKilograms)
    {
        p.weighInKilograms = weighInKilograms;
        
        return p;
    } //END set_Pet_weighInKilograms
    

    /* ********************************************************
    This method stores an inputted BMI into the correspoding
    variable in the inputted pet record
    */
    public static PetRecord set_Pet_BMI(PetRecord p, double BMI)
    {
        p.BMI = BMI;
        
        return p;
    } //END set_Pet_BMI


    /* ********************************************************
    This method stores an inputted average jump height into the
    correspoding variable in the inputted pet record
    */
    public static PetRecord set_Pet_averageJumpHeight(PetRecord p, double averageJumpHeight)
    {
        p.averageJumpHeight = averageJumpHeight;
        
        return p;
    } //END set_Pet_AverageJumpHeight


    /* ********************************************************
    This method gets pet name from an inputted pet record and
    returns it as a string value
    */
    public static String get_Pet_Name(PetRecord p)
    {
        return p.name;
    } //END get_Pet_Name


    /* ********************************************************
    This method gets pet breed from an inputted pet record and
    returns it as a string value
    */
    public static String get_Pet_Breed(PetRecord p)
    {
        return p.breed;
    } //END get_Pet_Breed


    /* ********************************************************
    This method gets pet issue from an inputted pet record and
    returns it as a string value
    */
    public static String get_Pet_Issue(PetRecord p)
    {
        return p.issue;
    } //END get_Pet_Issue


    /* ********************************************************
    This method gets pet height in cm from an inputted pet record
    and returns it as a double value
    */
    public static double get_Pet_HeightInCentimeters(PetRecord p)
    {
        return p.heightInCentimeters;
    } //END get_Pet_HeightInCentimeters


    /* ********************************************************
    This method gets pet weight in kg from an inputted pet record
    and returns it as a double value
    */
    public static double get_Pet_weighInKilograms(PetRecord p)
    {
        return p.weighInKilograms;
    } //END get_Pet_weighInKilograms
    

    /* ********************************************************
    This method gets pet BMI from an inputted pet record and
    returns it as a double value
    */
    public static double get_Pet_BMI(PetRecord p)
    {
        return p.BMI;
    } //END get_Pet_BMI


    /* ********************************************************
    This method gets average jump height from an inputted pet 
    record and returns it as a double value
    */
    public static double get_Pet_averageJumpHeight(PetRecord p)
    {
        return p.averageJumpHeight;
    } //END get_Pet_averageJumpHeight

    
    /* *****************************************************
    This method takes in a length in centimeters and converts 
    it into length in inches
    */
    public static Double cm_to_inch(Double value)
    {
        final Double cmToInchConst = 2.54;
        
        value /= cmToInchConst;
        
        return value;
    } // END cm_to_inch

    
    /* *****************************************************
    This method takes in a mass in kilograms and converts it 
    into mass in pounds
    */
    public static Double kg_to_lb(Double value)
    {
        final Double kgToLbConst = 0.45;
        
        value /= kgToLbConst;

        return value;
    } // END kg_to_lb

    
    /* *****************************************************
    This method takes an unrounded value as an input and returns 
    a value rounded to 1 decimal place
    */
    public static Double oneDecimalPlace(Double value)
    {
        Double temp;
        final Double constantTen = 10.0;
        
        temp = value * constantTen;
        value = Math.round(temp)/constantTen;
        
        return value;
    } // END oneDecimalPlace

    
    /* ******************************************************
    This method calculates BMI of the pet by taking height in 
    inches and weigh in pounds as an input
    */
    public static Double BMI_calculator(Double height, Double weigh)
    {
        Double BMI;
        Double temp1;

        temp1 = weigh/height;
        BMI = oneDecimalPlace(temp1);
        
        return BMI;
    } //END BMI_calculator

    
    /* ********************************************************
    This method takes in BMI and decides wether the pet is healty or not
    */
    public static void isItHealthy(Double BMI)
    {
        if (BMI < 1.0 && BMI > 0)
        {
            print("Oh no, your pet is very underweight");
            return;
        }
        else if (BMI >= 1.0 && BMI <= 2.0)
        {
            print("Fantastic! Your pet has a healthy body.");
            return;
        }
        else if (BMI > 2.0)
        {
            print("Unfortunately your pet seems to be obese.");
            return;
        }
        else
        {
            print("Looks like there was a mistake somewhere");
            return;
        }
        
    } // END isItHealthy

    
    /* ******************************************************
    This method asks for a positive number until a positive number
    is inputted.
    */
    public static Double askForPositiveNumber(String message)
    {
        Double ans = -1.0;
        
        while (ans < 0.0)
        {
            Double value = askForValidDouble(message);

            if (value < 0)
            {
                print("Please entre a prositive value!");
            }
            else
            {
                ans = value;
            }
        }
    
        return ans;
    } //END askForPositiveNumber


    /* ********************************************************
    This method prints the percentage difference between each jumps
    */
    public static void printPercentageDifference(double[] jumpHeights)
    {
        for (int i = 0; i < jumpHeights.length; i++)
            {
            print("The percentage difference from each reading is:");
            
            for (int j = 0; j < jumpHeights.length; j++)
                {
                    print("reading " + (i+1) + " and reading " + (j+1) + ": " +  percentageDifferenceCalc(jumpHeights[i],jumpHeights[j]) + "%");
                }
            }
        
        return;
    } // printPercentageDifference

    
    /* ********************************************************
    This method calculates the percentage difference between two
    values and returns it.
    */
    public static double percentageDifferenceCalc(double value1, double value2)
    {
        double percentage = ((value1/value2) - 1.0)*100;
        
        percentage = oneDecimalPlace(percentage);
        
        return percentage;
    } // percentageDifferenceCalc
    

    /* ********************************************************
    This method receives several positive jump heights from the user
    and prints the average jump height
    */
    public static void testJumpHeight(PetRecord pet,String IOFile) throws IOException                             
    {
        final boolean append = true;
        final int numOfJumps = 3;
        double[] jumpHeights = new double[numOfJumps];
        double meanJumpHeight = get_Pet_averageJumpHeight(pet);
        
        print("Why don't we move on to testing average jump height");
        print("Can you make your pet to jump " + numOfJumps + " times and tell me the height of the jumps in cm?");
        
        if (meanJumpHeight == 0)
        {
            for (int i = 0; i < numOfJumps; i++)
            {
                jumpHeights[i] = askForPositiveNumber("What is the reading of jump number " + (i + 1) + "?"); 
            }

            meanJumpHeight = averageFromDoubleArray(jumpHeights);

            printPercentageDifference(jumpHeights);
            
            pet = set_Pet_averageJumpHeight(pet, meanJumpHeight);
        }
        
        write(Double.toString(get_Pet_averageJumpHeight(pet)),IOFile,append);
        print("So your pet's average jump height is: " + oneDecimalPlace(get_Pet_averageJumpHeight(pet)));
        
        return;
    } //END testJumpHeight
    

    /* ********************************************************
    This method gets an average from a double array and returns it
    */
    public static Double averageFromDoubleArray(double[] array)
    {
        Double total = 0.0;
        Double average;

        for (int i = 0; i < array.length; i++)
            {
                total += array[i];
            }
        
        average = total/array.length;
        
        return average;
    } //END averageFromDoubleArray
    

    /* ********************************************************
    This method asks the question if the string value inputted is null
    and returns the keyboard input, otherwise it returns the excisting value
    */
    public static String askIfEmptyString(String stringValue, String question)
    {
        if (stringValue == null)
        {
            return ask(question);
        }
        else
        {
            return stringValue;
        }

    } //END askIfEmptyString

    /* ********************************************************
    This method asks the question if the double value inputted is 0.0
    and returns the keyboard input, otherwise it returns the excisting value
    */
    public static Double askIfEmptyDouble(Double doubleValue, String question)
    {
        if (doubleValue == 0.0)
        {
            return askForPositiveNumber(question);
        }
        else
        {
            return doubleValue;
        }

    } //END askIfEmptyDouble

    /* ********************************************************
    This method takes in a read string value, if the value is null
    then it returns double value 0.0 else it converts the string to 
    double and returns it.
    */
    public static double ifNullReturnZero(String stringValue)
    {
        if (stringValue == null)
        {
            return 0.0;
        }
        else
        {
            return Double.parseDouble(stringValue);
        }
    
    } //END ifNullReturnZero


    /* ********************************************************
    This method writes an inputted value to a given IO file and it
    appends if the input for it is true.
    */
    public static void write(String valueToWrite, String IOFile, boolean append) throws IOException
    {
        PrintWriter writer = new PrintWriter(new FileWriter(IOFile,append));
        
        writer.println(valueToWrite);

        writer.close();
        return;
    } //END write

    
    /* ********************************************************
    This method takes in the the value in the first line of the file
    and if it is "1" then it clears the file and stores "1"
    */
    public static void filePrep(String IOFile, String firstLine) throws IOException
    {
        final String noOfPets = "1";
        final boolean notAppend = false;
        
        if (firstLine.equals("1"))
        {
            write(noOfPets,IOFile,notAppend);
        }

        return;
    } //END filePrep


    /* ********************************************************
    This method reads a file, then stores the values in the file
    inside a record, and returns that record
    */
    public static PetRecord read(String IOFile) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(IOFile));
        PetRecord pet = new PetRecord();
        String readFirstLine;

        readFirstLine = reader.readLine();

        filePrep(IOFile,readFirstLine);

        pet = set_Pet_Name(pet, reader.readLine());
        pet = set_Pet_Breed(pet, reader.readLine());
        pet = set_Pet_Issue(pet, reader.readLine());
        pet = set_Pet_HeightInCentimeters(pet, ifNullReturnZero(reader.readLine()));
        pet = set_Pet_weighInKilograms(pet, ifNullReturnZero(reader.readLine()));
        pet = set_Pet_BMI(pet, ifNullReturnZero(reader.readLine()));
        pet = set_Pet_averageJumpHeight(pet, ifNullReturnZero(reader.readLine()));
            
        reader.close();

        return pet;
    } //END readOrWrite
    
    
    /****************************************************
    This method utilises other methods for the vet to have a 
    conversation with the user about their pet
    */
    public static void petTalk(PetRecord pet, String IOFile) throws IOException
    {
        final boolean append = true;
        String name = get_Pet_Name(pet);
        String breed = get_Pet_Breed(pet);
        String issue = get_Pet_Issue(pet);
        
        print("Hello I am Sam.");
        print("I am a veterinarian that will help you with your issue");
        
        pet = set_Pet_Name(pet, askIfEmptyString(name,"what is your pet's name?"));
        name = get_Pet_Name(pet);
        write(name,IOFile,append);

        pet = set_Pet_Breed(pet, askIfEmptyString(breed,"What breed might your pet be?"));
        breed = get_Pet_Breed(pet);
        write(breed,IOFile,append);

        pet = set_Pet_Issue(pet, askIfEmptyString(issue,"What problems is your pet having right now?"));
        issue = get_Pet_Issue(pet);
        write(issue,IOFile,append);
        
        print("Ah I see, so " + name + " is a " + breed + " and the issue is that " + issue + ".");
        
        return;
    } // END petTalk

    
    /* *****************************************************
    This method utilises other methods to ask for the pet's
    height and weight, then calculate the pet's BMI
    */
    public static void pet_BMI(PetRecord pet,String IOFile) throws IOException
    {
        final boolean append = true;
        double height_cm = get_Pet_HeightInCentimeters(pet);
        double weight_kg = get_Pet_weighInKilograms(pet);
        double height_inch;
        double weight_lb;
        double BMI;

        pet = set_Pet_HeightInCentimeters(pet, askIfEmptyDouble(height_cm,"How long is your pet from shoulder to tail in centimeters?"));
        height_cm = get_Pet_HeightInCentimeters(pet);
        write(Double.toString(height_cm),IOFile,append);

        pet = set_Pet_weighInKilograms(pet, askIfEmptyDouble(weight_kg,"How much does your pet's weigh in kilograms?"));
        weight_kg = get_Pet_weighInKilograms(pet);
        write(Double.toString(weight_kg),IOFile,append);

        height_inch = cm_to_inch(height_cm);
        weight_lb = kg_to_lb(weight_kg);

        BMI = BMI_calculator(height_inch, weight_lb);
        pet = set_Pet_BMI(pet, BMI);
        write(Double.toString(BMI),IOFile,append);

        print("So your pet is " + oneDecimalPlace(height_cm) + " cm long and weighs " + oneDecimalPlace(weight_kg) + "kg");
        print("The BMI calculation is completed and your pet's BMI is: " + get_Pet_BMI(pet));

        isItHealthy(BMI);
        
        return;
    } // END pet_BMI

    
    /* ********************************************************
    This method runs different methods to run the whole program in the right order
    */
    public static void runVet() throws IOException
    {
        final boolean notAppend = false;
        final String IOFile = "Vet8-IO-file.txt";

        File isFileThere = new File("Vet8-IO-file.txt");

        if (!(isFileThere.exists()))
        {
            write("1", IOFile, notAppend);
        }
        
        PetRecord pet = new PetRecord();
       
        pet = read(IOFile);
        
        petTalk(pet,IOFile);
        pet_BMI(pet,IOFile);
        testJumpHeight(pet,IOFile);
        
        write("1", IOFile, notAppend);
        
        return;
    } //END runVet

    
} // END MiniProject