//course schedule class
public class CourseSchedule {
	//declar variables
	private String [] courseNames;
	private double [] CourseCreditHours;
	private String [] CourseGrades;
	
	//constructors as arrays
public CourseSchedule(String [] courseNames, double [] courseCreditHours, String [] courseGrades) {
		this.courseNames = new String [4];
		this.CourseCreditHours = new double [4];
		this.CourseGrades = new String [4]; 
	}
//getters and setters
	public String [] getCourseNames() {
		return courseNames;
	}

	public void setCourseNames(String [ ] courseNames) {
		this.courseNames = courseNames;
	}


	public double[] getCourseCreditHours() {
		return CourseCreditHours;
	}


	public void setCourseCreditHours(double [] courseCreditHours) {
		this.CourseCreditHours = courseCreditHours;
	}


	public String [] getCourseGrades() {
		return CourseGrades;
	}



	public void setCourseGrades(String [] courseGrades) {
		this.CourseGrades = courseGrades;
	}


	//get GPA
	public static double getGPA(String [] courseGrades, double [] courseCreditHours) {
		//four classes so array is populated with four
		//gpa = total points/totalCreditHours

		//grade points - letter grades into gpa
		//coursepoints - letter grades * credit
		//total credit hours - all course credit

		//cumulative gpa = total paints / total credit hours

		double gpa, coursePoints, totalPoints = 0, totalCreditHours = 0;
		int gradePoints [ ] = new int [4]; //four courses
		
		//iterate through each course!!!
		for (int i = 0; i<4; i ++) {
			switch(courseGrades[i].toUpperCase()) {
			case "A":
				gradePoints[i] = 4;
				break;
			case "B":
				gradePoints[i] = 3;
				break;
			case "C":
				gradePoints[i] = 2;
				break;
			case "D":
				gradePoints[i] = 1;
				break;
			default:
				gradePoints[i] = 0;
			}
			
			coursePoints = courseCreditHours[i]*gradePoints[i];
			totalPoints = coursePoints + totalPoints;
			totalCreditHours = courseCreditHours[i] + totalCreditHours;
		}
		//final cumulative gpa
			gpa = (totalPoints/totalCreditHours);
			//return statement
			return gpa;
		
		
			}

		}