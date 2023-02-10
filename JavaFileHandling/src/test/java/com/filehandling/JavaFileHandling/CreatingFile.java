import java.io.File;
import java.io.IOException;

public class CreateFile {
	public satic void main(string[] args) {
		try {
			File myObj = new File("filename.txt");
			if (myObj.createNewFle()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("file already exist.");
			}
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}