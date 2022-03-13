package easy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch_1700 {
	public int countStudents(int[] students, int[] sandwiches) {
		Queue<Integer> q = new LinkedList<>();
		for (int student : students) {
			q.offer(student);
		}

		int index = 0;
		int studentsTried = 0;

		while (!q.isEmpty()) {
			int student = q.poll();
			if (student == sandwiches[index]) {
				index++;
				studentsTried = 0;
			} else {
				studentsTried++;
				q.offer(student);
			}

			if (studentsTried == q.size()) {
				break;
			}
		}

		return q.size();
	}
}
