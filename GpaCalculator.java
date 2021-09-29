//import ALL
import javafx.application.Application; 
import javafx.geometry.Pos; 
import javafx.geometry.HPos; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.GridPane; 
import javafx.stage.Stage;

public class GpaCalculator extends Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
	// Text Field 
	// Input
	private TextField tfCourseName1  = new TextField();
	private TextField tfCourseName2  = new TextField();
	private TextField tfCourseName3  = new TextField();
	private TextField tfCourseName4  = new TextField();

	private TextField tfGrade1	     = new TextField();
	private TextField tfGrade2       = new TextField();
	private TextField tfGrade3       = new TextField();
	private TextField tfGrade4       = new TextField();
	
	private TextField tfCredit1	     = new TextField();
	private TextField tfCredit2      = new TextField();
	private TextField tfCredit3      = new TextField();
	private TextField tfCredit4      = new TextField();
	
	private TextField tfGPA			 = new TextField();

	// Output
	private TextField tfCumulativeGpa = new TextField();

	// Button
	private Button 	  btCalculate 	  = new Button("Calculate GPA");
	
//create stage
	@Override
	public void start(Stage primaryStage) {
		// Create pane
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		// Add nodes to Pane (e.g Text Fields, Labels, Buttons)
		gridPane.add(new Label("Course Name 1: "), 0, 0);
		gridPane.add(tfCourseName1, 1, 0);
		gridPane.add(new Label("Course Name 2: "), 0, 1); 
		gridPane.add(tfCourseName2, 1, 1);
		gridPane.add(new Label("Course Name 3: "), 0, 2);
		gridPane.add(tfCourseName3, 1, 2);
		gridPane.add(new Label("Course Name 4: "), 0, 3);
		gridPane.add(tfCourseName4, 1, 3);
		
		gridPane.add(new Label("Course Grade 1: "), 2, 0);
		gridPane.add(tfGrade1, 3, 0);
		gridPane.add(new Label("Course Grade 2: "), 2, 1);
		gridPane.add(tfGrade2, 3, 1);
		gridPane.add(new Label("Course Grade 3: "), 2, 2);
		gridPane.add(tfGrade3, 3, 2);
		gridPane.add(new Label("Course Grade 4: "), 2, 3);
		gridPane.add(tfGrade4, 3, 3);
		
		gridPane.add(new Label("Credit Hours 1: "), 4, 0);
		gridPane.add(tfCredit1, 5, 0);
		gridPane.add(new Label("Credit Hours 2: "), 4, 1);
		gridPane.add(tfCredit2, 5, 1);
		gridPane.add(new Label("Credit Hours 3: "), 4, 2);
		gridPane.add(tfCredit3, 5, 2);
		gridPane.add(new Label("Credit Hours 4: "), 4, 3);
		gridPane.add(tfCredit4, 5, 3);
		
		//space for GPA to display
		gridPane.add(tfGPA, 6, 6);
		//space for button
		gridPane.add(btCalculate, 5, 6); 
		
		//make it look nice
		gridPane.setAlignment(Pos.CENTER);
		tfCourseName1.setAlignment(Pos.BOTTOM_LEFT);
		tfCourseName2.setAlignment(Pos.BOTTOM_LEFT);
		tfCourseName3.setAlignment(Pos.BOTTOM_LEFT);
		tfCourseName4.setAlignment(Pos.BOTTOM_LEFT);
		
		tfGrade1.setAlignment(Pos.BOTTOM_CENTER);
		tfGrade2.setAlignment(Pos.BOTTOM_CENTER);
		tfGrade3.setAlignment(Pos.BOTTOM_CENTER);
		tfGrade4.setAlignment(Pos.BOTTOM_CENTER);
		
		tfCredit1.setAlignment(Pos.BOTTOM_RIGHT);
		tfCredit2.setAlignment(Pos.BOTTOM_RIGHT);
		tfCredit3.setAlignment(Pos.BOTTOM_RIGHT);
		tfCredit4.setAlignment(Pos.BOTTOM_RIGHT);
			
		GridPane.setHalignment(btCalculate, HPos.RIGHT);

		// Register event on source object
		btCalculate.setOnAction(e -> calculateGPA());

		// Create Scene
	Scene scene = new Scene(gridPane, 1100, 250);
	primaryStage.setTitle("GPA CALCULATOR");
	primaryStage.setScene(scene);

		// Display Stage
	primaryStage.show();
	}
	
	//calculateGPA
	private void calculateGPA() {
		//get input text
		String[] courseNames = {tfCourseName1.getText(),tfCourseName2.getText(),tfCourseName3.getText(),tfCourseName4.getText()};
		double[] CourseCreditHours = {Double.parseDouble(tfCredit1.getText()),Double.parseDouble(tfCredit2.getText()),Double.parseDouble(tfCredit3.getText()),Double.parseDouble(tfCredit4.getText())};
		String[] CourseGrades = {tfGrade1.getText(),tfGrade2.getText(),tfGrade3.getText(),tfGrade4.getText()};
		
		//create instance
		CourseSchedule courseSchedule = new CourseSchedule(courseNames, CourseCreditHours, CourseGrades);
		
		//print!!!!
		tfGPA.setText(String.format("%.2f", courseSchedule.getGPA(CourseGrades, CourseCreditHours)));

	}	
}
