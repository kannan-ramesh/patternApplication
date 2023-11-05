
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

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

			displayClass(packageFiles, files, packageChoice);

		}
	}

	private static void displayClass(File[] packageFiles, String[] files, int packageChoice) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("Select a class to run:");

		if (packageFiles == null || packageFiles.length == 0) {
			System.out.println("No .class files found in the selected package.");
		} else {
			System.out.println("------------------------------------");
			for (int i = 0; i < packageFiles.length; i++) {
				String className = packageFiles[i].getName();
				System.out.printf("|%2d. %-30s|\n", i + 1, className.substring(0, className.length() - 5));
			}
			System.out.println("------------------------------------");
		}
		
		
		
		System.out.println("press '0' to Back.. select classs any press (1)");
		int back =sc.nextInt();
		
		if(back == 0) {
			displayFolder(files);
		}else {
			runProgram(packageFiles,files, packageChoice);
		}
	}

	private static void runProgram(File[] packageFiles, String[] files, int packageChoice) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("Enter file No ex(1,2): ");
		int classChoice = sc.nextInt();
		if (classChoice < 1 || classChoice > packageFiles.length) {
			System.out.println("Invalid choice. Please try again.");

		}

		String className = packageFiles[classChoice - 1].getName();
		className = className.substring(0, className.length() - 5);
		Class<?> cls = Class.forName(files[packageChoice - 1] + "." + className);
		Method method = cls.getDeclaredMethod("print", null);
		method.invoke(null, null);
		
		System.out.println("press '0' to Back..");
		int back =sc.nextInt();
		
		if(back == 0) {
			displayClass(packageFiles, files, packageChoice);
		}else {
			System.out.println("please press '0' ");
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
