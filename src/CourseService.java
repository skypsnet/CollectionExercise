
import java.util.HashMap;

public class CourseService
{
    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, Course> courses = new HashMap<>();


    public CourseService()
    {
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudent(String studentId, String courseId){
        //TODO implement so it adds the given course form the student
    	Student studentData = students.get(studentId);
    	Course CourseEnroll = courses.get(courseId);
    	
    	studentData.enroll(CourseEnroll);
    	System.out.println("El alumno fue inscrito de forma correcta al curso");	
    }

    public void unEnrollStudent(String studentId, String courseId){
        //TODO implement so it removes the given course form the student
    	
    	Student studentData = students.get(studentId);
    	Course CourseEnroll = courses.get(courseId);
    	
    	studentData.unEnroll(CourseEnroll);
    	System.out.println("El alumno fue desinscrito de forma correcta al curso");	
    	
    }

    public void displayCourseInformation(String courseId){
        //TODO implement so it shows the course name, id and credits
    	Course CourseEnroll = courses.get(courseId);
    	
    	System.out.println("El nombre del curso es: "+CourseEnroll.name +" con el id: "+CourseEnroll.id+" y el número de creditos: "+String.valueOf(CourseEnroll.credits));
    	
    	
    }

    public void displayStudentInformation(String studentId){
        //TODO implement so it shows the student name, id and list of enrolled courses
    	Student studentData = students.get(studentId);
    	
    	System.out.println("El nombre del alumnos es: "+studentData.name+" el id es: "+studentData.id+"y la lista de cursos inscritos es la siguiente: ");
    	
    	studentData.enrolledCourses.forEach(n -> System.out.println(n));
 
    	
    }
    
    public void courseCredits(String studentId) {
    	Student studentData = students.get(studentId);
    	int creditototal=0;
    	
    	for(int i=0; i<studentData.enrolledCourses.size(); i++) {
    		creditototal+=studentData.enrolledCourses.get(i).credits;
    	}
    	
    	System.out.println("El numero de creditos del estudiante es: "+creditototal);
    }
    
    
    
    
    


}