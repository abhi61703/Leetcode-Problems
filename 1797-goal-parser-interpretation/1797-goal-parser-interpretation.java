class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder(command);
        if(command.contains("G")){
            command = command.replace("G", "G");
        }
        if(command.contains("()")){
            command = command.replace("()", "o");
        }
        if(command.contains("(al)")){
            command = command.replace("(al)","al");
        }
        return command;
    }
}