import java.util.HashMap;
import java.util.List;

    public class Admin{
        public static HashMap<Key, Student> processStudents(List<Student> students) {
            HashMap<Key, Student> map = new HashMap<>();
            for (Student student : students) {
                Key key = new Key(student.getFirstName(), student.getLastName());
                map.put(key, student);
            }
            return map;
        }

        public static double computeAverageGPA(HashMap<Key, Student> maps) {
            double sum = 0.0;
            for (Student student : maps.values()) {
                sum += student.getGpa();
            }
            return sum / maps.size();
        }
}
