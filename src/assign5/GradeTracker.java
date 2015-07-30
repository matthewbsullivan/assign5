package assign5;

/**
 * GradeTracker returns an up to date GPA for Student s using
 * grading algorithm selection i in letter format (e.g. A=90+)
 * @author Matt Sullivan
 * @author Luis Rocha
 */
public class GradeTracker {

    public char getLetterGrade(Student s, int i) {
        double numGrade = s.getAverage(i);
        if (numGrade >= 90)
            return 'A';
        else if (numGrade >=80)
            return 'B';
        else if (numGrade >= 70)
            return 'C';
        else if (numGrade >= 60)
            return 'D';
        else return 'F';
    }
}
