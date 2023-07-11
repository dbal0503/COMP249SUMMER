package ProgramClasses;

public class GraduateProgram extends Program{
    private String coordinator;
    private static int creditCost;

    public GraduateProgram() {
        super();
    }
    public GraduateProgram(String name, String specialization, String[] requiredCourses, String[] electiveCourses, int totalCredits, String institution, String coordinator) {
        super(name, specialization, requiredCourses, electiveCourses, totalCredits, institution);
        this.coordinator = coordinator;
    }
    public GraduateProgram(GraduateProgram graduateProgramCopy) {
        super(graduateProgramCopy);//will call superclass constructor for the copy of the subclass
        this.coordinator=graduateProgramCopy.coordinator;
    }

}
