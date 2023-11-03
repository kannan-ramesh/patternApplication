
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		   Scanner sc = new Scanner(System.in);

	        while (true) {
	            File directory = new File("com.kannanrameshrk/");
	            String[] files = directory.list();
	            
	            displayFolder(files);
	           
	            System.out.println("   Exit press '0':");
	            System.out.println("select folder:");
	            System.out.println("------------------");
	            int packageChoice = sc.nextInt();
	            
	            if (packageChoice == 0) {
	                System.out.println("Exiting the program.");
	                break; // Exit the loop
	            }
	            
	            if (packageChoice < 1 || packageChoice > files.length) {
	                System.out.println("Invalid choice. Please try again.");
	                continue;
	            }

	            File selectedPackage = new File(directory, files[packageChoice - 1]);
	            
	            if (!selectedPackage.isDirectory()) {
	                System.out.println("Not a valid folder. Please select a valid folder.");
	                continue;
	            }

	            File[] packageFiles = selectedPackage.listFiles();

	            System.out.println("Select a class to run:");
	            
	            if (packageFiles == null || packageFiles.length == 0) {
	                System.out.println("No .class files found in the selected package.");
	            } else {
	            	System.out.println("------------------------------------");
	                for (int i = 0; i < packageFiles.length; i++) {
	                    String className = packageFiles[i].getName();
	                    System.out.printf("|%2d. %-30s|\n", i + 1, className.substring(0,className.length()-5));
	                }
	              System.out.println("------------------------------------");
	            }
	            
	            
	            System.out.println("Enter your choice: ");
	            int classChoice = sc.nextInt();
	            if (classChoice < 1 || classChoice > packageFiles.length) {
	                System.out.println("Invalid choice. Please try again.");
	                continue;
	            }

	            String className = packageFiles[classChoice - 1].getName();
	            className = className.substring(0,className.length()-5);
	            Class<?> cls = Class.forName(files[packageChoice - 1] + "." + className);
	            Method method = cls.getDeclaredMethod("print", null);
	            method.invoke(null,null);
	        }
	}

	private static void displayFolder(String[] files) {
		 System.out.println("Select a folder (package):");
         System.out.println("------------------------------");
         
         for (int i = 0; i < files.length; i++) {
             System.out.printf("%d. %s\n", i + 1, files[i]);
         }
		
	}

}
