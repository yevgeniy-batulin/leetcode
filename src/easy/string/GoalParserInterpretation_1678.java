package easy.string;

public class GoalParserInterpretation_1678 {
	public String interpret(String command) {
		StringBuilder parsedCommand = new StringBuilder();
		for (int index = 0; index < command.length(); index++) {
			if (command.charAt(index) == 'G') {
				parsedCommand.append('G');
			} else if (command.charAt(index + 1) == ')') {
				parsedCommand.append('o');
				index++;
			} else {
				parsedCommand.append("al");
				index += 3;
			}
		}
		return parsedCommand.toString();
	}
}
